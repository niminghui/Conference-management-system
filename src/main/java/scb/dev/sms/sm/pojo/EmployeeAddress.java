package scb.dev.sms.sm.pojo;

import java.io.Serializable;

/**
 * 
 * ClassName: EmployeeAddress <br/>
 * Description: 员工地址类 <br/>
 * <br/>
 * date: 2018年11月15日 上午10:33:05 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
public class EmployeeAddress implements Serializable {
	/**
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = -6493167562411041609L;

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
	 * 
	 * @return employee_id 职员编号
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * 职员编号
	 * 
	 * @param employeeId 职员编号
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * 职员现住址
	 * 
	 * @return employee_address 职员现住址
	 */
	public String getEmployeeAddress() {
		return employeeAddress;
	}

	/**
	 * 职员现住址
	 * 
	 * @param employeeAddress 职员现住址
	 */
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	/**
	 * 职员籍贯
	 * 
	 * @return employee_nativePlace 职员籍贯
	 */
	public String getEmployeeNativeplace() {
		return employeeNativeplace;
	}

	/**
	 * 职员籍贯
	 * 
	 * @param employeeNativeplace 职员籍贯
	 */
	public void setEmployeeNativeplace(String employeeNativeplace) {
		this.employeeNativeplace = employeeNativeplace;
	}
	
	/**
	 * Creates a new instance of EmployeeAddress.
	 * 有参构造方法
	 * @param employeeAddress
	 * @param employeeNativeplace
	 */
	public EmployeeAddress(String employeeAddress, String employeeNativeplace) {
		super();
		this.employeeAddress = employeeAddress;
		this.employeeNativeplace = employeeNativeplace;
	}
	/**
	 * Creates a new instance of EmployeeAddress.
	 * 有参构造方法
	 * @param employeeId
	 * @param employeeAddress
	 * @param employeeNativeplace
	 */
	public EmployeeAddress(String employeeId, String employeeAddress, String employeeNativeplace) {
		super();
		this.employeeId = employeeId;
		this.employeeAddress = employeeAddress;
		this.employeeNativeplace = employeeNativeplace;
	}

	/**
	 * Creates a new instance of EmployeeAddress.
	 * 无参构造方法
	 */
	public EmployeeAddress() {}
	
}