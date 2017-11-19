package com.qmall.user.system.entity;

import java.io.Serializable;
import java.util.Date;

public class LogEntity implements Serializable{
    /**
     * 模块名称
     */
    private String module;
    /**
     * 方法名称
     */
    private String method;
    /**
     * 操作信息
     */
    private String msg;
    /**
     * ip地址
     */
    private String ip;
    /**
     * 操作用户
     */
    private String username;
    /**
     * 响应时间
     */
    private long responseTime;
    /**
     * 操作日期
     */
    private Date recordDate;

    /**
     * 操作结果
     */
    private String commit;

    public LogEntity() {
    }

    /**
     * 错误信息
     */
    private String error;

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(long responseTime) {
        this.responseTime = responseTime;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "LogEntity{" +
                "module='" + module + '\'' +
                ", method='" + method + '\'' +
                ", msg='" + msg + '\'' +
                ", ip='" + ip + '\'' +
                ", responseTime=" + responseTime +
                ", recordDate=" + recordDate +
                ", commit='" + commit + '\'' +
                ", error='" + error + '\'' +
                '}';
    }
}
