package scb.dev.sms.sm.dao.mapper;

import static org.junit.Assert.assertNotNull;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import scb.dev.sms.sm.dao.EmployeeDao;
import scb.dev.sms.sm.pojo.Employee;
import scb.dev.sms.util.factory.TokenIDFactory;

/**
 * 
 * ClassName: EmployeeDaoTest <br/>
 * Description: 员工实体层测试 <br/><br/>
 * date: 2018年11月14日 下午10:56:39 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
@ContextConfiguration(locations = { "/applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeDaoTest {

	@Autowired
	private EmployeeDao mapper;
	private Logger logger = Logger.getLogger(Logger.class);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testDeleteByPrimaryKey() {

		logger.info("insert");
		try {
			// 断言删除行数为1
			Assert.assertEquals(1, mapper.deleteByPrimaryKey("db5c8659e7b111e8b8cd525400c2a9d6"));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}	
	}

	@Test
	public void testInsert() {

		Employee employee = new Employee(TokenIDFactory.getUUID(), "田冬菊", "Linda", "女",
				"127ab7d18903fe0916ac74df896cdac6", "0c8723ad251acd5225fbc56743d813ad", "001", "渣打", "1467312",
				"1467312", "1592364");
		logger.info("insert");
		try {
			// 断言修改行数为1
			Assert.assertEquals(1, mapper.insert(employee));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
		
	}

	@Test
	public void testInsertSelective() {

		Employee employee = new Employee(TokenIDFactory.getUUID(), "田冬菊", "Linda", "女",
				"127ab7d18903fe0916ac74df896cdac6", "0c8723ad251acd5225fbc56743d813ad", "001", "渣打", "1467312",
				"1467312", "1592364");
		logger.info("InsertSelective");
		try {
			// 断言修改行数为1
			Assert.assertEquals(1, mapper.insertSelective(employee));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}

	@Test
	public void testSelectByPrimaryKey() {
		logger.info("SelectByPrimaryKey");
		try {
			// 断言查询不为空
			assertNotNull(mapper.selectByPrimaryKey("db4726b7e7b111e8b8cd525400c2a9d6"));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {

		Employee employee = new Employee(TokenIDFactory.getUUID(), "田冬菊", "Linda", "女",
				"127ab7d18903fe0916ac74df896cdac6", "0c8723ad251acd5225fbc56743d813ad", "002", "渣打", "1467312",
				"1467312", "1592364");
		logger.info("UpdateByPrimaryKeySelective");
		try {
			// 断言修改行数为1
			Assert.assertEquals(1, mapper.updateByPrimaryKeySelective(employee));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}		
	}

	@Test
	public void testUpdateByPrimaryKeyWithBLOBs() {

		Employee employee = new Employee(TokenIDFactory.getUUID(), "田冬菊", "Linda", "女",
				"127ab7d18903fe0916ac74df896cdac6", "0c8723ad251acd5225fbc56743d813ad", "003", "渣打", "1467312",
				"1467312", "1592364");
		logger.info("UpdateByPrimaryKeyWithBLOBs");
		try {
			// 断言修改行数为1
			Assert.assertEquals(1, mapper.updateByPrimaryKeyWithBLOBs(employee));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}

	@Test
	public void testUpdateByPrimaryKey() {

		Employee employee = new Employee(TokenIDFactory.getUUID(), "田冬菊", "Linda", "女",
				"127ab7d18903fe0916ac74df896cdac6", "0c8723ad251acd5225fbc56743d813ad", "004", "渣打", "1467312",
				"1467312", "1592364");
		logger.info("UpdateByPrimaryKey");
		try {
			// 断言修改行数为1
			Assert.assertEquals(1, mapper.updateByPrimaryKey(employee));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}

	}

}
