package scb.dev.sms.sm.service;

import java.util.List;

import scb.dev.sms.sm.pojo.Menu;
import scb.dev.sms.sm.pojo.PositionGrant;

/**
 * 
 * @author Weilei
 *
 */
public interface IPositionGrantService {

	/**
	 * 根据每个人的职位返回不同的菜单
	 * 
	 * @param positionId
	 * @return
	 */
	List<Menu> getOwnMenu(String positionId);

	boolean addPositionGrant(PositionGrant record);

	boolean updatePositionGrant(PositionGrant recod);

	boolean deletePositionGrantByPrimaryKey(String pgPositionId, String pgMenuId);
}
