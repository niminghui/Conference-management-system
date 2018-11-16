package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.Position;
/**
 * 
 * ClassName: PositionDao <br/>
 * Description:PositionDao. <br/><br/>
 * date: 2018年11月15日 上午10:50:37 <br/>
 *
 * @author Zither.Chen
 * @version V1.0
 * @since JDK 1.8
 */
public interface PositionDao {
    /**
     * Description: 对Position的操作
     * @mbg.generated 2018-11-15
     */
    int deleteByPrimaryKey(String positionId);

    /**
     * Description:根据positionId删除Position
     * @mbg.generated 2018-11-15
     */
    int insert(Position record);

    /**
     * Description: 插入Position
     * @mbg.generated 2018-11-15
     */
    int insertSelective(Position record);

    /**
     * Description:根据positionId查找Position
     * @mbg.generated 2018-11-15
     */
    Position selectByPrimaryKey(String positionId);

    /**
     * Description:
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKeySelective(Position record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKey(Position record);
}