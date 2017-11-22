package com.qmall.aspects;

import com.qmall.annotation.SystemLog;
import com.qmall.user.entity.LogEntity;
import com.qmall.util.IPUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * 日志切面类
 */
@Component
@Aspect
public class LogAspect {
    /**
     * 记录日志
     * @param jp
     */
    @Around("execution(* com.qmall.controller..*Controller.addUser(..))")
    public Object systemLog(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("操作日志");
        Object obj = null;
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();

        LogEntity logEntity = new LogEntity();
        logEntity.setUsername("");//操作人
        logEntity.setRecordDate(new Date());//获取当前操作时间
        logEntity.setIp(IPUtil.getIpAddr(request));
        long startTime  = System.currentTimeMillis();//获取方法开始执行时间
        Object target = jp.getTarget(); //获取当前执行的控制器对象
        logEntity.setMethod(jp.getSignature().getName()); //获取当前执行的方法名称
        Object[] args = jp.getArgs();//获取方法的参数
        Signature sign = jp.getSignature();
        MethodSignature msig = (MethodSignature)sign;
        Method method = target.getClass().getMethod(sign.getName(),msig.getParameterTypes());
        if(method != null){
            if(method.isAnnotationPresent(SystemLog.class)){
                SystemLog systemLog = method.getAnnotation(SystemLog.class);
                logEntity.setModule(systemLog.module());
                logEntity.setMethod(systemLog.method());
                logEntity.setMsg(systemLog.msg());
                try{
                    obj = jp.proceed();
                    logEntity.setCommit("成功");
                    logEntity.setResponseTime(System.currentTimeMillis()-startTime);
                }catch (Exception e){
                    logEntity.setCommit("失败");
                    logEntity.setError(e.getLocalizedMessage());
                    logEntity.setResponseTime(System.currentTimeMillis()-startTime);
                }

            }else{
                obj = jp.proceed();//没有包含SystemLog注解的方法
            }
        }else{
            obj = jp.proceed();//不需要拦截，直接放行
        }
        System.out.println(logEntity);
        return obj;//返回目标方法的执行结果
    }
}
