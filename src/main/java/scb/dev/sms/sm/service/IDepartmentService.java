package scb.dev.sms.sm.service;


import java.util.List;

import scb.dev.sms.sm.pojo.Department;
/**
 * ClassName: IPositionService <br/>
 *
 * @author Kero.Zhao
 * @version V1.0
 * @Description: Department实现类接口
 * @Date: 2018/11/16 11:06 <br/>
 * @since JDK 1.8
 * @param 不为空的参数有  department_name  department_abbreviation  department_pid department_orderId department_created_user 
 */
public interface IDepartmentService {
	/**
	 * 
	 * Description: 通过id删除指定部门,必须指定id.<br/>
	 * 
	 * @param departmentiId
	 * @return String 创建账户成功与否信息
	 */
	
	public String deleteDepartmentByDepartmentId(String departmentiId);
	/**
	 * 
	 * Description: 通过id更新指定部门,必须指定id.<br/>
	 * 
	 * @param departmentiId
	 * @return String 更新账户成功与否信息
	 */
	
	public String updateDepartmentByDepartmentId(Department department);

	/**
	 * 
	 * Description: 添加指定部门,类内生成id.<br/>
	 * 
	 * @param departmentiId
	 * @return String，添加账户成功与否信息
	 */
	
	public String insertDepartment(Department department);
	/**
	 * 
	 * Description: 查找部门所以信息.<br/>
	 * 
	 * @param 
	 * @return Department，查找的部门信息
	 */
	public List<Department> findDepartmentsInfo();
	/**
	 * 
	 * Description: 查找部门所以信息.<br/>
	 * 
	 * @param 
	 * @return Department，查找的部门信息
	 */
	//
	public List<Department> findTreeDepartmentsInfo();
	/**
	 * 
	 * Description: 通过部门id查找一个部门信息.<br/>
	 * 
	 * @param 
	 * @return Department，查找的部门信息
	 */
	public Department findOneDepartmentById(String departmentId);
	/**
	 * 
	 * Description: 通过部门简称查找一个部门信息.<br/>
	 * 
	 * @param 
	 * @return Department，查找的部门信息
	 */
	public Department findOneDepartmentByAbbrev(String departmentAbbreviation);
	/**
	 * 
	 * Description: 通过部门名称查找一个部门信息.<br/>
	 * 
	 * @param 
	 * @return Department，查找的部门信息
	 */
	public Department findOneDepartmentByName(String departmentName);

	/**
	 * 
	 * Description: 通过部门名称查找一个部门以及子部门信息.<br/>
	 * 
	 * @param 
	 * @return Department，查找到的部门信息，是tree模式
	 */
	public List<Department> findDepartmentAndSubInfo(String departmentId) ;
	/**
	 * 
	 * Description: 查找跟部门（pid是1）.<br/>
	 * 
	 * @param 
	 * @return Department，查找的部门信息
	 */
	public List<Department> findParentDepartment();
	/**
	 * 
	 * Description: 查找跟部门（pid是1）.<br/>
	 * 
	 * @param 
	 * @return Department，查找的部门信息
	 */
	public List<Department> findDepartmentNamesAndId();
	//查找一个新的部门的缩写是否存在冲突
	public int selectCountByAbbrev(String departmentAbbreviation);
	 //查找一个新的部门的名字是否存在冲突
    public int selectCountByName(String departmentName);
	
}
