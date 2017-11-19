package com.qmall.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) //该注解只能用于方法
public @interface SystemLog {
    /**
     * 模块名称
     * @return
     */
    String module() default  "";

    /**
     * 方法名称
     * @return
     */
    String method() default  "";

    /**
     * 操作消息
     * @return
     */
    String  msg() default "";
}
