package scb.dev.sms.sm.pojo;

import java.util.Date;

public class Log_position {
    /**
     * 
     */
    private String logPositionId;

    /**
     * 操作类型
     */
    private String logPositionOperatorType;

    /**
     * 操作账户
     */
    private String logPositionOperatorEid;

    /**
     * 操作时间
     */
    private Date logPositionOperatorTime;

    /**
     * 
     * @return log_position_id 
     */
    public String getLogPositionId() {
        return logPositionId;
    }

    /**
     * 
     * @param logPositionId 
     */
    public void setLogPositionId(String logPositionId) {
        this.logPositionId = logPositionId;
    }

    /**
     * 操作类型
     * @return log_position_operator_type 操作类型
     */
    public String getLogPositionOperatorType() {
        return logPositionOperatorType;
    }

    /**
     * 操作类型
     * @param logPositionOperatorType 操作类型
     */
    public void setLogPositionOperatorType(String logPositionOperatorType) {
        this.logPositionOperatorType = logPositionOperatorType;
    }

    /**
     * 操作账户
     * @return log_position_operator_eid 操作账户
     */
    public String getLogPositionOperatorEid() {
        return logPositionOperatorEid;
    }

    /**
     * 操作账户
     * @param logPositionOperatorEid 操作账户
     */
    public void setLogPositionOperatorEid(String logPositionOperatorEid) {
        this.logPositionOperatorEid = logPositionOperatorEid;
    }

    /**
     * 操作时间
     * @return log_position_operator_time 操作时间
     */
    public Date getLogPositionOperatorTime() {
        return logPositionOperatorTime;
    }

    /**
     * 操作时间
     * @param logPositionOperatorTime 操作时间
     */
    public void setLogPositionOperatorTime(Date logPositionOperatorTime) {
        this.logPositionOperatorTime = logPositionOperatorTime;
    }
}