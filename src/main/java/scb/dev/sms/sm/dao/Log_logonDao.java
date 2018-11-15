package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.Log_logon;

public interface Log_logonDao {
	/**
	 * Description:根据id删除log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int deleteByPrimaryKey(String logLogonId);
    /**
	 * Description:增加log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int insert(Log_logon record);

    /**
   	 * Description:插入部分log
   	 * 
   	 * @mbg.generated 2018-11-15
   	 */
    int insertSelective(Log_logon record);

    /**
	 * Description:根据id查询部分log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    Log_logon selectByPrimaryKey(String logLogonId);

    /**
	 * Description:根据id更新部分log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKeySelective(Log_logon record);

    /**
	 * Description:根据id更新log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKey(Log_logon record);
}