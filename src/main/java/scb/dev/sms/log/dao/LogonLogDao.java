package scb.dev.sms.log.dao;

import scb.dev.sms.log.pojo.LogonLog;

public interface LogonLogDao {
    /**
     *
     * @mbg.generated 2018-11-15
     */
    int deleteByPrimaryKey(String logLogonId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insert(LogonLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insertSelective(LogonLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    LogonLog selectByPrimaryKey(String logLogonId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKeySelective(LogonLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKey(LogonLog record);
}