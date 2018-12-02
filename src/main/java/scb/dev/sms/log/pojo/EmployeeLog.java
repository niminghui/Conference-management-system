package scb.dev.sms.log.pojo;

import java.util.Date;

public class EmployeeLog {
    /**
     * 
     */
    private String log_employee_id;

    /**
     * 操作类型
     */
    private String log_employee_operator_type;

    /**
     * 操作账户
     */
    private String log_employee_operator_eid;

    /**
     * 操作时间
     */
    private Date log_employee_operator_time;

    /**
     * 
     * @return log_employee_id 
     */
    public String getLogEmployeeId() {
        return log_employee_id;
    }

    /**
     * 
     * @param logEmployeeId 
     */
    public void setLogEmployeeId(String logEmployeeId) {
        this.log_employee_id = logEmployeeId;
    }

    /**
     * 操作类型
     * @return log_employee_operator_type 操作类型
     */
    public String getLogEmployeeOperatorType() {
        return log_employee_operator_type;
    }

    /**
     * 操作类型
     * @param logEmployeeOperatorType 操作类型
     */
    public void setLogEmployeeOperatorType(String logEmployeeOperatorType) {
        this.log_employee_operator_type = logEmployeeOperatorType;
    }

    /**
     * 操作账户
     * @return log_employee_operator_eid 操作账户
     */
    public String getLogEmployeeOperatorEid() {
        return log_employee_operator_eid;
    }

    /**
     * 操作账户
     * @param logEmployeeOperatorEid 操作账户
     */
    public void setLogEmployeeOperatorEid(String logEmployeeOperatorEid) {
        this.log_employee_operator_eid = logEmployeeOperatorEid;
    }

    /**
     * 操作时间
     * @return log_employee_operator_time 操作时间
     */
    public Date getLogEmployeeOperatorTime() {
        return log_employee_operator_time;
    }

    /**
     * 操作时间
     * @param logEmployeeOperatorTime 操作时间
     */
    public void setLogEmployeeOperatorTime(Date logEmployeeOperatorTime) {
        this.log_employee_operator_time = logEmployeeOperatorTime;
    }

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeLog [log_employee_id=" + log_employee_id + ", log_employee_operator_type="
				+ log_employee_operator_type + ", log_employee_operator_eid=" + log_employee_operator_eid
				+ ", log_employee_operator_time=" + log_employee_operator_time + "]";
	}
    
}