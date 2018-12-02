/**
 * Project Name:scb.sms
 * File Name:MenuLogServiceImpl.java
 * Package Name:scb.dev.sms.log.service.impl
 * Date:2018年11月16日上午10:40:09
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.log.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import scb.dev.sms.log.dao.MenuLogDao;
import scb.dev.sms.log.pojo.MenuLog;
import scb.dev.sms.log.service.IMenuLogService;

/**
 * ClassName: MenuLogServiceImpl <br/>
 * Description: MenuLogServiceImpl <br/>
 * date: 2018年11月16日 上午10:40:09 <br/>
 *
 * @author Oscar.Zhang
 * @version V1.0
 * @since JDK 1.8
 */
public class MenuLogServiceImpl implements IMenuLogService {
	@Autowired
	MenuLogDao menuLogDao;

	/**
	 * 添加menuLog日志
	 * 
	 * @see scb.dev.sms.log.service.IMenuLogService#addMenuLog(scb.dev.sms.log.pojo.MenuLog)
	 */
	@Override
	public String addMenuLog(MenuLog menuLog) {

		return menuLogDao.insert(menuLog) == 1 ? "SUCCESS" : "ERROR";
	}

	/**
	 * 删除menuLog日志
	 * 
	 * @see scb.dev.sms.log.service.IMenuLogService#deleteMenuLog(java.lang.String)
	 */
	@Override
	public String deleteMenuLog(String MenuLogId) {

		return menuLogDao.deleteByPrimaryKey(MenuLogId) == 1 ? "SUCCESS" : "ERROR";
	}

}
