/**
 * Project Name:clps.sms
 * File Name:AccountServiceImpl.java
 * Package Name:com.clps.dev.sms.sm.service.imp
 * Date:2018年11月1日下午2:22:44
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.service.imp;

import java.util.List;

import scb.dev.sms.common.CommonData;
import scb.dev.sms.sm.dao.AccountDAO;
import scb.dev.sms.sm.dao.imp.AccountDAOImpl;
import scb.dev.sms.sm.pojo.Account;
import scb.dev.sms.sm.service.IAccountService;
import scb.dev.sms.sm.vo.AccountVO;

/**
 * ClassName: AccountServiceImpl <br/>
 * Description: AccountServiceImpl. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月1日 下午2:22:44 <br/>
 */
public class AccountServiceImpl implements IAccountService {

	private AccountDAO accountDao;
	private String result;
	private List<AccountVO> accountVOList = null;

	/**
	 * Creates a new instance of AccountServiceImpl.
	 *
	 */

	public AccountServiceImpl() {
		super();
		this.accountDao = new AccountDAOImpl();
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * 
	 * @see com.clps.dev.sms.service.IAccountService#addAccount(com.clps.dev.sms.pojo.Account)
	 */
	@Override
	public String addAccount(Account account) {
		if (null != account) {
			if (this.accountDao.saveAccount(account)) {
				return CommonData.SAVE_SUCCESS;
			} else {
				return CommonData.SAVE_FAILURE;
			}
		}
		return "";
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * 
	 * @see com.clps.dev.sms.service.IAccountService#queryAllAccountVO()
	 */
	@Override
	public List<AccountVO> queryAllAccountVO() {
		this.accountDao.queryAllAccounts();
		return null;
	}

	public String updateAccount() {
		return "";
	}

	public String deleteAccount() {
		return "";
	}
}
