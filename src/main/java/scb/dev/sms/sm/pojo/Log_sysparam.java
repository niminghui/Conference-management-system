package scb.dev.sms.sm.pojo;

import java.util.Date;

public class Log_sysparam {
    /**
     * 
     */
    private String logSysparamId;

    /**
     * 操作类型
     */
    private String logSysparamOperatorType;

    /**
     * 操作账户
     */
    private String logSysparamOperatorEid;

    /**
     * 操作时间
     */
    private Date logSysparamOperatorTime;

    /**
     * 
     * @return log_sysparam_id 
     */
    public String getLogSysparamId() {
        return logSysparamId;
    }

    /**
     * 
     * @param logSysparamId 
     */
    public void setLogSysparamId(String logSysparamId) {
        this.logSysparamId = logSysparamId;
    }

    /**
     * 操作类型
     * @return log_sysparam_operator_type 操作类型
     */
    public String getLogSysparamOperatorType() {
        return logSysparamOperatorType;
    }

    /**
     * 操作类型
     * @param logSysparamOperatorType 操作类型
     */
    public void setLogSysparamOperatorType(String logSysparamOperatorType) {
        this.logSysparamOperatorType = logSysparamOperatorType;
    }

    /**
     * 操作账户
     * @return log_sysparam_operator_eid 操作账户
     */
    public String getLogSysparamOperatorEid() {
        return logSysparamOperatorEid;
    }

    /**
     * 操作账户
     * @param logSysparamOperatorEid 操作账户
     */
    public void setLogSysparamOperatorEid(String logSysparamOperatorEid) {
        this.logSysparamOperatorEid = logSysparamOperatorEid;
    }

    /**
     * 操作时间
     * @return log_sysparam_operator_time 操作时间
     */
    public Date getLogSysparamOperatorTime() {
        return logSysparamOperatorTime;
    }

    /**
     * 操作时间
     * @param logSysparamOperatorTime 操作时间
     */
    public void setLogSysparamOperatorTime(Date logSysparamOperatorTime) {
        this.logSysparamOperatorTime = logSysparamOperatorTime;
    }
}