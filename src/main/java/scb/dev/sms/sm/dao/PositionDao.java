package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.Position;

public interface PositionDao {
    /**
     *
     * @mbg.generated 2018-11-15
     */
    int deleteByPrimaryKey(String positionId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insert(Position record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insertSelective(Position record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    Position selectByPrimaryKey(String positionId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKeySelective(Position record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKey(Position record);
}