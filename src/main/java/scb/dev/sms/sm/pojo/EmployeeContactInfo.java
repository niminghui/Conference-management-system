package scb.dev.sms.sm.pojo;

public class EmployeeContactInfo {
    /**
     * 职员编号
     */
    private String employeeId;

    /**
     * 职员座机
     */
    private String employeeLandline;

    /**
     * 职员手机
     */
    private String employeePhone;

    /**
     * 职员邮箱
     */
    private String employeeEmail;

    /**
     * 职员编号
     * @return employee_id 职员编号
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 职员编号
     * @param employeeId 职员编号
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 职员座机
     * @return employee_landline 职员座机
     */
    public String getEmployeeLandline() {
        return employeeLandline;
    }

    /**
     * 职员座机
     * @param employeeLandline 职员座机
     */
    public void setEmployeeLandline(String employeeLandline) {
        this.employeeLandline = employeeLandline;
    }

    /**
     * 职员手机
     * @return employee_phone 职员手机
     */
    public String getEmployeePhone() {
        return employeePhone;
    }

    /**
     * 职员手机
     * @param employeePhone 职员手机
     */
    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    /**
     * 职员邮箱
     * @return employee_email 职员邮箱
     */
    public String getEmployeeEmail() {
        return employeeEmail;
    }

    /**
     * 职员邮箱
     * @param employeeEmail 职员邮箱
     */
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
}