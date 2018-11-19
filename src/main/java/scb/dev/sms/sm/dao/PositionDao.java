package scb.dev.sms.sm.dao;

import java.util.List;

import scb.dev.sms.sm.pojo.Position;
import scb.dev.sms.util.tool.PagingVO;
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

	/**
	 * selectAllPositionInfo:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author erwin.wang
	 * @return
	 * @since JDK 1.8
	 */
	List<Position> selectAllPositionInfo();

	/**
	 * selectByPrimaryKey:(这里用一句话描述这个方法的作用). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author erwin.wang
	 * @param positionId
	 * @return
	 * @since JDK 1.8
	 */
	Position selectByPrimaryKey(Integer positionId);
	
	List<Position> selectByPositionName(String positionName);

	int getCountPosition();

	List<Position> findByPaging(PagingVO pageVo);
}