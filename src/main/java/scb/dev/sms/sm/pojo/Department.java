package scb.dev.sms.sm.pojo;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Department implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 部门编号
     */
    private String departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 部门缩写
     */
    private String departmentAbbreviation;

    /**
     * 上级部门
     */
    private String departmentPid;

    /**
     * 排序编号
     */
    private String departmentOrderid;

    /**
     * 部门电话
     */
    private String departmentPhone;

    /**
     * 部门邮箱
     */
    private String departmentEmail;

    /**
     * 部门描述
     */
    private String departmentDetail;

    /**
     * 部门领导
     */
    private String departmentHead;

    /**
     * 修改人名
     */
    private String departmentUpdatedUser;

    /**
     * 修改时间
     */
    private Date departmentUpdatedTime;

    /**
     * 创建人名
     */
    private String departmentCreatedUser;

    /**
     * 创建时间
     */
    private Date departmentCreatedTime;

    /**
     * 存放子部门
     */
    private List<Department> departments=new ArrayList<>();
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
     * 部门名称
     * @return department_name 部门名称
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * 部门名称
     * @param departmentName 部门名称
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * 部门缩写
     * @return department_abbreviation 部门缩写
     */
    public String getDepartmentAbbreviation() {
        return departmentAbbreviation;
    }

    /**
     * 部门缩写
     * @param departmentAbbreviation 部门缩写
     */
    public void setDepartmentAbbreviation(String departmentAbbreviation) {
        this.departmentAbbreviation = departmentAbbreviation;
    }

    /**
     * 上级部门
     * @return department_pid 上级部门
     */
    public String getDepartmentPid() {
        return departmentPid;
    }

    /**
     * 上级部门
     * @param departmentPid 上级部门
     */
    public void setDepartmentPid(String departmentPid) {
        this.departmentPid = departmentPid;
    }

    /**
     * 排序编号
     * @return department_orderId 排序编号
     */
    public String getDepartmentOrderid() {
        return departmentOrderid;
    }

    /**
     * 排序编号
     * @param departmentOrderid 排序编号
     */
    public void setDepartmentOrderid(String departmentOrderid) {
        this.departmentOrderid = departmentOrderid;
    }

    /**
     * 部门电话
     * @return department_phone 部门电话
     */
    public String getDepartmentPhone() {
        return departmentPhone;
    }

    /**
     * 部门电话
     * @param departmentPhone 部门电话
     */
    public void setDepartmentPhone(String departmentPhone) {
        this.departmentPhone = departmentPhone;
    }

    /**
     * 部门邮箱
     * @return department_email 部门邮箱
     */
    public String getDepartmentEmail() {
        return departmentEmail;
    }

    /**
     * 部门邮箱
     * @param departmentEmail 部门邮箱
     */
    public void setDepartmentEmail(String departmentEmail) {
        this.departmentEmail = departmentEmail;
    }

    /**
     * 部门描述
     * @return department_detail 部门描述
     */
    public String getDepartmentDetail() {
        return departmentDetail;
    }

    /**
     * 部门描述
     * @param departmentDetail 部门描述
     */
    public void setDepartmentDetail(String departmentDetail) {
        this.departmentDetail = departmentDetail;
    }

    /**
     * 部门领导
     * @return department_head 部门领导
     */
    public String getDepartmentHead() {
        return departmentHead;
    }

    /**
     * 部门领导
     * @param departmentHead 部门领导
     */
    public void setDepartmentHead(String departmentHead) {
        this.departmentHead = departmentHead;
    }

    /**
     * 修改人名
     * @return department_updated_user 修改人名
     */
    public String getDepartmentUpdatedUser() {
        return departmentUpdatedUser;
    }

    /**
     * 修改人名
     * @param departmentUpdatedUser 修改人名
     */
    public void setDepartmentUpdatedUser(String departmentUpdatedUser) {
        this.departmentUpdatedUser = departmentUpdatedUser;
    }

    /**
     * 修改时间
     * @return department_updated_time 修改时间
     */
    public Date getDepartmentUpdatedTime() {
        return departmentUpdatedTime;
    }

    /**
     * 修改时间
     * @param departmentUpdatedTime 修改时间
     */
    public void setDepartmentUpdatedTime(Date departmentUpdatedTime) {
        this.departmentUpdatedTime = departmentUpdatedTime;
    }

    /**
     * 创建人名
     * @return department_created_user 创建人名
     */
    public String getDepartmentCreatedUser() {
        return departmentCreatedUser;
    }

    /**
     * 创建人名
     * @param departmentCreatedUser 创建人名
     */
    public void setDepartmentCreatedUser(String departmentCreatedUser) {
        this.departmentCreatedUser = departmentCreatedUser;
    }

    /**
     * 创建时间
     * @return department_created_time 创建时间
     */
    public Date getDepartmentCreatedTime() {
        return departmentCreatedTime;
    }

    /**
     * 创建时间
     * @param departmentCreatedTime 创建时间
     */
    public void setDepartmentCreatedTime(Date departmentCreatedTime) {
        this.departmentCreatedTime = departmentCreatedTime;
    }

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentAbbreviation=" + departmentAbbreviation + ", departmentPid=" + departmentPid
				+ ", departmentOrderid=" + departmentOrderid + ", departmentPhone=" + departmentPhone
				+ ", departmentEmail=" + departmentEmail + ", departmentDetail=" + departmentDetail
				+ ", departmentHead=" + departmentHead + ", departmentUpdatedUser=" + departmentUpdatedUser
				+ ", departmentUpdatedTime=" + departmentUpdatedTime + ", departmentCreatedUser="
				+ departmentCreatedUser + ", departmentCreatedTime=" + departmentCreatedTime + ", departments="
				+ departments + "]";
	}
	
}