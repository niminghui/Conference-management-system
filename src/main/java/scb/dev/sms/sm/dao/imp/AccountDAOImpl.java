/**
 * Project Name:clps.sms
 * File Name:AccountDAOImpl.java
 * Package Name:com.clps.dev.sms.sm.dao.imp
 * Date:2018年10月31日下午1:14:55
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.dao.imp;

import java.util.ArrayList;
import java.util.List;

import scb.dev.sms.sm.dao.AccountDAO;
import scb.dev.sms.sm.pojo.Account;

/**
 * ClassName: AccountDAOImpl <br/>
 * Description: TODO ADD REASON(可选). <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年10月31日 下午1:14:55 <br/>
 */
public class AccountDAOImpl implements AccountDAO {
	private List<Account> accountsList = null;

	public AccountDAOImpl() {
		this.accountsList = new ArrayList<>();
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * 
	 * @see com.clps.dev.sms.sm.dao.AccountDAO#deleteAccountById(java.lang.String)
	 */
	@Override
	public Boolean deleteAccountById(String accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * 
	 * @see com.clps.dev.sms.sm.dao.AccountDAO#queryAccountByCondition()
	 */
	@Override
	public List<Account> queryAccountByCondition() {
		this.accountsList.add(new Account());
		this.accountsList.add(new Account());
		this.accountsList.add(new Account());
		this.accountsList.add(new Account());
		return accountsList;
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * 
	 * @see com.clps.dev.sms.sm.dao.AccountDAO#queryAccountById(java.lang.String)
	 */
	@Override
	public Account queryAccountById(String accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * 
	 * @see com.clps.dev.sms.sm.dao.AccountDAO#queryAllAccounts()
	 */
	@Override
	public List<Account> queryAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * 
	 * @see com.clps.dev.sms.sm.dao.AccountDAO#saveAccount(com.clps.dev.sms.pojo.Account)
	 */
	@Override
	public Boolean saveAccount(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * 
	 * @see com.clps.dev.sms.sm.dao.AccountDAO#updateAccountById(com.clps.dev.sms.pojo.Account)
	 */
	@Override
	public Boolean updateAccountById(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

}
