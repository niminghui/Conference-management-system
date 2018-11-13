package scb.dev.sms.sm.pojo;

public class EmployeeAddress {
    /**
     * 职员编号
     */
    private String employeeId;

    /**
     * 职员现住址
     */
    private String employeeAddress;

    /**
     * 职员籍贯
     */
    private String employeeNativeplace;

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
     * 职员现住址
     * @return employee_address 职员现住址
     */
    public String getEmployeeAddress() {
        return employeeAddress;
    }

    /**
     * 职员现住址
     * @param employeeAddress 职员现住址
     */
    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    /**
     * 职员籍贯
     * @return employee_nativePlace 职员籍贯
     */
    public String getEmployeeNativeplace() {
        return employeeNativeplace;
    }

    /**
     * 职员籍贯
     * @param employeeNativeplace 职员籍贯
     */
    public void setEmployeeNativeplace(String employeeNativeplace) {
        this.employeeNativeplace = employeeNativeplace;
    }
}