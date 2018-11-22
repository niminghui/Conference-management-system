/**
 * Project Name:scb.sms
 * File Name:ILogonLogService.java
 * Package Name:scb.dev.sms.log.service
 * Date:2018年11月16日上午10:34:49
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.log.service;

import scb.dev.sms.log.pojo.LogonLog;

/**
 * ClassName: ILogonLogService <br/>
 * Description: ILogonLogService <br/>
 * date: 2018年11月16日 上午10:34:49 <br/>
 *
 * @author Oscar.Zhang
 * @version V1.0
 * @since JDK 1.8
 */
public interface ILogonLogService {
	public String addlogonLog(LogonLog logonLog);

	public String deleteLogonLog(String LogonLogId);
}
