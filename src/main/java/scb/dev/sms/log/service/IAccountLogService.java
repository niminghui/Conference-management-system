/**
 * Project Name:scb.sms
 * File Name:IAccountLogService.java
 * Package Name:scb.dev.sms.log.service
 * Date:2018年11月16日上午10:11:18
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.log.service;

import scb.dev.sms.log.pojo.AccountLog;

/**
 * ClassName: IAccountLogService <br/>
 * Description: IAccountLogService <br/>
 * date: 2018年11月16日 上午10:11:18 <br/>
 *
 * @author Oscar.Zhang
 * @version V1.0
 * @since JDK 1.8
 */
public interface IAccountLogService {
	public String addAccountLog(AccountLog accountLog);

	public String deleteAccountLog(String AccountLogId);
}
