package scb.dev.sms.sm.service;

import java.util.List;

import scb.dev.sms.sm.pojo.Employee;
import scb.dev.sms.sm.pojo.EmployeeAddress;
import scb.dev.sms.sm.pojo.EmployeeContactInfo;
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
	String initEmployee(Employee employee);
	
	/**
	 * editEmployee:编辑员工信息. <br/>
	 * @param employee:要编辑的员工信息
	 * @return 编辑结果信息
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	String editEmployee(Employee employee);
	
	/**
	 * queryAllEmployee:查询全部员工. <br/>
	 * @return 所有员工信息集合
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	List<Employee> queryAllEmployee();
}
