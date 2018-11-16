package scb.dev.sms.sm.pojo;

import java.io.Serializable;
/**
 * 
 * ClassName: EmployeeContactInfo <br/>
 * Description:员工联系方式类<br/><br/>
 * date: 2018年11月15日 上午10:33:42 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
public class EmployeeContactInfo implements Serializable{
    /**
	 * serialVersionUID
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 6837063750126750697L;

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
    
    /**
     * Creates a new instance of EmployeeContactInfo.
     * 无参构造方法
     */
    public EmployeeContactInfo() {}
	
    /**
	 * Creates a new instance of EmployeeContactInfo.
	 * 有参构造方法
	 * @param employeeLandline
	 * @param employeePhone
	 * @param employeeEmail
	 */
	public EmployeeContactInfo(String employeeLandline, String employeePhone, String employeeEmail) {
		super();
		this.employeeLandline = employeeLandline;
		this.employeePhone = employeePhone;
		this.employeeEmail = employeeEmail;
	}

	/**
	 * Creates a new instance of EmployeeContactInfo.
	 * 有参构造方法
	 * @param employeeId
	 * @param employeeLandline
	 * @param employeePhone
	 * @param employeeEmail
	 */
	public EmployeeContactInfo(String employeeId, String employeeLandline, String employeePhone, String employeeEmail) {
		super();
		this.employeeId = employeeId;
		this.employeeLandline = employeeLandline;
		this.employeePhone = employeePhone;
		this.employeeEmail = employeeEmail;
	}
    
    
}