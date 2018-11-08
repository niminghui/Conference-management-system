/**
 * Project Name:clps.sms
 * File Name:TokenIDFactory.java
 * Package Name:com.clps.dev.sms.util.factory
 * Date:2018年10月31日下午9:16:57
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.util.factory;

import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;

import scb.dev.sms.common.CommonDateFormat;
import scb.dev.sms.util.tool.MD5Utils;

/**
 * ClassName: TokenIDFactory <br/>
 * Description: get TokenID and UUID.<br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年10月31日 下午9:16:57 <br/>
 */
public class TokenIDFactory {
	/**
	 * 得到32位连续无'-'的UUID字符串.<br/>
	 * 
	 * @return String
	 */
	public static String getUUID() {
		String uuid = UUID.randomUUID().toString();
		String[] uuids = uuid.split("-");
		String result = "";
		for (String string : uuids) {
			result += string;
		}
		return result;
	}

	/**
	 * 
	 * 得到8位的UUID.<br/>
	 * 
	 * @return String
	 */
	public static String get8BitUUID() {
		String UUID = getUUID();
		String UUID8 = "";
		for (int i = 0; i < 8; i++) {
			int index = (int) (Math.random() * 32);
			UUID8 += UUID.substring(index, index + 1);
		}
		return UUID8;
	}

	/**
	 * 
	 * tokenID是一个32位数的16进制的字符串 。1~8位表示当地时区偏移量（毫秒） 9~16位表示采取哪种操作类型 17~24位表示当前的日期时间
	 * 25~32位表示8位UUID随机值
	 * 
	 * @param String operationType 操作类型
	 * @return String tokenID
	 */
	public static String getTokenID(String operationType) {
		String tokenID = "";
		try {
			tokenID += TimeZone.getDefault().getRawOffset();
			tokenID += operationType;
			String dateString = ToolFactory.getInstanceOfDateTool().dateToString(new Date(),
					CommonDateFormat.yy_MM_dd_HH);
			tokenID += dateString;
			tokenID += get8BitUUID();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tokenID;
	}

	/**
	 * 
	 * 得到MD5加密后的TokenID.<br/>
	 * 
	 * @param String operationType 操作类型
	 * @return String
	 */
	public static String getMD5TokenID(String operationType) {
		String tokenID = getTokenID(operationType);
		tokenID = MD5Utils.MD5(tokenID);
		return tokenID;
	}
}
