/**
 * Project Name:scb.sms
 * File Name:LogonLogServiceImpl.java
 * Package Name:scb.dev.sms.log.service.impl
 * Date:2018年11月16日上午10:36:15
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.log.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import scb.dev.sms.log.dao.LogonLogDao;
import scb.dev.sms.log.pojo.LogonLog;
import scb.dev.sms.log.service.ILogonLogService;

/**
 * ClassName: LogonLogServiceImpl <br/>
 * Description: TODO ADD REASON(可选). <br/><br/>
 * date: 2018年11月16日 上午10:36:15 <br/>
 *
 * @author Oscar.Zhang
 * @version V1.0
 * @since JDK 1.8
 */
public class LogonLogServiceImpl implements ILogonLogService {
	@Autowired
	LogonLogDao logonLogDao;
	/**
	 * 添加logonLog日志
	 * @see scb.dev.sms.log.service.ILogonLogService#addlogonLog(scb.dev.sms.log.pojo.LogonLog)
	 */
	@Override
	public String addlogonLog(LogonLog logonLog) {
		return logonLogDao.insert(logonLog)==1?"SUCCESS":"ERROR";
	}
	/**
	 * 删除logonLog日志
	 * @see scb.dev.sms.log.service.ILogonLogService#deleteLogonLog(java.lang.String)
	 */
	@Override
	public String deleteLogonLog(String LogonLogId) {

		return logonLogDao.deleteByPrimaryKey(LogonLogId)==1?"SUCCESS":"ERROR";
	}

}
