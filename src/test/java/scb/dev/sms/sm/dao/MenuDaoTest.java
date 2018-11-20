package scb.dev.sms.sm.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import scb.dev.sms.sm.dao.MenuDao;
import scb.dev.sms.sm.pojo.Menu;

@ContextConfiguration("/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MenuDaoTest {

	@Autowired
	private MenuDao menuMapper;

	@Test
	public void insert() {
		Menu menu = new Menu();
		menu.setMenuParentid("");
		menu.setMenuOrderid("1");
		menu.setMenuUrl("www.baidu.com");
		menu.setMenuCreatedUser("admin");
		menu.setMenuName("发起会议");
		assertEquals(menuMapper.insertSelective(menu), 1);
	}

	@Test
	public void select() {
		assertEquals(menuMapper.selectByPrimaryKey("284a37d6e7c111e8b8cd525400c2a9d6").getMenuName(), "发起会议");
	}

	@Test
	public void update() {
		Menu menu = new Menu();
		menu.setMenuId("a26c545ce7c011e8b8cd525400c2a9d6");
		menu.setMenuCreatedUser("wei");
		assertEquals(menuMapper.updateByPrimaryKeySelective(menu), 1);
	}

	@Test
	public void delete() {
		assertEquals(menuMapper.deleteByPrimaryKey("a26c545ce7c011e8b8cd525400c2a9d6"), 1);
	}

}
