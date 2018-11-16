package scb.dev.sms.sm.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import scb.dev.sms.sm.dao.MenuDao;
import scb.dev.sms.sm.pojo.Menu;
import scb.dev.sms.sm.pojo.Menu.Builder;
import scb.dev.sms.sm.service.IMenuService;

/**
 * 
 * @author Weilei
 *
 */
@Service
@Transactional
public class MenuServiceImpl implements IMenuService {

	@Autowired
	private MenuDao menuDao;

	@Override
	public Menu queryMenu(String menuId) {
		return menuDao.selectByPrimaryKey(menuId);
	}

	@Override
	public List<Menu> queryAllMenu() {
		return null;
	}

	@Override
	public boolean addMenu(String menuName, String menuParentId, String createUserName) {
		Menu menu = new Menu.Builder().menuName(menuName).menuParentid(menuParentId).menuCreatedUser(createUserName)
				.build();
		return menuDao.insertSelective(menu) > 0;
	}

	@Override
	public boolean updateMenu(String menuId, String menuName, String menuOrderId, String menuUrl,
			String updateUserName) {
		Menu menu = new Menu.Builder().menuId(menuId).menuName(menuName).menuOrderid(menuOrderId).menuUrl(menuUrl)
				.build();
		return menuDao.updateByPrimaryKeySelective(menu) > 0;
	}

	@Override
	public boolean deleteMenu(String menuId) {
		return menuDao.deleteByPrimaryKey(menuId) > 0;
	}

}
