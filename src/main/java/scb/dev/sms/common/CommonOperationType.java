/**
 * Project Name:clps.sms
 * File Name:CommanOperationType.java
 * Package Name:com.clps.dev.sms.common
 * Date:2018年10月31日下午9:34:07
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.common;

/**
 * ClassName: CommanOperationType <br/>
 * Description: 公共操作类型. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年10月31日 下午9:34:07 <br/>
 */
public interface CommonOperationType {
	public static final String LOGIN = "00000001";
	public static final String REGISTER = "00000002";
	public static final String REMENBER_PASSWORD = "00000003";
	public static final String FORGET_PASSWORD = "00000004";
	public static final String LOGOUT = "00000005";
}
