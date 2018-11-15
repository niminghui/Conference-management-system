package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.Log_employee;

public interface Log_employeeDao {
	/**
	 * Description:根据id删除log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int deleteByPrimaryKey(String logEmployeeId);
    /**
	 * Description:增加log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int insert(Log_employee record);

    /**
   	 * Description:插入部分log
   	 * 
   	 * @mbg.generated 2018-11-15
   	 */
    int insertSelective(Log_employee record);

    /**
	 * Description:根据id查询部分log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    Log_employee selectByPrimaryKey(String logEmployeeId);

    /**
	 * Description:根据id更新部分log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKeySelective(Log_employee record);

    /**
	 * Description:根据id更新log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKey(Log_employee record);
}