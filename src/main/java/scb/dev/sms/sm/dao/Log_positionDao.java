package scb.dev.sms.sm.dao;



public interface Log_positionDao {
	/**
	 * Description:根据id删除log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int deleteByPrimaryKey(String logPositionId);
    /**
	 * Description:增加log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int insert(Log_positionDao record);
    /**
   	 * Description:插入部分log
   	 * 
   	 * @mbg.generated 2018-11-15
   	 */
    int insertSelective(Log_positionDao record);

    /**
	 * Description:根据id查询部分log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    Log_positionDao selectByPrimaryKey(String logPositionId);

    /**
	 * Description:根据id更新部分log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKeySelective(Log_positionDao record);

    /**
	 * Description:根据id更新log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKey(Log_positionDao record);
}