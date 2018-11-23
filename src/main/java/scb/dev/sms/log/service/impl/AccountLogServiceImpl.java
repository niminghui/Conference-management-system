/**
 * Project Name:scb.sms
 * File Name:AccountLogServiceImpl.java
 * Package Name:scb.dev.sms.log.service.impl
 * Date:2018年11月16日上午10:17:20
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.log.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scb.dev.sms.common.CommonData;
import scb.dev.sms.log.dao.AccountLogDao;
import scb.dev.sms.log.pojo.AccountLog;
import scb.dev.sms.log.service.IAccountLogService;

/**
 * ClassName: AccountLogServiceImpl <br/>
 * Description: AccountLogServiceImpl <br/>
 * date: 2018年11月16日 上午10:17:20 <br/>
 * 
 * @author Oscar.Zhang
 * @version V1.0
 * @since JDK 1.8
 */
@Service
public class AccountLogServiceImpl implements IAccountLogService {

	@Autowired
	AccountLogDao accountLogDao;

	/**
	 * 添加accountLog日志
	 * 
	 * @see scb.dev.sms.log.service.IAccountLogService#addAccountLog(scb.dev.sms.log.pojo.AccountLog)
	 */
	@Override
	public String addAccountLog(AccountLog accountLog) {
		return accountLogDao.insert(accountLog) == 1 ? CommonData.STRING_SUCCESS : CommonData.STRING_FAILURE;
	}

	/**
	 * 删除accountLog日志
	 * 
	 * @see scb.dev.sms.log.service.IAccountLogService#deleteAccountLog(java.lang.String)
	 */
	@Override
	public String deleteAccountLog(String AccountLogId) {
		return accountLogDao.deleteByPrimaryKey(AccountLogId) == 1 ? CommonData.STRING_SUCCESS
				: CommonData.STRING_FAILURE;
	}

}
