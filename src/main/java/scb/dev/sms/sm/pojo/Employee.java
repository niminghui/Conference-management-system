package scb.dev.sms.sm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * ClassName: Employee <br/>
 * Description: 员工 类<br/><br/>
 * date: 2018年11月15日 上午10:29:51 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
public class Employee implements Serializable{
    /**
	 * serialVersionUID
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = -1323025868695548024L;

	/**
     * 职员编号
     */
    private String employeeId;

    /**
     * 职员姓名
     */
    private String employeeName;

    /**
     * 职员昵称
     */
    private String employeeNickname;

    /**
     * 职员性别
     */
    private String employeeGender;

    /**
     * 职位编号
     */
    private String positionId;

    /**
     * 部门编号
     */
    private String departmentId;

    /**
     * 职员状态
     */
    private String employeeStatus;

    /**
     * 所在公司
     */
    private String employeeCompany;

    /**
     * 入职日期
     */
    private Date employeeEntrytime;

    /**
     * 修改人名
     */
    private String employeeUpdatedUser;

    /**
     * 修改时间
     */
    private Date employeeUpdatedTime;

    /**
     * 创建人名
     */
    private String employeeCreatedUser;

    /**
     * 创建时间
     */
    private Date employeeCreatedTime;

    /**
     * 
     */
    private String employeeWorkId;

    /**
     * 职员照片
     */
    private byte[] employeeImage;

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
     * 职员姓名
     * @return employee_name 职员姓名
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 职员姓名
     * @param employeeName 职员姓名
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * 职员昵称
     * @return employee_nickname 职员昵称
     */
    public String getEmployeeNickname() {
        return employeeNickname;
    }

    /**
     * 职员昵称
     * @param employeeNickname 职员昵称
     */
    public void setEmployeeNickname(String employeeNickname) {
        this.employeeNickname = employeeNickname;
    }

    /**
     * 职员性别
     * @return employee_gender 职员性别
     */
    public String getEmployeeGender() {
        return employeeGender;
    }

    /**
     * 职员性别
     * @param employeeGender 职员性别
     */
    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    /**
     * 职位编号
     * @return position_id 职位编号
     */
    public String getPositionId() {
        return positionId;
    }

    /**
     * 职位编号
     * @param positionId 职位编号
     */
    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    /**
     * 部门编号
     * @return department_id 部门编号
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * 部门编号
     * @param departmentId 部门编号
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 职员状态
     * @return employee_status 职员状态
     */
    public String getEmployeeStatus() {
        return employeeStatus;
    }

    /**
     * 职员状态
     * @param employeeStatus 职员状态
     */
    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    /**
     * 所在公司
     * @return employee_company 所在公司
     */
    public String getEmployeeCompany() {
        return employeeCompany;
    }

    /**
     * 所在公司
     * @param employeeCompany 所在公司
     */
    public void setEmployeeCompany(String employeeCompany) {
        this.employeeCompany = employeeCompany;
    }

    /**
     * 入职日期
     * @return employee_entrytime 入职日期
     */
    public Date getEmployeeEntrytime() {
        return employeeEntrytime;
    }

    /**
     * 入职日期
     * @param employeeEntrytime 入职日期
     */
    public void setEmployeeEntrytime(Date employeeEntrytime) {
        this.employeeEntrytime = employeeEntrytime;
    }

    /**
     * 修改人名
     * @return employee_updated_user 修改人名
     */
    public String getEmployeeUpdatedUser() {
        return employeeUpdatedUser;
    }

    /**
     * 修改人名
     * @param employeeUpdatedUser 修改人名
     */
    public void setEmployeeUpdatedUser(String employeeUpdatedUser) {
        this.employeeUpdatedUser = employeeUpdatedUser;
    }

    /**
     * 修改时间
     * @return employee_updated_time 修改时间
     */
    public Date getEmployeeUpdatedTime() {
        return employeeUpdatedTime;
    }

    /**
     * 修改时间
     * @param employeeUpdatedTime 修改时间
     */
    public void setEmployeeUpdatedTime(Date employeeUpdatedTime) {
        this.employeeUpdatedTime = employeeUpdatedTime;
    }

    /**
     * 创建人名
     * @return employee_created_user 创建人名
     */
    public String getEmployeeCreatedUser() {
        return employeeCreatedUser;
    }

    /**
     * 创建人名
     * @param employeeCreatedUser 创建人名
     */
    public void setEmployeeCreatedUser(String employeeCreatedUser) {
        this.employeeCreatedUser = employeeCreatedUser;
    }

    /**
     * 创建时间
     * @return employee_created_time 创建时间
     */
    public Date getEmployeeCreatedTime() {
        return employeeCreatedTime;
    }

    /**
     * 创建时间
     * @param employeeCreatedTime 创建时间
     */
    public void setEmployeeCreatedTime(Date employeeCreatedTime) {
        this.employeeCreatedTime = employeeCreatedTime;
    }

    /**
     * 
     * @return employee_work_id 
     */
    public String getEmployeeWorkId() {
        return employeeWorkId;
    }

    /**
     * 
     * @param employeeWorkId 
     */
    public void setEmployeeWorkId(String employeeWorkId) {
        this.employeeWorkId = employeeWorkId;
    }

    /**
     * 职员照片
     * @return employee_image 职员照片
     */
    public byte[] getEmployeeImage() {
        return employeeImage;
    }

    /**
     * 职员照片
     * @param employeeImage 职员照片
     */
    public void setEmployeeImage(byte[] employeeImage) {
        this.employeeImage = employeeImage;
    }
    
    /**
     *  构造方法
     * Creates a new instance of Employee.
     *
     * @param employeeId
     * @param employeeName
     * @param employeeNickname
     * @param employeeGender
     * @param positionId
     * @param departmentId
     * @param employeeStatus
     * @param employeeCompany
     * @param employeeUpdatedUser
     * @param employeeCreatedUser
     * @param employeeWorkId
     */
	public Employee(String employeeId, String employeeName, String employeeNickname, String employeeGender,
			String positionId, String departmentId, String employeeStatus, String employeeCompany,
			String employeeUpdatedUser, String employeeCreatedUser, String employeeWorkId) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeNickname = employeeNickname;
		this.employeeGender = employeeGender;
		this.positionId = positionId;
		this.departmentId = departmentId;
		this.employeeStatus = employeeStatus;
		this.employeeCompany = employeeCompany;
		this.employeeUpdatedUser = employeeUpdatedUser;
		this.employeeCreatedUser = employeeCreatedUser;
		this.employeeWorkId = employeeWorkId;
	}
    
}