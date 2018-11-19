package scb.dev.sms.sm.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import scb.dev.sms.sm.pojo.Department;
import scb.dev.sms.sm.service.IDepartmentService;

@ContextConfiguration(locations = { "/applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class DepartmentServiceImplTest {

	@Autowired
	private IDepartmentService departmentService;
	@Autowired
	private Department department = new Department();
	private Logger logger = Logger.getLogger(Logger.class);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsertDepartment() {

		// try {
		logger.info("测试InsertDepartment");
		department.setDepartmentName("部门名称3");
		department.setDepartmentPid("c881fb7a747d4ba9bab5898a9e57e455");
		department.setDepartmentAbbreviation("RB3");
		department.setDepartmentOrderid("003");
		department.setDepartmentCreatedUser("ZK");
		department.setDepartmentCreatedTime(new Date());

		Assert.assertEquals("success", departmentService.insertDepartment(department));
		logger.info("成功");
//		}catch (Exception e) {
//			// TODO: handle exception
//			logger.info("fail");
//		}
	}
    @Test
	public void testupdateDepartment() {

		// try {
		logger.info("测试updateDepartment");
		department.setDepartmentName("部门名称6");
		// department.setDepartmentPid("1");
		department.setDepartmentAbbreviation("RB6");
		department.setDepartmentId("7630a31b226c48aab4c2558e524e30e1");
		Assert.assertEquals("success", departmentService.updateDepartmentByDepartmentId(department));
		logger.info("成功");
//		}catch (Exception e) {
//			// TODO: handle exception
//			logger.info("fail");
//		}
	}
    
    @Test
    public void testdeleteById() {
    	logger.info("测试deleteDepartment");
    	department.setDepartmentId("e908a5b2638f46558af768305d24c4eb");
    	Assert.assertEquals("success", departmentService.deleteDepartmentByDepartmentId(department.getDepartmentId()));
    	logger.info("成功");
    }
    
    @Test
    public void testfindDepartmentsInfo() {
    	logger.info("测试findDepartment");
    	
    	ArrayList<Department> departments=(ArrayList<Department>) departmentService.findTreeDepartmentsInfo();
    	 for(Department department:departments )
    		 System.out.println(department.toString());
    	logger.info("成功");
    }
    @Test
    public void testfindDepartmentById() {
    	logger.info("测试findDepartment");
    	
    	Department department=departmentService.findOneDepartmentById("7630a31b226c48aab4c2558e524e30e1");
    	System.out.println(department.toString());
    	logger.info("成功");
    }
    
    @Test
    public void testfindDepartmentByAbbrev() {
    	logger.info("测试findDepartment");
    	
    	Department department=departmentService.findOneDepartmentByAbbrev("RB2");
    	System.out.println(department.toString());
    	logger.info("成功");
    }

}
