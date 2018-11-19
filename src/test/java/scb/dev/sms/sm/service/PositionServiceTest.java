package scb.dev.sms.sm.service;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import scb.dev.sms.sm.pojo.Position;
import scb.dev.sms.util.factory.TokenIDFactory;

@ContextConfiguration(locations= {"classpath:/applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class PositionServiceTest {

	private Logger logger=Logger.getLogger(PositionServiceTest.class);
	
	
	@Autowired
	private IPositionService positionService;
	
	@Before
	public void setUp() throws Exception{
		
	}
	
	@After
	public void tearDown() throws Exception{
		
	}
	
	/**
	 * 
	 * @Title: testInsertPosition   
	 * @Description: 职位增加的测试方法  
	 * @param:       
	 * @return: void      
	 * @throws
	 */
	@Test
	public void testInsertPosition() {
		Position position=new Position();
		position.setPositionId(TokenIDFactory.getUUID());
		position.setRolegroupId(TokenIDFactory.getUUID());
		position.setPositionName("架构师");
		position.setPositionCreatedUser("Steven_Lee");
		position.setPositionUpdatedUser("Steven_Lee");
		positionService.insertPosition(position);
	}
	
	@Test
	public void testRemovePosition() {
		
	}
}
