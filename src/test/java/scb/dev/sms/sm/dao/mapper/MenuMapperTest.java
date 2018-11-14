package scb.dev.sms.sm.dao.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import scb.dev.sms.sm.dao.MenuMapper;
import scb.dev.sms.sm.pojo.Menu;

@ContextConfiguration("/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MenuMapperTest {

	@Autowired
	private MenuMapper menuMapper;

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
		assertEquals(menuMapper.selectByPrimaryKey("a26c545ce7c011e8b8cd525400c2a9d6").getMenuName(), "联系我们");
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
