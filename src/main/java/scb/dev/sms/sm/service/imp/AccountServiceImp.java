/**
 * Project Name:scb.sms
 * File Name:AccountServiceImp.java
 * Package Name:scb.dev.sms.sm.service.imp
 * Date:2018年11月15日上午11:08:20
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scb.dev.sms.sm.dao.AccountDao;
import scb.dev.sms.sm.pojo.Account;
import scb.dev.sms.sm.service.IAccountService;
import scb.dev.sms.util.factory.TokenIDFactory;

/**
 * ClassName: AccountServiceImp <br/>
 * Description: AccountServiceImp. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月15日 上午11:08:20 <br/>
 */
@Service
public class AccountServiceImp implements IAccountService {
	@Autowired
	private AccountDao accountDao;

	/**
	 * Description: 创建职员时调用此方法，用于同步初始化职员账户.
	 * 
	 * @see scb.dev.sms.sm.service.IAccountService#initAccount(java.lang.String)
	 */
	@Override
	public String initAccount(String employee_id, String employee_nickname) {
		Account account = new Account();
		// 账户ID设置为职员ID
		account.setAccountId(employee_id);
		// 账户初始名称为职员昵称
		account.setAccountName(employee_nickname);
		// 账户初始密码随机生成
		account.setAccountPassword(TokenIDFactory.get8BitUUID());
		return accountDao.insert(account) == 1 ? "success" : "false";
	}

}
