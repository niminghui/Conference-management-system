package scb.dev.sms.log.pojo;

import java.util.Date;

public class LogonLog {
    /**
     * 日志编号
     */
    private String logLogonId;

    /**
     * 操作类型
     */
    private String logLogonOperatorType;

    /**
     * 操作账户
     */
    private String logLogonOperatorEid;

    /**
     * 操作时间
     */
    private Date logLogonOperatorTime;

    /**
     * 登录ip
     */
    private String logLogonIp;

    /**
     * 日志编号
     * @return log_logon_id 日志编号
     */
    public String getLogLogonId() {
        return logLogonId;
    }

    /**
     * 日志编号
     * @param logLogonId 日志编号
     */
    public void setLogLogonId(String logLogonId) {
        this.logLogonId = logLogonId;
    }

    /**
     * 操作类型
     * @return log_logon_operator_type 操作类型
     */
    public String getLogLogonOperatorType() {
        return logLogonOperatorType;
    }

    /**
     * 操作类型
     * @param logLogonOperatorType 操作类型
     */
    public void setLogLogonOperatorType(String logLogonOperatorType) {
        this.logLogonOperatorType = logLogonOperatorType;
    }

    /**
     * 操作账户
     * @return log_logon_operator_eid 操作账户
     */
    public String getLogLogonOperatorEid() {
        return logLogonOperatorEid;
    }

    /**
     * 操作账户
     * @param logLogonOperatorEid 操作账户
     */
    public void setLogLogonOperatorEid(String logLogonOperatorEid) {
        this.logLogonOperatorEid = logLogonOperatorEid;
    }

    /**
     * 操作时间
     * @return log_logon_operator_time 操作时间
     */
    public Date getLogLogonOperatorTime() {
        return logLogonOperatorTime;
    }

    /**
     * 操作时间
     * @param logLogonOperatorTime 操作时间
     */
    public void setLogLogonOperatorTime(Date logLogonOperatorTime) {
        this.logLogonOperatorTime = logLogonOperatorTime;
    }

    /**
     * 登录ip
     * @return log_logon_ip 登录ip
     */
    public String getLogLogonIp() {
        return logLogonIp;
    }

    /**
     * 登录ip
     * @param logLogonIp 登录ip
     */
    public void setLogLogonIp(String logLogonIp) {
        this.logLogonIp = logLogonIp;
    }
}