/**
 * Project Name:clps.sms
 * File Name:ToolFactory.java
 * Package Name:com.clps.dev.sms.util.factory
 * Date:2018年10月31日下午2:19:09
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.util.factory;

import scb.dev.sms.util.date.DateTool;
import scb.dev.sms.util.tree.MenuTreeUtil;

/**
 * ClassName: ToolFactory <br/>
 * Description: ToolFactory. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年10月31日 下午2:19:09 <br/>
 */
public class ToolFactory {
	public static DateTool getInstanceOfDateTool() {
		return new DateTool();
	}

	public static MenuTreeUtil getInstanceOfMenuTreeUtil() {
		return new MenuTreeUtil();
	}
}
