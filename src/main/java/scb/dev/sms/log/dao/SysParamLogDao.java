package scb.dev.sms.log.dao;

import scb.dev.sms.log.pojo.SysParamLog;

public interface SysParamLogDao {
    /**
     *
     * @mbg.generated 2018-11-15
     */
    int deleteByPrimaryKey(String logSysparamId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insert(SysParamLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insertSelective(SysParamLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    SysParamLog selectByPrimaryKey(String logSysparamId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKeySelective(SysParamLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKey(SysParamLog record);
}