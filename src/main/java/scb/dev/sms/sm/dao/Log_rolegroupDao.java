package scb.dev.sms.sm.dao;

public interface Log_rolegroupDao {
	/**
	 * Description:根据id删除log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int deleteByPrimaryKey(String logRolegroupId);

    /**
	 * Description:增加log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int insert(Log_rolegroupDao record);
    /**
   	 * Description:插入部分log
   	 * 
   	 * @mbg.generated 2018-11-15
   	 */
    int insertSelective(Log_rolegroupDao record);

    /**
	 * Description:根据id查询部分log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    Log_rolegroupDao selectByPrimaryKey(String logRolegroupId);

    /**
	 * Description:根据id更新部分log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKeySelective(Log_rolegroupDao record);

    /**
	 * Description:根据id更新log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKey(Log_rolegroupDao record);
}