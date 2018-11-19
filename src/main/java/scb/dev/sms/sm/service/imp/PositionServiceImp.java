/**
 * Project Name:scb.sms
 * File Name:PositionServiceImp.java
 * Package Name:scb.dev.sms.sm.service.imp
 * Date:2018年11月16日下午2:07:25
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.service.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scb.dev.sms.sm.dao.PositionDao;
import scb.dev.sms.sm.pojo.Position;
import scb.dev.sms.sm.service.IPositionService;

/**
 * ClassName: PositionService <br/>
 * Description: 
 * date: 2018年11月15日 下午2:50:52 <br/>
 *
 * @author Zither.Chen
 * @version V1.0
 * @since JDK 1.8
 */
@Service
public class PositionServiceImp implements IPositionService {

	private Logger logger=Logger.getLogger(this.getClass());
	@Autowired
	private PositionDao mapper;
	/**
	 * 查询所有职位信息
	 * @see com.scb.dev.sms.sm.service.IPositionService#queryAllPosititon()
	 */
	
	public List<Position> queryAllPosititon() {
		List<Position> lp=mapper.selectAllPositionInfo();
	    logger.info("查询所有职位信息成功");
		return lp;
	}

	/**
	 * 通过职位ID查询对应职位信息
	 * @see com.scb.dev.sms.sm.service.IPositionService#queryPositionById()
	 */
	@Override
	public Position queryPositionById(Integer positionId) {
		Position pos=mapper.selectByPrimaryKey(positionId);
		logger.info("查询指定职位信息成功");
		return pos;
	}

	/**
	 * 
	 *  修改职位信息
	 * @see com.scb.dev.sms.sm.service.IPositionService#modifyPositionInfo(com.scb.dev.sms.sm.pojo.Position)
	 */
	@Override
	public void modifyPositionInfo(Position position) {
		Position pos=position;
		if(mapper.updateByPrimaryKey(pos)>0) {
			logger.info("职位信息更新成功");
		}else
			logger.info("职位信息更新失败");
		
	}

	/**
	 * 
	 * 删除职位信息
	 * @see com.scb.dev.sms.sm.service.IPositionService#removePosition(java.lang.Integer)
	 */
	@Override 
	public void removePosition(Position pos) {
		Position position=pos;
		int result=mapper.deleteByPrimaryKey(position.getPositionId());
		if(result>0) {
			logger.info("职位信息删除成功");
		}else
			logger.info("职位信息删除失败");
		
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see scb.dev.sms.sm.service.IPositionService#removePosition(java.lang.String)
	 */
	@Override
	public String removePosition(String positionId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see scb.dev.sms.sm.service.IPositionService#insertPosition(scb.dev.sms.sm.pojo.Position)
	 */
	@Override
	public String insertPosition(Position position) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see scb.dev.sms.sm.service.IPositionService#queryAllPosition()
	 */
	@Override
	public String queryAllPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see scb.dev.sms.sm.service.IPositionService#changePosition(scb.dev.sms.sm.pojo.Position)
	 */
	@Override
	public String changePosition(Position position) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

