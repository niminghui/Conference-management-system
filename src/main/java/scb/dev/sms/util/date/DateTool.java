/**
 * Project Name:clps.sms
 * File Name:DateTool.java
 * Package Name:com.clps.dev.sms.util
 * Date:2018年10月31日下午1:51:50
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: DateTool <br/>
 * Description: TODO Date and String Convert. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年10月31日 下午1:51:50 <br/>
 */
public class DateTool {
	private SimpleDateFormat dateFormat;

	/**
	 * 
	 * dateToString.<br/>
	 * 
	 * @param Date date, String format(CommonDateFormat)
	 * @return String
	 */
	public String dateToString(Date date, String format) throws Exception {
		dateFormat = new SimpleDateFormat(format);
		String dateString = dateFormat.format(date);
		return dateString;
	}

	/**
	 * 
	 * stringToDate.<br/>
	 * 
	 * @param String dateString, String format(CommonDateFormat)
	 * @return Date
	 */
	public Date stringToDate(String dateString, String format) throws Exception {
		dateFormat = new SimpleDateFormat(format);
		Date date = dateFormat.parse(dateString);
		return date;
	}

	public void toMatch() {

	}
}
