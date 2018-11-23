package scb.dev.sms.sm.service;

import java.util.List;

import scb.dev.sms.sm.pojo.Employee;
import scb.dev.sms.sm.pojo.EmployeeAddress;
import scb.dev.sms.sm.pojo.EmployeeContactInfo;
import scb.dev.sms.util.tool.PagingVO;
/**
 * ClassName: IEmployeeService <br/>
 * Description: 员工服务层 <br/><br/>
 * date: 2018年11月15日 下午2:43:00 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
public interface IEmployeeService {
	/**
	 * initEmployee:添加一个员工 <br/>
	 * @param employee:要增加的员工信息
	 * @return 添加结果信息
	 */
	String initEmployee(Employee employee,EmployeeAddress employeeAddress,
			EmployeeContactInfo employeeContactInfo);
	
	/**
	 * editEmployee:编辑员工信息. <br/>
	 * @param employee:要编辑的员工信息
	 * @return 编辑结果信息
	 */
	String editEmployee(Employee employee,EmployeeAddress employeeAddress,
			EmployeeContactInfo employeeContactInfo);
	
	/**
	 * queryAllEmployee:查询全部员工. <br/>
	 * @return 所有员工信息集合
	 *
	 */
	List<Employee> queryAllEmployee(PagingVO pageVo);
	
	/**
	 * queryByEmployeeId:根据员工编号查询员工. <br/>
	 * @param employeeId 
	 * @return 员工对象
	 */
	Employee queryByEmployeeId(String employeeId);
	
	/**
	 * queryByEmployeeName:根据员工姓名查询员工. <br/>
	 * @param employeeName 
	 * @return 员工对象集合
	 */
	List<Employee> queryByEmployeeName(String employeeName);
	
	/**
	 * queryByEmployeeWorkId:根据员工工号查询员工. <br/>
	 * @param employeeWorkId
	 * @return 员工对象
	 */
	Employee queryByEmployeeWorkId(String employeeWorkId);
	
	/**
	 * queryByEmployeePositionId:根据员工职位编号查询员工. <br/>
	 * @param employeePositionId
	 * @return 员工对象集合
	 */
	List<Employee> queryByEmployeePositionId(String employeePositionId);
	
	/**
	 * queryByEmployeeDepartmentId:根据员工部门编号查询员工. <br/>
	 * @param employeeDepartmentId
	 * @return 员工对象集合
	 */
	List<Employee> queryByEmployeeDepartmentId(String employeeDepartmentId);
	
	/**
	 * queryByEmployeeStatus:根据员工状态查询员工. <br/>
	 * @param employeeStatus
	 * @return 员工对象集合
	 */
	List<Employee> queryByEmployeeStatus(String employeeStatus);
	
	/**
	 * getCountEmployee:查询员工数量. <br/>
	 * @param 
	 * @return 员工数量
	 */
	int getCountEmployee(String employeeName);
	
	/**
	 * 
	 * editEmployee:employee单表修改. <br/>
	 * @param empoloy
	 * @return 编辑结果信息
	 */
	int editEmployee(Employee employee);
}
