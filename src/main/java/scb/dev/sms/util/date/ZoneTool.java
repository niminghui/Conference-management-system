/**
 * Project Name:clps.sms
 * File Name:ZoneTool.java
 * Package Name:com.clps.dev.sms.util.date
 * Date:2018年11月1日上午9:26:10
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.util.date;

import java.util.TimeZone;

/**
 * ClassName: ZoneTool <br/>
 * Description: TODO ADD REASON(可选). <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月1日 上午9:26:10 <br/>
 */
public class ZoneTool {
	public static int getOffset() {
		return TimeZone.getDefault().getRawOffset();
	}

	public static int getZone() {
		return getOffset() / (1000 * 60 * 60);
	}
}
