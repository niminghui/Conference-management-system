package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.Log_account;

public interface Log_accountDao {
	/**
	 * Description:根据id删除log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int deleteByPrimaryKey(String logAccountId);

    /**
	 * Description:插入log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int insert(Log_account record);

    /**
	 * Description:插入部分log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int insertSelective(Log_account record);

    /**
	 * Description:根据id查询log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    Log_account selectByPrimaryKey(String logAccountId);

    /**
	 * Description:根据id更新部分log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKeySelective(Log_account record);

    /**
	 * Description:根据id更新log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKey(Log_account record);
}