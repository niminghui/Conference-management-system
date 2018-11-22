/**
 * Project Name:scb.sms
 * File Name:PositionLogServiceImpl.java
 * Package Name:scb.dev.sms.log.service.impl
 * Date:2018年11月16日上午10:45:11
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.log.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import scb.dev.sms.log.dao.PositionLogDao;
import scb.dev.sms.log.pojo.PositionLog;
import scb.dev.sms.log.service.IPositionLogService;

/**
 * ClassName: PositionLogServiceImpl <br/>
 * Description: PositionLogServiceImpl <br/>
 * date: 2018年11月16日 上午10:45:11 <br/>
 *
 * @author Oscar.Zhang
 * @version V1.0
 * @since JDK 1.8
 */
public class PositionLogServiceImpl implements IPositionLogService {
	@Autowired
	PositionLogDao positionLogDao;

	/**
	 * 添加PositionLog日志
	 * 
	 * @see scb.dev.sms.log.service.IPositionLogService#addPositionLog(scb.dev.sms.log.pojo.PositionLog)
	 */
	@Override
	public String addPositionLog(PositionLog positionLog) {
		return positionLogDao.insert(positionLog) == 1 ? "SUCCESS" : "ERROR";
	}

	/**
	 * 删除PositionLog日志
	 * 
	 * @see scb.dev.sms.log.service.IPositionLogService#deletePositionLog(java.lang.String)
	 */
	@Override
	public String deletePositionLog(String PositionLogId) {

		return positionLogDao.deleteByPrimaryKey(PositionLogId) == 1 ? "SUCCESS" : "ERROR";
	}

}
