package scb.dev.sms.sm.service;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import scb.dev.sms.common.CommonData;
import scb.dev.sms.sm.controller.DepartmentController;
import scb.dev.sms.sm.dao.DepartmentDao;
import scb.dev.sms.sm.pojo.Department;
import scb.dev.sms.sm.service.IDepartmentService;

@ContextConfiguration(locations = { "/applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class DepartmentServiceImplTest {

	@Autowired
	private IDepartmentService departmentService;
	@Autowired
	private Department department = new Department();
	@Autowired
	private DepartmentController departmentController;
	private List<Department> departments = new ArrayList<>();
	private Logger logger = Logger.getLogger(Logger.class);
	
	@Before
	public void setUp() throws Exception {
		logger.info("测试Department开始");
	}

	@After
	public void tearDown() throws Exception {
		logger.info("测试结束");
	}

	@Test
	public void testInsertDepartment() {

		
		department.setDepartmentName("部门名称4");
		department.setDepartmentPid("0da29d223d8d48eeb11caa85fc6c95ee");
		department.setDepartmentAbbreviation("RB4");
		department.setDepartmentOrderid("003");
		department.setDepartmentCreatedUser("ZK");
		

		assertEquals(CommonData.STRING_SUCCESS, departmentService.insertDepartment(department));
		

	}
    @Test
	public void testupdateDepartment() {
		
		department.setDepartmentName("部门名称1大苏打大苏打大撒大");
		// department.setDepartmentPid("1");
		department.setDepartmentAbbreviation("RB1");
		department.setDepartmentId("0da29d223d8d48eeb11caa85fc6c95ee");
		Assert.assertEquals("success", departmentService.updateDepartmentByDepartmentId(department));
		

	}
    
    @Test
    public void testdeleteById() {
    	
    	department.setDepartmentId("e908a5b2638f46558af768305d24c4eb");
    	Assert.assertEquals("success", departmentService.deleteDepartmentByDepartmentId(department.getDepartmentId()));
    	
    }
    
    @Test
    public void testfindTreeDepartmentsInfo() {
    	
    	
    	List<Department> departments=(ArrayList<Department>) departmentService.findTreeDepartmentsInfo();
    	 for(Department department:departments )
    		 System.out.println(department.toString());
    	
    }
    @Test
    public void testfindDepartmentById() {
    	
    	
    	department=departmentService.findOneDepartmentById("0");
    	System.out.println(department.toString());
    	
    }
    
    @Test
    public void testfindDepartmentByAbbrev() {
    	department=departmentService.findOneDepartmentByAbbrev("RB2");
    	System.out.println(department.toString());
        
    }
    @Test
    public void findOneDepartmentByName() {
    	department=departmentService.findOneDepartmentByName("零售银行");
    	logger.info(department.toString());
    }
    @Test
    public void findParentDepartment() {
    	departments=departmentService.findParentDepartment();
    	logger.info(department.toString());
    }
    @Test
    public void selectIdAndSubId() {
    	departments=departmentService.selectIdAndSubId("1");
    	logger.info(departments.toString());
    	System.out.println(departments.toString());
    }

}
