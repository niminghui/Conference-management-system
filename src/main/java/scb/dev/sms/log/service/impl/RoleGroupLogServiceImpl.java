/**
 * Project Name:scb.sms
 * File Name:RoleGroupLogServiceImpl.java
 * Package Name:scb.dev.sms.log.service.impl
 * Date:2018年11月16日上午10:49:40
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.log.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import scb.dev.sms.log.dao.RoleGroupLogDao;
import scb.dev.sms.log.pojo.RoleGroupLog;
import scb.dev.sms.log.service.IRoleGroupLogService;

/**
 * ClassName: RoleGroupLogServiceImpl <br/>
 * Description: TODO ADD REASON(可选). <br/><br/>
 * date: 2018年11月16日 上午10:49:40 <br/>
 *
 * @author Oscar.Zhang
 * @version V1.0
 * @since JDK 1.8
 */
public class RoleGroupLogServiceImpl implements IRoleGroupLogService {
	@Autowired
	RoleGroupLogDao roleGroupLogDao;
	/**
	 * 添加RoleGroupLog日志
	 * @see scb.dev.sms.log.service.IRoleGroupLogService#addRoleGroupLog(scb.dev.sms.log.pojo.RoleGroupLog)
	 */
	@Override
	public String addRoleGroupLog(RoleGroupLog roleGroupLog) {
		return roleGroupLogDao.insert(roleGroupLog)==1?"SUCCESS":"ERROR";
	}
	/**
	 *删除RoleGroupLog日志
	 * @see scb.dev.sms.log.service.IRoleGroupLogService#deleteRoleGroupLog(java.lang.String)
	 */
	@Override
	public String deleteRoleGroupLog(String RoleGroupLogId) {
		
		return roleGroupLogDao.deleteByPrimaryKey(RoleGroupLogId)==1?"SUCCESS":"ERROR";
	}

}
