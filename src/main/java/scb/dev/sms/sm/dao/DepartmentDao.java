package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.Department;

public interface DepartmentDao {
	/**
	 * Description:根据departmentId删除department
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int deleteByPrimaryKey(String departmentId);
    /**
	 * Description:插入department
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int insert(Department record);

    /**
	 * Description:插入department部分数据
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int insertSelective(Department record);

    /**
	 * Description:根据id查询department
	 * 
	 * @mbg.generated 2018-11-15
	 */
    Department selectByPrimaryKey(String departmentId);

    /**
	 * Description:根据id更新部分department
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKeySelective(Department record);

    /**
	 * Description:根据id更新department
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKey(Department record);
}