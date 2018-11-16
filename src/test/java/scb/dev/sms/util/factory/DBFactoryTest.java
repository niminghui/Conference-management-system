/**
 * Project Name:scb.sms
 * File Name:DBFactoryTest.java
 * Package Name:scb.dev.sms.util.factory
 * Date:2018年11月5日下午2:19:55
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.util.factory;

import java.sql.SQLException;

import org.junit.Test;

/**
 * ClassName: DBFactoryTest <br/>
 * Description: DBFactoryTest. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月5日 下午2:19:55 <br/>
 */
public class DBFactoryTest {

	/**
	 * Test method for {@link scb.dev.sms.util.factory.DBFactory#getConnection()}.
	 */
	@Test
	public void testGetConnection() {
		try {
			DBFactory.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
