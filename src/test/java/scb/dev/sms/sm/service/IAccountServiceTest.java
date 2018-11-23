/**
 * Project Name:scb.sms
 * File Name:IAccountServiceTest.java
 * Package Name:scb.dev.sms.sm.service
 * Date:2018年11月16日上午9:06:40
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.service;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ClassName: IAccountServiceTest <br/>
 * Description: IAccountServiceTest. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月16日 上午9:06:40 <br/>
 */
@ContextConfiguration(locations = { "/applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class IAccountServiceTest {

	private Logger logger = Logger.getLogger(IAccountServiceTest.class);
	@Autowired
	private IAccountService accountService;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link scb.dev.sms.sm.service.IAccountService#initAccount(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testInitAccount() {
		String employee_id = "deae96b244a94fef943be5dcc8309792";
		String employee_nickname = "Ricardo.Ni";
		logger.info("init account");
		logger.info(accountService.initAccount(employee_id, employee_nickname));
	}

	/**
	 * Test method for
	 * {@link scb.dev.sms.sm.service.IAccountService#validateAccount(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testValidateAccount() {
		String account_name = "Steve_Ni";
		String account_password = "123456";
		String message = accountService.validateAccount(account_name, account_password);
		Assert.assertEquals("success", message);
	}

	/**
	 * Test method for
	 * {@link scb.dev.sms.sm.service.IAccountService#updateAccountName(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUpdateAccountName() {
		String account_id = "7650fedf98e34f4191ffc8a3b59ca060";
		String new_name = "Steve.Ni";
		String message = accountService.updateAccountName(account_id, new_name);
		logger.info(message);
		// Assert.assertEquals("success", message);
	}

	/**
	 * Test method for
	 * {@link scb.dev.sms.sm.service.IAccountService#updateAccountPwd(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUpdateAccountPwd() {
		String account_id = "7650fedf98e34f4191ffc8a3b59ca060";
		String new_pwd = "123";
		String message = accountService.updateAccountPwd(account_id, new_pwd);
		Assert.assertEquals("success", message);
	}

}
