/**
 * Project Name:scb.sms
 * File Name:MenuCompare.java
 * Package Name:scb.dev.sms.util.tree
 * Date:2018年11月8日下午2:47:15
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.util.tree;

import java.util.Comparator;

import scb.dev.sms.sm.pojo.Menu;

/**
 * ClassName: MenuCompare <br/>
 * Description: TODO ADD REASON(可选). <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月8日 下午2:47:15 <br/>
 */
public class MenuCompare implements Comparator<Menu> {

	/**
	 * Menu compare.
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Menu m1, Menu m2) {
		if (m1.getSortId() < m2.getSortId()) {
			return -1;
		}
		return 1;
	}

}
