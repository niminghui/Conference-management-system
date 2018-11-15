/**
 * Project Name:clps.sms
 * File Name:MD5Utils.java
 * Package Name:com.clps.dev.sms.util
 * Date:2018年10月31日下午9:50:04
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.util.tool;

import java.security.MessageDigest;

/**
 * ClassName: MD5Utils <br/>
 * Description: MD5 encryption tool class. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年10月31日 下午9:50:04 <br/>
 */
public class MD5Utils {
	/**
	 * 
	 * 对String进行md5加密.<br/>
	 * 
	 * @param originString:待加密String
	 * @return String:经过md5加密的String
	 */
	public final static String MD5(String originString) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			byte[] originBytes = originString.getBytes();
			// 获得MD5摘要算法的 MessageDigest 对象
			MessageDigest md = MessageDigest.getInstance("MD5");
			// 使用指定的字节更新摘要
			md.update(originBytes);
			// 获得密文
			byte[] mdBytes = md.digest();
			// 把密文转换成十六进制的字符串形式
			int j = mdBytes.length;
			char md5Str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = mdBytes[i];
				md5Str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				md5Str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(md5Str);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
