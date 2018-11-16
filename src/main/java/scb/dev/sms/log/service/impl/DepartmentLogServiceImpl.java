/**
 * Project Name:scb.sms
 * File Name:DepartmentLogServiceImpl.java
 * Package Name:scb.dev.sms.log.service.impl
 * Date:2018年11月16日上午10:24:21
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.log.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import scb.dev.sms.log.dao.DepartmentLogDao;
import scb.dev.sms.log.pojo.DepartmentLog;
import scb.dev.sms.log.service.IDepartmentLogService;

/**
 * ClassName: DepartmentLogServiceImpl <br/>
 * Description: TODO ADD REASON(可选). <br/><br/>
 * date: 2018年11月16日 上午10:24:21 <br/>
 *
 * @author Oscar.Zhang
 * @version V1.0
 * @since JDK 1.8
 */
public class DepartmentLogServiceImpl implements IDepartmentLogService {

	@Autowired
	DepartmentLogDao departmentLogDao;
	/**
	 * 添加departmentLog日志
	 * @see scb.dev.sms.log.service.IDepartmentLogService#addDepartmentLog(scb.dev.sms.log.pojo.DepartmentLog)
	 */
	@Override
	public String addDepartmentLog(DepartmentLog departmentLog) {
		return departmentLogDao.insert(departmentLog)==1?"SUCCESS":"ERROR";
	}
	/**
	 * 删除departmentLog日志
	 * @see scb.dev.sms.log.service.IDepartmentLogService#deleteDepartmentLog(java.lang.String)
	 */
	@Override
	public String deleteDepartmentLog(String DepartmentLogId) {
		return departmentLogDao.deleteByPrimaryKey(DepartmentLogId)==1?"SUCCESS":"ERROR";
	}

}
