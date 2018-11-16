package scb.dev.sms.sm.service;

import java.util.List;

import scb.dev.sms.sm.pojo.Menu;

/**
 * 
 * @author Weilei
 *
 */
public interface IMenuService {

	/**
	 * 查询单条menu内容
	 * @param menuId
	 * @return
	 */
	Menu queryMenu(String menuId);
	
	/**
	 * 查询全部 返回拍好顺序的menu
	 * @return
	 */
	List<Menu> queryAllMenu();

	/**
	 * 添加menu的功能
	 * @param menuName
	 * @param menuParentId
	 * @param createUserName
	 * @return
	 */
	boolean addMenu(String menuName, String menuParentId, String createUserName);

	/**
	 * 修改menu的功能
	 * @param menuId
	 * @param menuName
	 * @param menuOrderId
	 * @param menuUrl
	 * @param updateUserName
	 * @return
	 */
	boolean updateMenu(String menuId, String menuName, String menuOrderId, String menuUrl, String updateUserName);

	/**
	 * 删除menu
	 * @param menuId
	 * @return
	 */
	boolean deleteMenu(String menuId);

}
