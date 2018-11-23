/**
 * Project Name:scb.sms
 * File Name:JMailTest.java
 * Package Name:scb.dev.sms.util.tool
 * Date:2018年11月23日上午10:08:41
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.util.tool;

/**
 * ClassName: JMailTest <br/>
 * Description: JMailTest <br/>
 * date: 2018年11月23日 上午10:08:41 <br/>
 *
 * @author Zither.Chen
 * @version V1.0
 * @since JDK 1.8
 */
public class JMailTest {
	// 测试方法
	public static void main(String[] args) throws Exception {

		JMail.sendMail("zither_chen@163.com", "zither_chen", "CHENKE517", "1070726094@qq.com", "Java Mail 测试邮件", "123");
	}
}
