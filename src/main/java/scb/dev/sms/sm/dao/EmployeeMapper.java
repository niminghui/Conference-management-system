package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.Employee;

public interface EmployeeMapper {

	/**
	 * @mbg.generated  2018-11-13
	 */
	int deleteByPrimaryKey(String employeeId);

	/**
	 * @mbg.generated  2018-11-13
	 */
	int insert(Employee record);

	/**
	 * @mbg.generated  2018-11-13
	 */
	int insertSelective(Employee record);

	/**
	 * @mbg.generated  2018-11-13
	 */
	Employee selectByPrimaryKey(String employeeId);

	/**
	 * @mbg.generated  2018-11-13
	 */
	int updateByPrimaryKeySelective(Employee record);

	/**
	 * @mbg.generated  2018-11-13
	 */
	int updateByPrimaryKeyWithBLOBs(Employee record);

	/**
	 * @mbg.generated  2018-11-13
	 */
	int updateByPrimaryKey(Employee record);
}