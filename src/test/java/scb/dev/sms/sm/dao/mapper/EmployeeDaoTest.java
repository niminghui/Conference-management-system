package scb.dev.sms.sm.dao.mapper;

import static org.junit.Assert.assertNotNull;
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

@ContextConfiguration(locations = { "/applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeDaoTest {
	
	@Autowired
	private EmployeeDao mapper;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDeleteByPrimaryKey() {
		
		Assert.assertEquals(1, mapper.deleteByPrimaryKey("db5c8659e7b111e8b8cd525400c2a9d6"));
	}

	@Test
	public void testInsert() {
		
		Employee employee=new Employee(TokenIDFactory.getUUID(),"张丽","Mary","女","12345","13245","001","渣打","1","2","1594563");
		Assert.assertEquals(1, mapper.insert(employee));
	}

	@Test
	public void testInsertSelective() {
		
		Employee employee=new Employee(TokenIDFactory.getUUID(),"张丽","Mary","女","12345","13245","001","渣打","1","2","1594563");
		Assert.assertEquals(1, mapper.insertSelective(employee));
	}

	@Test
	public void testSelectByPrimaryKey() {
		assertNotNull(mapper.selectByPrimaryKey("db4726b7e7b111e8b8cd525400c2a9d6"));
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		
		Employee employee=new Employee("db4726b7e7b111e8b8cd525400c2a9d6","陈丽","Mary","女","12345","13245","001","渣打","1","2","1594563");
		Assert.assertEquals(1, mapper.updateByPrimaryKeySelective(employee));
	}

	@Test
	public void testUpdateByPrimaryKeyWithBLOBs() {
		
		Employee employee=new Employee("db4726b7e7b111e8b8cd525400c2a9d6","陈丽","Mary","女","12345","13245","001","渣打","1","2","1594563");
		Assert.assertEquals(1, mapper.updateByPrimaryKeyWithBLOBs(employee));
	}

	@Test
	public void testUpdateByPrimaryKey() {
		
		Employee employee=new Employee("db4726b7e7b111e8b8cd525400c2a9d6","陈丽","Mary","女","12345","13245","001","渣打","1","2","1594563");
		employee.setEmployeeName("玛丽");
		Assert.assertEquals(1, mapper.updateByPrimaryKey(employee));
		
	}

}
