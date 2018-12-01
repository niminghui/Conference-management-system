package scb.dev.sms.sm.service;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.druid.support.logging.Log;

import scb.dev.sms.sm.dao.PositionGrantDao;
import scb.dev.sms.sm.pojo.Menu;

@ContextConfiguration(locations = { "/applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class IMenuServiceTest {

	@Autowired
	private IPositionGrantService positionGrantService;

	@Autowired
	private PositionGrantDao positionGrantDao;

	@Test
	public void getOwnMenuTest() {
		// List<Menu> menus =
		// positionGrantDao.getOwnMenu("deae96b244a94fef943be5dcc8309792");
		List<Menu> menus = positionGrantService.getOwnMenu("deae96b244a94fef943be5dcc8309792");
		// List<Menu> menus =
		// PositionGrantDao.getOwnMenu("31ae31aaaccc4e25929c3b2ce84ff2ca");
//		System.out.println("--------------");
		for (Menu menu : menus) {
			System.out.println(menu.getMenuId());
		}
		// assertEquals(menus.size(), 3);
        assertEquals(menus.size(), 1);
	}

}
