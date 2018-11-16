/**
 * Project Name:scb.sms
 * File Name:IMenuLogService.java
 * Package Name:scb.dev.sms.log.service
 * Date:2018年11月16日上午10:39:17
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.log.service;


import scb.dev.sms.log.pojo.MenuLog;

/**
 * ClassName: IMenuLogService <br/>
 * Description: TODO ADD REASON(可选). <br/><br/>
 * date: 2018年11月16日 上午10:39:17 <br/>
 *
 * @author Oscar.Zhang
 * @version V1.0
 * @since JDK 1.8
 */
public interface IMenuLogService {
	public String addMenuLog(MenuLog menuLog);
	public String deleteMenuLog(String MenuLogId);
}
