/**
 * Project Name:scb.sms
 * File Name:IAccountLogServiceTest.java
 * Package Name:scb.dev.sms.log.service
 * Date:2018年11月22日下午5:27:56
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.log.service;

import static org.junit.Assert.fail;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import scb.dev.sms.common.CommonOperationType;
import scb.dev.sms.log.pojo.AccountLog;
import scb.dev.sms.util.factory.TokenIDFactory;

/**
 * ClassName: IAccountLogServiceTest <br/>
 * Description: IAccountLogServiceTest. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月22日 下午5:27:56 <br/>
 */
@ContextConfiguration(locations = { "/logApplicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class IAccountLogServiceTest {

	@Autowired
	private IAccountLogService accountLogService;
	private Logger logger = Logger.getLogger(IAccountLogServiceTest.class);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link scb.dev.sms.log.service.IAccountLogService#addAccountLog(scb.dev.sms.log.pojo.AccountLog)}.
	 */
	@Test
	public void testAddAccountLog() {
		AccountLog accountLog = new AccountLog();
		accountLog.setLogAccountId(TokenIDFactory.getUUID());
		accountLog.setLogAccountOperatorEid("deae96b244a94fef943be5dcc8309792");
		accountLog.setLogAccountOperatorType(CommonOperationType.LOGIN);
		accountLog.setLogAccountOperatorTime(new Date());
		accountLogService.addAccountLog(accountLog);
	}

	/**
	 * Test method for
	 * {@link scb.dev.sms.log.service.IAccountLogService#deleteAccountLog(java.lang.String)}.
	 */
	@Test
	public void testDeleteAccountLog() {
		fail("Not yet implemented");
	}

}
