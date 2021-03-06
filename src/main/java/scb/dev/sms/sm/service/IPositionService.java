/**
 * Project Name:scb.sms
 * File Name:IPositionService.java
 * Package Name:scb.dev.sms.sm.service
 * Date:2018年11月16日上午11:00:01
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.service;


import scb.dev.sms.sm.pojo.Position;
import scb.dev.sms.util.tool.PagingVO;

import java.util.List;

/**
 * ClassName: IPositionService <br/>
 *
 * @author Zither.Chen
 * @version V1.0
 * @Description: Position实现类接口
 * @Date: 2018/11/16 11:06 <br/>
 * @since JDK 1.8
 */
public interface IPositionService {

	
	/**
	 * 
	 * queryPositionById： 查询指定职位信息
	 * @param positionId
	 * @return
	 */
	Position queryPositionById(Integer positionId);
	
	/**
	 * 
	 * modifyPositionInfo:更新职位信息
	 * @param position
	 */
	String modifyPositionInfo(Position position) ;
	
	
	
	/**
	 * 
	 * removePosition：删除职位信息
	 * @param pos
	 */
	String removePosition(String positionId);

	/**
	 * insertPosition:(插入职位信息). <br/>
	 * @author Zither.Chen
	 * @param pos
	 * @since JDK 1.8
	 */
	String insertPosition(Position position);


	/**
	 * 
	 * queryAllPosititon：查询所有职位信息 
	 * @return
	 */
	List<Position> queryAllPosition();

	/**
	 * 
	 * @Title: getCountPosition   
	 * @Description: 获取职位信息数量   
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int getCountPosition();

	/**
	 * 
	 * @Title: findByPaging   
	 * @Description: 通过分页查询职位信息   
	 * @param: @param pageVo
	 * @param: @return      
	 * @return: List<Position>      
	 * @throws
	 */
	List<Position> findByPaging(PagingVO pageVo);

	/**
	 * 
	 * @Title: selectByPositionName   
	 * @Description: 通过职位名称查询相应的职位信息   
	 * @param: @param positionName
	 * @param: @return      
	 * @return: List<Position>      
	 * @throws
	 */
	List<Position> selectByPositionName(String positionName);

}
