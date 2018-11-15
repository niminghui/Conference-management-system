package scb.dev.sms.sm.pojo;

import java.util.Date;

public class Log_department {
    /**
     * 
     */
    private String logDepartmentId;

    /**
     * 操作类型
     */
    private String logDepartmentOperatorType;

    /**
     * 操作账户
     */
    private String logDepartmentOperatorEid;

    /**
     * 操作时间
     */
    private Date logDepartmentOperatorTime;

    /**
     * 
     * @return log_department_id 
     */
    public String getLogDepartmentId() {
        return logDepartmentId;
    }

    /**
     * 
     * @param logDepartmentId 
     */
    public void setLogDepartmentId(String logDepartmentId) {
        this.logDepartmentId = logDepartmentId;
    }

    /**
     * 操作类型
     * @return log_department_operator_type 操作类型
     */
    public String getLogDepartmentOperatorType() {
        return logDepartmentOperatorType;
    }

    /**
     * 操作类型
     * @param logDepartmentOperatorType 操作类型
     */
    public void setLogDepartmentOperatorType(String logDepartmentOperatorType) {
        this.logDepartmentOperatorType = logDepartmentOperatorType;
    }

    /**
     * 操作账户
     * @return log_department_operator_eid 操作账户
     */
    public String getLogDepartmentOperatorEid() {
        return logDepartmentOperatorEid;
    }

    /**
     * 操作账户
     * @param logDepartmentOperatorEid 操作账户
     */
    public void setLogDepartmentOperatorEid(String logDepartmentOperatorEid) {
        this.logDepartmentOperatorEid = logDepartmentOperatorEid;
    }

    /**
     * 操作时间
     * @return log_department_operator_time 操作时间
     */
    public Date getLogDepartmentOperatorTime() {
        return logDepartmentOperatorTime;
    }

    /**
     * 操作时间
     * @param logDepartmentOperatorTime 操作时间
     */
    public void setLogDepartmentOperatorTime(Date logDepartmentOperatorTime) {
        this.logDepartmentOperatorTime = logDepartmentOperatorTime;
    }
}