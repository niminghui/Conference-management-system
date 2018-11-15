package scb.dev.sms.sm.dao;


public interface Log_sysparamDao {
	/**
	 * Description:根据id删除log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int deleteByPrimaryKey(String logSysparamId);

    /**
	 * Description:增加log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int insert(Log_sysparamDao record);

    /**
   	 * Description:插入部分log
   	 * 
   	 * @mbg.generated 2018-11-15
   	 */
    int insertSelective(Log_sysparamDao record);

    /**
	 * Description:根据id查询部分log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    Log_sysparamDao selectByPrimaryKey(String logSysparamId);

    /**
	 * Description:根据id更新部分log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKeySelective(Log_sysparamDao record);
    /**
	 * Description:根据id更新log
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKey(Log_sysparamDao record);
}