/**
 * Project Name:scb.sms
 * File Name:MenuTreeUtilTest.java
 * Package Name:scb.dev.sms.util.tree
 * Date:2018年11月8日下午1:55:40
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.util.tree;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

import scb.dev.sms.sm.pojo.Menu;
import scb.dev.sms.util.factory.ToolFactory;

/**
 * ClassName: MenuTreeUtilTest <br/>
 * Description: MenuTreeUtilTest. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月8日 下午1:55:40 <br/>
 */
public class MenuTreeUtilTest {

	@Test
	public void test() {
		Menu menu1 = new Menu("1001", "福建", "1", 2);
		Menu menu2 = new Menu("1001001", "厦门", "1001", 0);
		Menu menu3 = new Menu("1002", "上海", "1", 1);
		List<Menu> mlist = Arrays.asList(menu1, menu2, menu3);
		List<Menu> treeList = (ToolFactory.getInstanceOfMenuTreeUtil().turnedToMenuTree(mlist));
		System.out.println(JSON.toJSONString(treeList));
	}
}
