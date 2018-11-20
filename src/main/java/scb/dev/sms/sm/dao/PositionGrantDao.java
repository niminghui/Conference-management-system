package scb.dev.sms.sm.dao;

import org.apache.ibatis.annotations.Param;
import scb.dev.sms.sm.pojo.PositionGrant;
/**
 * 
 * @author Weilei
 *
 */
public interface PositionGrantDao {
    /**
     *
     * @mbg.generated 2018-11-20
     */
    int deleteByPrimaryKey(@Param("pgPositionId") String pgPositionId, @Param("pgMenuId") String pgMenuId);

    /**
     *
     * @mbg.generated 2018-11-20
     */
    int insert(PositionGrant record);

    /**
     *
     * @mbg.generated 2018-11-20
     */
    int insertSelective(PositionGrant record);

    /**
     *
     * @mbg.generated 2018-11-20
     */
    PositionGrant selectByPrimaryKey(@Param("pgPositionId") String pgPositionId, @Param("pgMenuId") String pgMenuId);

    /**
     *
     * @mbg.generated 2018-11-20
     */
    int updateByPrimaryKeySelective(PositionGrant record);

    /**
     *
     * @mbg.generated 2018-11-20
     */
    int updateByPrimaryKey(PositionGrant record);
}