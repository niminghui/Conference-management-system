package scb.dev.sms.sm.pojo;

import java.util.Date;

public class Log_account {
    /**
     * 日志编号
     */
    private String logAccountId;

    /**
     * 操作类型
     */
    private String logAccountOperatorType;

    /**
     * 操作账户
     */
    private String logAccountOperatorEid;

    /**
     * 操作时间
     */
    private Date logAccountOperatorTime;

    /**
     * 日志编号
     * @return log_account_id 日志编号
     */
    public String getLogAccountId() {
        return logAccountId;
    }

    /**
     * 日志编号
     * @param logAccountId 日志编号
     */
    public void setLogAccountId(String logAccountId) {
        this.logAccountId = logAccountId;
    }

    /**
     * 操作类型
     * @return log_account_operator_type 操作类型
     */
    public String getLogAccountOperatorType() {
        return logAccountOperatorType;
    }

    /**
     * 操作类型
     * @param logAccountOperatorType 操作类型
     */
    public void setLogAccountOperatorType(String logAccountOperatorType) {
        this.logAccountOperatorType = logAccountOperatorType;
    }

    /**
     * 操作账户
     * @return log_account_operator_eid 操作账户
     */
    public String getLogAccountOperatorEid() {
        return logAccountOperatorEid;
    }

    /**
     * 操作账户
     * @param logAccountOperatorEid 操作账户
     */
    public void setLogAccountOperatorEid(String logAccountOperatorEid) {
        this.logAccountOperatorEid = logAccountOperatorEid;
    }

    /**
     * 操作时间
     * @return log_account_operator_time 操作时间
     */
    public Date getLogAccountOperatorTime() {
        return logAccountOperatorTime;
    }

    /**
     * 操作时间
     * @param logAccountOperatorTime 操作时间
     */
    public void setLogAccountOperatorTime(Date logAccountOperatorTime) {
        this.logAccountOperatorTime = logAccountOperatorTime;
    }
}