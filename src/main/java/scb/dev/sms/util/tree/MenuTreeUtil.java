/**
 * Project Name:clps.sms
 * File Name:MenuTreeUtil.java
 * Package Name:com.clps.dev.demo.tree
 * Date:2018年11月8日下午1:09:07
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.util.tree;

/**
 * ClassName: MenuTreeUtil <br/>
 * Description: turnedToMenuTree. <br/><br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8
 * date: 2018年11月8日 下午1:09:07 <br/>
 */

import java.util.ArrayList;
import java.util.List;

import scb.dev.sms.sm.pojo.Menu;

public class MenuTreeUtil {
	// 默认根ID为1
	private String ROOT_ID = "1";

	/**
	 * 
	 * Description: 将从数据库中读出的Menu平面数据组织成Tree.<br/>
	 * 
	 * @param List<MenuEntity> menuList
	 * @return List<MenuEntity>
	 */
	public List<Menu> turnedToMenuTree(List<Menu> menuList) {
		return turnedToMenuTree(ROOT_ID, menuList);
	}

	/**
	 * 
	 * Description: 以某个pid为父节点构建MenuTree.<br/>
	 * 
	 * @param String pid
	 * @param        List<MenuEntity> list
	 * @return List<MenuEntity>
	 */
	public List<Menu> turnedToMenuTree(String pid, List<Menu> list) {
		List<Menu> menuTreeList = new ArrayList<Menu>();
		for (Menu menu : list) {
			if (menu.getPid().equals(pid)) {
				List<Menu> childMenuList = turnedToMenuTree(menu.getId(), list);
				menu.setChildren(childMenuList);
				menuTreeList.add(menu);
			}
		}
		return menuTreeList;
	}
}
