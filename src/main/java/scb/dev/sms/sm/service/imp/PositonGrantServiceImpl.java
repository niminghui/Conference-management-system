package scb.dev.sms.sm.service.imp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import scb.dev.sms.sm.dao.PositionGrantDao;
import scb.dev.sms.sm.pojo.Menu;
import scb.dev.sms.sm.service.IPositionGrantService;
import scb.dev.sms.util.factory.ToolFactory;

@Service
@Transactional
public class PositonGrantServiceImpl implements IPositionGrantService {

	@Autowired
	private PositionGrantDao positionGrantDao;

	@Override
	public List<Menu> getOwnMenu(String positionId) {
		if(positionId==null) {
			throw new RuntimeException("positonId 为空");
		}
		List<Menu> menuList = positionGrantDao.getOwnMenu(positionId);
		return ToolFactory.getInstanceOfMenuTreeUtil().turnedToMenuTree(menuList);
	}

}
