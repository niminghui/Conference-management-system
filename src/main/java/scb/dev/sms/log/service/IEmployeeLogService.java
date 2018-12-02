/**
 * Project Name:scb.sms
 * File Name:IEmployeeLogService.java
 * Package Name:scb.dev.sms.log.service
 * Date:2018年11月16日上午10:26:16
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.log.service;

import scb.dev.sms.log.pojo.EmployeeLog;

/**
 * ClassName: IEmployeeLogService <br/>
 * Description: IEmployeeLogService <br/>
 * date: 2018年11月16日 上午10:26:16 <br/>
 *
 * @author Oscar.Zhang
 * @version V1.0
 * @since JDK 1.8
 */
public interface IEmployeeLogService {
	public String addEmployeeLog(EmployeeLog employeeLog);

	public String deleteEmployeeLog(String EmployeeLogId);
}
