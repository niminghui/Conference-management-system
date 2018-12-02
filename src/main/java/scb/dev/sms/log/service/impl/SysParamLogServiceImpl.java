/**
 * Project Name:scb.sms
 * File Name:SysParamLogServiceImpl.java
 * Package Name:scb.dev.sms.log.service.impl
 * Date:2018年11月16日上午10:55:54
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.log.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import scb.dev.sms.log.dao.SysParamLogDao;
import scb.dev.sms.log.pojo.SysParamLog;
import scb.dev.sms.log.service.ISysParamLogService;

/**
 * ClassName: SysParamLogServiceImpl <br/>
 * Description: SysParamLogServiceImpl <br/>
 * date: 2018年11月16日 上午10:55:54 <br/>
 *
 * @author Oscar.Zhang
 * @version V1.0
 * @since JDK 1.8
 */
public class SysParamLogServiceImpl implements ISysParamLogService {

	@Autowired
	SysParamLogDao sysParamLogDao;

	/**
	 * 添加SysParamLog日志
	 * 
	 * @see scb.dev.sms.log.service.ISysParamLogService#addSysParamLog(scb.dev.sms.log.pojo.SysParamLog)
	 */
	@Override
	public String addSysParamLog(SysParamLog sysParamLog) {
		return sysParamLogDao.insert(sysParamLog) == 1 ? "SUCCESS" : "ERROR";
	}

	/**
	 * 删除SysParamLog日志
	 * 
	 * @see scb.dev.sms.log.service.ISysParamLogService#deleteSysparamLog(java.lang.String)
	 */
	@Override
	public String deleteSysparamLog(String SysParamLogId) {
		return sysParamLogDao.deleteByPrimaryKey(SysParamLogId) == 1 ? "SUCCESS" : "ERROR";
	}

}
