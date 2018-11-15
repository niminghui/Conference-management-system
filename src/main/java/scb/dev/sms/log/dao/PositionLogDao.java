package scb.dev.sms.log.dao;

import scb.dev.sms.log.pojo.PositionLog;

public interface PositionLogDao {
    /**
     *
     * @mbg.generated 2018-11-15
     */
    int deleteByPrimaryKey(String logPositionId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insert(PositionLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insertSelective(PositionLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    PositionLog selectByPrimaryKey(String logPositionId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKeySelective(PositionLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKey(PositionLog record);
}