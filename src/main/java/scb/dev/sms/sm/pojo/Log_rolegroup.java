package scb.dev.sms.sm.pojo;

import java.util.Date;

public class Log_rolegroup {
    /**
     * 
     */
    private String logRolegroupId;

    /**
     * 操作类型
     */
    private String logRolegroupOperatorType;

    /**
     * 操作账户
     */
    private String logRolegroupOperatorEid;

    /**
     * 操作时间
     */
    private Date logRolegroupOperatorTime;

    /**
     * 
     * @return log_rolegroup_id 
     */
    public String getLogRolegroupId() {
        return logRolegroupId;
    }

    /**
     * 
     * @param logRolegroupId 
     */
    public void setLogRolegroupId(String logRolegroupId) {
        this.logRolegroupId = logRolegroupId;
    }

    /**
     * 操作类型
     * @return log_rolegroup_operator_type 操作类型
     */
    public String getLogRolegroupOperatorType() {
        return logRolegroupOperatorType;
    }

    /**
     * 操作类型
     * @param logRolegroupOperatorType 操作类型
     */
    public void setLogRolegroupOperatorType(String logRolegroupOperatorType) {
        this.logRolegroupOperatorType = logRolegroupOperatorType;
    }

    /**
     * 操作账户
     * @return log_rolegroup_operator_eid 操作账户
     */
    public String getLogRolegroupOperatorEid() {
        return logRolegroupOperatorEid;
    }

    /**
     * 操作账户
     * @param logRolegroupOperatorEid 操作账户
     */
    public void setLogRolegroupOperatorEid(String logRolegroupOperatorEid) {
        this.logRolegroupOperatorEid = logRolegroupOperatorEid;
    }

    /**
     * 操作时间
     * @return log_rolegroup_operator_time 操作时间
     */
    public Date getLogRolegroupOperatorTime() {
        return logRolegroupOperatorTime;
    }

    /**
     * 操作时间
     * @param logRolegroupOperatorTime 操作时间
     */
    public void setLogRolegroupOperatorTime(Date logRolegroupOperatorTime) {
        this.logRolegroupOperatorTime = logRolegroupOperatorTime;
    }
}