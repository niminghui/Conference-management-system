/**
 * Project Name:scb.sms
 * File Name:AccountDaoTest.java
 * Package Name:scb.dev.sms.sm.dao
 * Date:2018年11月14日下午3:27:29
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.dao;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import scb.dev.sms.sm.pojo.Account;
import scb.dev.sms.util.factory.TokenIDFactory;

/**
 * ClassName: AccountDaoTest <br/>
 * Description: AccountDaoTest. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月14日 下午3:27:29 <br/>
 */
@ContextConfiguration(locations = { "/applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class AccountDaoTest {
	@Autowired
	private AccountDao accountDao;
	private Logger logger = Logger.getLogger(Logger.class);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link scb.dev.sms.sm.dao.AccountDao#deleteByAccountId(java.lang.String)}.
	 */
	@Test
	public void testDeleteByAccountId() {
		String account_id = accountDao.selectAccountIdByAccountName("Steve_Ni");
		logger.info("DeleteByAccountId");
		try {
			// 断言修改行数为1
			Assert.assertEquals(1, accountDao.deleteByAccountId(account_id));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}

	/**
	 * Test method for
	 * {@link scb.dev.sms.sm.dao.AccountDao#insert(scb.dev.sms.sm.pojo.Account)}.
	 */
	@Test
	public void testInsert() {
		Account account = new Account(TokenIDFactory.getUUID(), "Steve_Ni", "123456");
		logger.info("insert account");
		try {
			// 断言修改行数为1
			Assert.assertEquals(1, accountDao.insert(account));
			logger.info("insert success");
		} catch (Exception e) {
			logger.info("insert fail");
		}
	}

	/**
	 * Test method for
	 * {@link scb.dev.sms.sm.dao.AccountDao#selectByAccountId(java.lang.String)}.
	 */
	@Test
	public void testSelectByAccountId() {
		String account_id = accountDao.selectAccountIdByAccountName("Steve_Ni");
		logger.info("SelectByAccountId");
		try {
			// 断言不为空
			Assert.assertNotNull(accountDao.selectByAccountId(account_id));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}

	/**
	 * Test method for
	 * {@link scb.dev.sms.sm.dao.AccountDao#selectByAccountName(java.lang.String)}.
	 */
	@Test
	public void testSelectByAccountName() {
		logger.info("SelectByAccountName");
		try {
			// 断言不为空
			Assert.assertNotNull(accountDao.selectByAccountName("Steve_Ni"));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}

	/**
	 * Test method for
	 * {@link scb.dev.sms.sm.dao.AccountDao#selectAccountIdByAccountName(java.lang.String)}.
	 */
	@Test
	public void testSelectAccountIdByAccountName() {
		String account_name = "Steve_Ni";
		logger.info("SelectAccountIdByAccountName");
		try {
			// 断言不为空
			Assert.assertNotNull(accountDao.selectAccountIdByAccountName(account_name));
			logger.info("success");
			logger.info(accountDao.selectAccountIdByAccountName(account_name));
		} catch (Exception e) {
			logger.info("fail");
		}
	}

	/**
	 * Test method for
	 * {@link scb.dev.sms.sm.dao.AccountDao#updateByAccountIdSelective(scb.dev.sms.sm.pojo.Account)}.
	 */
	@Test
	public void testUpdateByAccountIdSelective() {
		String account_id = accountDao.selectAccountIdByAccountName("Steve_Ni");
		Account account = new Account(account_id, "Steve_Ni", "147258369");
		logger.info("UpdateByAccountIdSelective");
		try {
			// 断言修改行数为1
			Assert.assertEquals(1, accountDao.updateByAccountIdSelective(account));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}
}
