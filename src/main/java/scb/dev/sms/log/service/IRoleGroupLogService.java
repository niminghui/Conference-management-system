/**
 * Project Name:scb.sms
 * File Name:IRoleGroupLogService.java
 * Package Name:scb.dev.sms.log.service
 * Date:2018年11月16日上午10:48:19
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.log.service;

import scb.dev.sms.log.pojo.RoleGroupLog;

/**
 * ClassName: IRoleGroupLogService <br/>
 * Description: IRoleGroupLogService <br/>
 * date: 2018年11月16日 上午10:48:19 <br/>
 *
 * @author Oscar.Zhang
 * @version V1.0
 * @since JDK 1.8
 */
public interface IRoleGroupLogService {
	public String addRoleGroupLog(RoleGroupLog roleGroupLog);

	public String deleteRoleGroupLog(String RoleGroupLogId);
}
