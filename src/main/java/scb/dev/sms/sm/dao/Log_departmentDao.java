package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.Log_department;

public interface Log_departmentDao {
	/**
	 * Description:根据id删除log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int deleteByPrimaryKey(String logDepartmentId);

    /**
	 * Description:增加log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int insert(Log_department record);

    /**
	 * Description:插入部分log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int insertSelective(Log_department record);

    /**
	 * Description:根据id查询部分log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    Log_department selectByPrimaryKey(String logDepartmentId);

    /**
	 * Description:根据id更新部分log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKeySelective(Log_department record);

    /**
	 * Description:根据id更新log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKey(Log_department record);
}