package scb.dev.sms.log.pojo;

import java.util.Date;

public class EmployeeLog {
    /**
     * 
     */
    private String logEmployeeId;

    /**
     * 操作类型
     */
    private String logEmployeeOperatorType;

    /**
     * 操作账户
     */
    private String logEmployeeOperatorEid;

    /**
     * 操作时间
     */
    private Date logEmployeeOperatorTime;

    /**
     * 
     * @return log_employee_id 
     */
    public String getLogEmployeeId() {
        return logEmployeeId;
    }

    /**
     * 
     * @param logEmployeeId 
     */
    public void setLogEmployeeId(String logEmployeeId) {
        this.logEmployeeId = logEmployeeId;
    }

    /**
     * 操作类型
     * @return log_employee_operator_type 操作类型
     */
    public String getLogEmployeeOperatorType() {
        return logEmployeeOperatorType;
    }

    /**
     * 操作类型
     * @param logEmployeeOperatorType 操作类型
     */
    public void setLogEmployeeOperatorType(String logEmployeeOperatorType) {
        this.logEmployeeOperatorType = logEmployeeOperatorType;
    }

    /**
     * 操作账户
     * @return log_employee_operator_eid 操作账户
     */
    public String getLogEmployeeOperatorEid() {
        return logEmployeeOperatorEid;
    }

    /**
     * 操作账户
     * @param logEmployeeOperatorEid 操作账户
     */
    public void setLogEmployeeOperatorEid(String logEmployeeOperatorEid) {
        this.logEmployeeOperatorEid = logEmployeeOperatorEid;
    }

    /**
     * 操作时间
     * @return log_employee_operator_time 操作时间
     */
    public Date getLogEmployeeOperatorTime() {
        return logEmployeeOperatorTime;
    }

    /**
     * 操作时间
     * @param logEmployeeOperatorTime 操作时间
     */
    public void setLogEmployeeOperatorTime(Date logEmployeeOperatorTime) {
        this.logEmployeeOperatorTime = logEmployeeOperatorTime;
    }
}