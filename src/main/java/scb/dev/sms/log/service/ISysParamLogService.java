/**
 * Project Name:scb.sms
 * File Name:ISysParamLogService.java
 * Package Name:scb.dev.sms.log.service
 * Date:2018年11月16日上午10:54:28
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.log.service;

import scb.dev.sms.log.pojo.SysParamLog;

/**
 * ClassName: ISysParamLogService <br/>
 * Description: ISysParamLogService <br/>
 * date: 2018年11月16日 上午10:54:28 <br/>
 *
 * @author Oscar.Zhang
 * @version V1.0
 * @since JDK 1.8
 */

public interface ISysParamLogService {
	public String addSysParamLog(SysParamLog sysParamLog);

	public String deleteSysparamLog(String SysParamLogId);
}
