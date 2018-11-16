package scb.dev.sms.sm.dao.mapper;

import static org.junit.Assert.assertEquals;
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

import com.alibaba.fastjson.JSONObject;

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
	public void testDeleteByEmployeeId() {

		logger.info("insert");
		try {
			// 断言删除行数为1
			Assert.assertEquals(1, mapper.deleteByEmployeeId("db5c8659e7b111e8b8cd525400c2a9d6"));
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

		Employee employee = new Employee(TokenIDFactory.getUUID(), "陈丽", "Linda", "女",
				"127ab7d18903fe0916ac74df896cdac6", "0c8723ad251acd5225fbc56743d813ad", "001", "渣打", "1467312",
				"1467312", "1592378");
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
	public void testSelectByEmployeeId() {
		logger.info("SelectByEmployeeId");
		try {
			// 断言查询不为空
			assertNotNull(mapper.selectByEmployeeId("5278b78c070d4a28a930ea4975eaaee7"));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}
	
	@Test
	public void testSelectByEmployeeWorkId() {
		logger.info("SelectByEmployeeWorkId");
		try {
			// 断言查询不为空
			assertNotNull(mapper.selectByEmployeeWorkId("1592368"));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}
	
	@Test
	public void testSelectByEmployeeWorkIdWithAddAndCon() {
		logger.info("SelectByEmployeeWorkId");
		try {
			// 断言查询不为空
			assertNotNull(mapper.selectByEmployeeWorkIdWithAddAndCon("1592368"));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}
	
	@Test
	public void testSelectByEmployeeName() {
		logger.info("SelectByEmployeeName");
		try {
			// 断言查询不为空
			assertNotNull(mapper.selectByEmployeeName("陈丽"));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}
	
	@Test
	public void testSelectByEmployeeNameWithAddAndCon() {
		logger.info("SelectByEmployeeName");
		try {
			// 断言查询不为空
			assertNotNull(mapper.selectByEmployeeNameWithAddAndCon("陈丽"));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}
	
	@Test
	public void testSelectByEmployeeNickname() {
		logger.info("selectByEmployeeNickname");
		try {
			// 断言查询不为空
			assertNotNull(mapper.selectByEmployeeNickname("Mary"));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}

	@Test
	public void testSelectByEmployeePositionId() {
		logger.info("SelectByEmployeeName");
		try {
			// 断言查询不为空
			assertNotNull(mapper.selectByEmployeePositionId("127ab7d18903fe0916ac74df896cdac6"));
			assertEquals(10, mapper.selectByEmployeePositionId("127ab7d18903fe0916ac74df896cdac6").size());
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}
	
	@Test
	public void testSelectByEmployeePositionIdWithAddAndCon() {
		logger.info("SelectByEmployeeName");
		try {
			// 断言查询不为空
			assertNotNull(mapper.selectByEmployeePositionIdWithAddAndCon("127ab7d18903fe0916ac74df896cdac6"));
			assertEquals(2, mapper.selectByEmployeePositionIdWithAddAndCon("127ab7d18903fe0916ac74df896cdac6").size());
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}

	@Test
	public void testSelectByEmployeeDepartmentId() {
		logger.info("selectByEmployeeDepartmentId");
		try {
			// 断言查询不为空
			assertNotNull(mapper.selectByEmployeeDepartmentId("0c8723ad251acd5225fbc56743d813ad"));
			assertEquals(10, mapper.selectByEmployeeDepartmentId("0c8723ad251acd5225fbc56743d813ad").size());
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}
	
	@Test
	public void testSelectByEmployeeDepartmentIdWithAddAndCon() {
		logger.info("selectByEmployeeDepartmentId");
		try {
			// 断言查询不为空
			assertNotNull(mapper.selectByEmployeeDepartmentIdWithAddAndCon("0c8723ad251acd5225fbc56743d813ad"));
			assertEquals(2, mapper.selectByEmployeeDepartmentIdWithAddAndCon("0c8723ad251acd5225fbc56743d813ad").size());
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}


	@Test
	public void testSelectByEmployeeStatus() {
		logger.info("selectByEmployeeStatus");
		try {
			// 断言查询不为空
			assertNotNull(mapper.selectByEmployeeStatus("001"));
			assertEquals(9, mapper.selectByEmployeeStatus("001").size());
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}

	@Test
	public void testSelectByEmployeeStatusWithAddAndCon() {
		logger.info("selectByEmployeeStatus");
		try {
			// 断言查询不为空
			assertNotNull(mapper.selectByEmployeeStatusWithAddAndCon("001"));
			assertEquals(2, mapper.selectByEmployeeStatusWithAddAndCon("001").size());
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}
	
	@Test
	public void testSelectByEmployeeCompany() {
		logger.info("selectByEmployeeCompany");
		try {
			// 断言查询不为空
			assertNotNull(mapper.selectByEmployeeCompany("渣打"));
			assertEquals(8, mapper.selectByEmployeeCompany("渣打").size());
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}

	@Test
	public void testSelectAllEmployeeWithAddAndCon() {
		logger.info("selectAllEmployee");
		try {
			// 断言查询不为空
			assertNotNull(mapper.selectAllEmployeeWithAddAndCon());
			//assertEquals(8, mapper.selectAllEmployee().size());
			System.out.println(JSONObject.toJSONString(mapper.selectAllEmployeeWithAddAndCon()));
			logger.info("success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testSelectAllEmployee() {
		logger.info("selectAllEmployee");
		try {
			// 断言查询不为空
			assertNotNull(mapper.selectAllEmployee());
			assertEquals(8, mapper.selectAllEmployee().size());
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}

	@Test
	public void testUpdateByEmployeeIdSelective() {

		Employee employee = new Employee("5278b78c070d4a28a930ea4975eaaee7", "田冬菊", "Linda", "女",
				"127ab7d18903fe0916ac74df896cdac6", "0c8723ad251acd5225fbc56743d813ad", "002", "华钦", "1467312",
				"1467312", "1592364");
		logger.info("UpdateByPrimaryKeySelective");
		try {
			// 断言修改行数为1
			Assert.assertEquals(1, mapper.updateByEmployeeIdSelective(employee));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}		
	}

	@Test
	public void testUpdateByEmployeeIdWithBLOBs() {

		Employee employee = new Employee("5278b78c070d4a28a930ea4975eaaee7", "田冬菊", "Linda", "女",
				"127ab7d18903fe0916ac74df896cdac6", "0c8723ad251acd5225fbc56743d813ad", "003", "渣打", "1467312",
				"1467312", "1592364");
		logger.info("UpdateByPrimaryKeyWithBLOBs");
		try {
			// 断言修改行数为1
			Assert.assertEquals(1, mapper.updateByEmployeeIdWithBLOBs(employee));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}
	}

	@Test
	public void testUpdateByEmployeeId() {

		Employee employee = new Employee("5278b78c070d4a28a930ea4975eaaee7", "田冬菊", "Linda", "女",
				"127ab7d18903fe0916ac74df896cdac6", "0c8723ad251acd5225fbc56743d813ad", "004", "渣打", "1467312",
				"1467312", "1592364");
		logger.info("UpdateByPrimaryKey");
		try {
			// 断言修改行数为1
			Assert.assertEquals(1, mapper.updateByEmployeeId(employee));
			logger.info("success");
		} catch (Exception e) {
			logger.info("fail");
		}

	}
	

}
