/**
 * Project Name:clps.sms
 * File Name:AccountDAO.java
 * Package Name:com.clps.dev.sms.sm.dao
 * Date:2018年10月31日下午1:13:33
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.dao;

import java.util.List;

import scb.dev.sms.sm.pojo.Account;

/**
 * ClassName: AccountDAO <br/>
 * Description: AccountDAO. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年10月31日 下午1:13:33 <br/>
 */
public interface AccountDAO {
	/**
	 * 
	 * queryAllAccounts:<br/>
	 * 
	 * @param
	 * @return List<Account>
	 */
	public List<Account> queryAllAccounts();

	/**
	 * 
	 * updateAccountById:<br/>
	 * 
	 * @param Account object
	 * @return Boolean=> true update data success, false update data failure
	 */
	public Boolean updateAccountById(Account account);

	/**
	 * 
	 * deleteAccountById:<br/>
	 * 
	 * @param String accountId
	 * @return Boolean=> true delete data success, false delete data failure
	 */
	public Boolean deleteAccountById(String accountId);

	/**
	 * 
	 * saveAccount:<br/>
	 * 
	 * @param Account object
	 * @return Boolean=> true save data success, false save data failure
	 */
	public Boolean saveAccount(Account account);

	/**
	 * 
	 * queryAccountById:<br/>
	 * 
	 * @param String accountId
	 * @return Account object
	 */
	public Account queryAccountById(String accountId);

	/**
	 * 
	 * queryAccountByCondition:<br/>
	 * 
	 * @param
	 * @return List<Account>
	 */
	public List<Account> queryAccountByCondition();

	default void mm() {

	}
}