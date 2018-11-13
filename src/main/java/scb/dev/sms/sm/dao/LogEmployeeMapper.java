package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.LogEmployee;

public interface LogEmployeeMapper {
    /**
     *
     * @mbg.generated 2018-11-13
     */
    int deleteByPrimaryKey(String logEmployeeId);

    /**
     *
     * @mbg.generated 2018-11-13
     */
    int insert(LogEmployee record);

    /**
     *
     * @mbg.generated 2018-11-13
     */
    int insertSelective(LogEmployee record);

    /**
     *
     * @mbg.generated 2018-11-13
     */
    LogEmployee selectByPrimaryKey(String logEmployeeId);

    /**
     *
     * @mbg.generated 2018-11-13
     */
    int updateByPrimaryKeySelective(LogEmployee record);

    /**
     *
     * @mbg.generated 2018-11-13
     */
    int updateByPrimaryKey(LogEmployee record);
}