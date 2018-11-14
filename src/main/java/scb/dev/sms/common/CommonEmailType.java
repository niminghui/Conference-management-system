/**
 * Project Name:clps.sms
 * File Name:CommonEmailType.java
 * Package Name:com.clps.dev.sms.common
 * Date:2018年11月1日下午2:31:42
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.common;

/**
 * ClassName: CommonEmailType <br/>
 * Description: 公共邮件类型. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月1日 下午2:31:42 <br/>
 */
public interface CommonEmailType {
	public static final String NO_EMAIL = "0001";
	public static final String CLPS_EMAIL = "0002";
	public static final String SCB_EMAIL = "0003";
	public static final String QQ_EMAIL = "0004";
	public static final String OTHERS_EMAIL = "0005";

	public static final String EMAIL_PERMISSION_NO = "1000";
	public static final String EMAIL_PERMISSION_READ = "2000";
	public static final String EMAIL_PERMISSION_SEND = "3000";
	public static final String EMAIL_PERMISSION_SEND_AND_READ = "4000";
	
	// 邮箱格式
	public static final String EMAIL_END_WITH = "@clpsglobal.com";	// 邮箱域名格式
	public static final String EMAIL_HOST="smtp.163.com";
	public static final String EMAIL_FROM="zither_chen@163.com";
	public static final String EMAIL_USERNAME="zither_chen@163.com";
	public static final String EMAIL_PASSWORD="CHENKE517CHENKE";
}
