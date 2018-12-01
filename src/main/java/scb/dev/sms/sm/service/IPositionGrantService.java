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
	 * 根据每个人的账户id返回不同的菜单
	 * 
	 * @param accoountId
	 * @return
	 */
	List<Menu> getOwnMenu(String accountId);

	boolean addPositionGrant(PositionGrant record);

	boolean updatePositionGrant(PositionGrant recod);

	boolean deletePositionGrantByPrimaryKey(String pgPositionId, String pgMenuId);
}
