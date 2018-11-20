
package scb.dev.sms.sm.service.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scb.dev.sms.common.CommonData;
import scb.dev.sms.sm.dao.PositionDao;
import scb.dev.sms.sm.pojo.Position;
import scb.dev.sms.sm.service.IPositionService;
import scb.dev.sms.util.tool.PagingVO;

/**
 * 
 * @ClassName:  PositionServiceImp   
 * @Description:TODO(职位信息service层实现类)   
 * @author: Steven.Lee 
 * @date:   2018年11月18日 下午5:53:43   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved.
 */
@Service
public class PositionServiceImpl implements IPositionService {

	private Logger logger=Logger.getLogger(this.getClass());
	
	@Autowired
	private PositionDao positionDao;

	/*
	 * 通过职位ID查询出相应的职位信息
	 * @see scb.dev.sms.sm.service.IPositionService#queryPositionById(java.lang.Integer)
	 */
	@Override
	public Position queryPositionById(Integer positionId) {
		Position position = positionDao.selectByPrimaryKey(positionId);
		if (position!=null) {
			logger.info(CommonData.QUERY_SUCCESS);
			return position;
		}else {
			logger.info(CommonData.QUERY_FAILURE);
			return null;
		}
	}

	/*
	 * 修改职位信息
	 * @see scb.dev.sms.sm.service.IPositionService#modifyPositionInfo(scb.dev.sms.sm.pojo.Position)
	 */
	@Override
	public String modifyPositionInfo(Position position) {
		if (position!=null) {
			if (positionDao.updateByPrimaryKeySelective(position)>0) {
				return CommonData.UPDATE_SUCCESS;
			}else {
				return CommonData.UPDATE_FAILURE;
			}
		}
		return CommonData.UPDATE_FAILURE;
	}

	/*
	 * 通过职位ID删除相应的职位信息
	 * @see scb.dev.sms.sm.service.IPositionService#removePosition(java.lang.String)
	 */
	@Override
	public String removePosition(String positionId) {
		if (positionDao.deleteByPrimaryKey(positionId)>0) {
			return CommonData.DELETE_SUCCESS;
		}else {
			return CommonData.DELETE_FAILURE;
		}
	}

	/*
	 * 新增职位信息
	 * @see scb.dev.sms.sm.service.IPositionService#insertPosition(scb.dev.sms.sm.pojo.Position)
	 */
	@Override
	public String insertPosition(Position position) {
		if(position!=null) {
			if (positionDao.insertSelective(position)>0) {
				return CommonData.SAVE_SUCCESS;
			}else {
				return CommonData.SAVE_FAILURE;
			}
		}
		return CommonData.SAVE_FAILURE;
	}

	/*
	 * 查询所有职位信息
	 * @see scb.dev.sms.sm.service.IPositionService#queryAllPosition()
	 */
	@Override
	public List<Position> queryAllPosition() {
		List<Position> positionInfos = positionDao.selectAllPositionInfo();
		if (positionInfos!=null) {
			logger.info(CommonData.QUERY_SUCCESS);
			return positionInfos;
		}else {
			logger.info(CommonData.QUERY_FAILURE);
			return null;
		}
	}

	/**
	 * 
	 * <p>Title: getCountPosition</p>   
	 * <p>Description: 获取职位信息条数</p>   
	 * @return   
	 * @see scb.dev.sms.sm.service.IPositionService#getCountPosition()
	 */
	@Override
	public int getCountPosition() {
		int count=this.positionDao.getCountPosition();
		if(count>0){
			logger.info(CommonData.QUERY_SUCCESS);
			return count;
		}
		else{
			logger.error(CommonData.QUERY_FAILURE);
			return 0;
		}
		
	}

	/**
	 * 
	 * <p>Title: findByPaging</p>   
	 * <p>Description: 通过分页查询职位信息</p>   
	 * @param pageVo
	 * @return   
	 * @see scb.dev.sms.sm.service.IPositionService#findByPaging(scb.dev.sms.util.tool.PagingVO)
	 */
	@Override
	public List<Position> findByPaging(PagingVO pageVo) {
		List<Position> positions = this.positionDao.findByPaging(pageVo);
		if (positions != null) {
			logger.info(CommonData.QUERY_SUCCESS);
			return positions;
		} else{
			logger.error(CommonData.QUERY_FAILURE);
			return null;
		}
	}

	/**
	 * 
	 * <p>Title: selectByPositionName</p>   
	 * <p>Description: 通过职位名称查询相应的职位信息   </p>   
	 * @param positionName
	 * @return   
	 * @see scb.dev.sms.sm.service.IPositionService#selectByPositionName(java.lang.String)
	 */
	@Override
	public List<Position> selectByPositionName(String positionName) {
		List<Position> positions = this.positionDao.selectByPositionName(positionName);
		if (positions != null) {
			logger.info(CommonData.QUERY_SUCCESS);
			return positions;
		} else{
			logger.error(CommonData.QUERY_FAILURE);
			return null;
		}
	}
	
}


