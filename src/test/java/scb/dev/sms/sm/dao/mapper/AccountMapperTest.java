/**
 * Project Name:scb.sms
 * File Name:AccountMapperTest.java
 * Package Name:scb.dev.sms.sm.dao.mapper
 * Date:2018年11月13日上午11:56:18
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.dao.mapper;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import scb.dev.sms.sm.dao.AccountMapper;

/**
 * ClassName: AccountMapperTest <br/>
 * Description: AccountMapperTest. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月13日 上午11:56:18 <br/>
 */
@ContextConfiguration("/applicationContext.xml")
public class AccountMapperTest {
	@Autowired
	private AccountMapper mapper;
	private Logger logger = Logger.getLogger(AccountMapperTest.class);

	@Test
	public void test() {
		logger.info(mapper.selectByPrimaryKey("1"));
	}

}
