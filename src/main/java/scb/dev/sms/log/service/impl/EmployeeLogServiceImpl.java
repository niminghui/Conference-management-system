/**
 * Project Name:scb.sms
 * File Name:EmployeeLogServiceImpl.java
 * Package Name:scb.dev.sms.log.service.impl
 * Date:2018年11月16日上午10:27:43
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.log.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scb.dev.sms.log.dao.EmployeeLogDao;
import scb.dev.sms.log.pojo.EmployeeLog;
import scb.dev.sms.log.service.IEmployeeLogService;

/**
 * ClassName: EmployeeLogServiceImpl <br/>
 * Description: EmployeeLogServiceImpl <br/>
 * date: 2018年11月16日 上午10:27:43 <br/>
 *
 * @author Oscar.Zhang
 * @version V1.0
 * @since JDK 1.8
 */
@Service
public class EmployeeLogServiceImpl implements IEmployeeLogService {

	@Autowired
	EmployeeLogDao employeeLogDao;

	/**
	 * 添加employeeLog日志
	 * 
	 * @see scb.dev.sms.log.service.IEmployeeLogService#addEmployeeLog(scb.dev.sms.log.pojo.EmployeeLog)
	 */
	@Override
	public String addEmployeeLog(EmployeeLog employeeLog) {
		return employeeLogDao.insert(employeeLog) == 1 ? "SUCCESS" : "ERROR";
	}

	/**
	 * 删除employee日志
	 * 
	 * @see scb.dev.sms.log.service.IEmployeeLogService#deleteEmployeeLog(java.lang.String)
	 */
	@Override
	public String deleteEmployeeLog(String EmployeeLogId) {

		return employeeLogDao.deleteByPrimaryKey(EmployeeLogId) == 1 ? "SUCCESS" : "ERROR";
	}

}
