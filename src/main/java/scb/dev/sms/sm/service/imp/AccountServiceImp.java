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

import scb.dev.sms.common.CommonData;
import scb.dev.sms.sm.dao.AccountDao;
import scb.dev.sms.sm.pojo.Account;
import scb.dev.sms.sm.service.IAccountService;
import scb.dev.sms.util.factory.TokenIDFactory;
import scb.dev.sms.util.tool.MD5Utils;

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
		return accountDao.insert(account) == 1 ? CommonData.STRING_SUCCESS : CommonData.STRING_FAILURE;
	}

	/**
	 * Description: 登录时校验账户名称与密码的合法性.
	 * 
	 * @see scb.dev.sms.sm.service.IAccountService#validateAccount(scb.dev.sms.sm.pojo.Account)
	 */
	@Override
	public String validateAccount(String account_name, String account_pwd) {
		Account account = accountDao.selectByAccountName(account_name);
		if (account == null)
			return CommonData.STRING_ACCOUNT_NOTFOUND;
		String password = MD5Utils.MD5(account_pwd);
		if (account.getAccountName().equals(account_name) && account.getAccountPassword().equals(password))
			return CommonData.STRING_SUCCESS;
		return CommonData.STRING_FAILURE;
	}

	/**
	 * Description: 修改账户名字.
	 * 
	 * @see scb.dev.sms.sm.service.IAccountService#updateAccountName(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public String updateAccountName(String account_id, String new_accountName) {
		Account account = accountDao.selectByAccountId(account_id);
		if (accountDao.selectAccountIdByAccountName(new_accountName) != null)
			return CommonData.STRING_ACCOUNT_EXIST;
		account.setAccountName(new_accountName);
		return accountDao.updateByAccountId(account) == 1 ? CommonData.STRING_SUCCESS : CommonData.STRING_FAILURE;
	}

	/**
	 * Description: 修改账户密码.
	 * 
	 * @see scb.dev.sms.sm.service.IAccountService#updateAccountPwd(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public String updateAccountPwd(String account_id, String new_pwd) {
		Account account = accountDao.selectByAccountId(account_id);
		String password = MD5Utils.MD5(new_pwd);
		account.setAccountPassword(password);
		return accountDao.updateByAccountId(account) == 1 ? CommonData.STRING_SUCCESS : CommonData.STRING_FAILURE;
	}

	/**
	 * Description: 通过账户名字得到账户编号.<br/>
	 * 
	 * @see scb.dev.sms.sm.service.IAccountService#getAccountID(java.lang.String)
	 */
	@Override
	public String getAccountID(String account_name) {
		return accountDao.selectAccountIdByAccountName(account_name);
	}

}
