/**
 * Project Name:scb.sms
 * File Name:IDepartmentLogService.java
 * Package Name:scb.dev.sms.log.service
 * Date:2018年11月16日上午10:22:46
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.log.service;

import scb.dev.sms.log.pojo.DepartmentLog;

/**
 * ClassName: IDepartmentLogService <br/>
 * Description: 
 * date: 2018年11月16日 上午10:22:46 <br/>
 *
 * @author Oscar.Zhang
 * @version V1.0
 * @since JDK 1.8
 */
public interface IDepartmentLogService {
	public String addDepartmentLog(DepartmentLog departmentLog);
	public String deleteDepartmentLog(String DepartmentLogId);
}
