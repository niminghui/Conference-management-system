package scb.dev.sms.sm.pojo;

import java.util.Date;

public class Log_menu {
    /**
     * 
     */
    private String logMenuId;

    /**
     * 操作类型
     */
    private String logMenuOperatorType;

    /**
     * 操作账户
     */
    private String logMenuOperatorEid;

    /**
     * 操作时间
     */
    private Date logMenuOperatorTime;

    /**
     * 
     * @return log_menu_id 
     */
    public String getLogMenuId() {
        return logMenuId;
    }

    /**
     * 
     * @param logMenuId 
     */
    public void setLogMenuId(String logMenuId) {
        this.logMenuId = logMenuId;
    }

    /**
     * 操作类型
     * @return log_menu_operator_type 操作类型
     */
    public String getLogMenuOperatorType() {
        return logMenuOperatorType;
    }

    /**
     * 操作类型
     * @param logMenuOperatorType 操作类型
     */
    public void setLogMenuOperatorType(String logMenuOperatorType) {
        this.logMenuOperatorType = logMenuOperatorType;
    }

    /**
     * 操作账户
     * @return log_menu_operator_eid 操作账户
     */
    public String getLogMenuOperatorEid() {
        return logMenuOperatorEid;
    }

    /**
     * 操作账户
     * @param logMenuOperatorEid 操作账户
     */
    public void setLogMenuOperatorEid(String logMenuOperatorEid) {
        this.logMenuOperatorEid = logMenuOperatorEid;
    }

    /**
     * 操作时间
     * @return log_menu_operator_time 操作时间
     */
    public Date getLogMenuOperatorTime() {
        return logMenuOperatorTime;
    }

    /**
     * 操作时间
     * @param logMenuOperatorTime 操作时间
     */
    public void setLogMenuOperatorTime(Date logMenuOperatorTime) {
        this.logMenuOperatorTime = logMenuOperatorTime;
    }
}