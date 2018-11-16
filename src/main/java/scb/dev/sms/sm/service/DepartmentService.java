package scb.dev.sms.sm.service;

import scb.dev.sms.sm.pojo.Department;

public interface DepartmentService {
    
	//删除指定部门,必须指定id
	public String deleteDepartment(String departmentiId);
	//修改指定部门,必须指定id
	public String updateDepartment(Department department);

	//添加部门
	public String insertDepartment(Department department);
}
