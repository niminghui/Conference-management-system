package scb.dev.sms.sm.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;

import scb.dev.sms.common.CommonData;
import scb.dev.sms.sm.pojo.Employee;
import scb.dev.sms.sm.pojo.EmployeeAddress;
import scb.dev.sms.sm.pojo.EmployeeContactInfo;
import scb.dev.sms.sm.service.IEmployeeService;
import scb.dev.sms.util.tool.PagingVO;
/**
 * ClassName: EmployeeServiceImplTest <br/>
 * Description: 员工服务层测试类. <br/><br/>
 * date: 2018年11月16日 下午1:36:44 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
@ContextConfiguration(locations = { "/applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceImplTest {
	
	@Autowired
	private IEmployeeService employeeService;
	
	private Employee employee;
	
	@Before
	public void setUp() throws Exception {
		EmployeeAddress employeeAddress=new EmployeeAddress("a22b77ae681c45929b6a2301139c3638","河北省石家庄市井陉县","河北省石家庄市无极县");
		EmployeeContactInfo employeeContactInfo = new EmployeeContactInfo("a22b77ae681c45929b6a2301139c3638","85701234", "15267945623", "ryan.li@sc.com");
		employee = new Employee("a22b77ae681c45929b6a2301139c3638", "田广利", "Jerry", "男",
				"127ab7d18903fe0916ac74df896cdac6", "0c8723ad251acd5225fbc56743d813ad", "002", "华钦", "1467312",
				"1467312", "1592345");
		employee.setEmployeeAddress(employeeAddress);
		employee.setEmployeeContactInfo(employeeContactInfo);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInitEmployee() {
		
		assertEquals(CommonData.SAVE_SUCCESS, employeeService.initEmployee(employee));
	}

	@Test
	public void testEditEmployee() {
		
		assertEquals(CommonData.UPDATE_SUCCESS, employeeService.editEmployee(employee));
	}

	@Test
	public void testQueryAllEmployee() {
		assertEquals(2, employeeService.queryAllEmployee(new PagingVO()).size());
		
	}
	
	@Test
	public void testQueryByEmployeeId() {
		assertNotNull(employeeService.queryByEmployeeId("a22b77ae681c45929b6a2301139c3638"));
		
	}
	
	@Test
	public void testQueryByEmployeeWorkId() {
		assertNotNull(employeeService.queryByEmployeeWorkId("1592368"));
		
	}
	
	@Test
	public void testQueryByEmployeePositionId() {
		assertEquals(2, employeeService.queryByEmployeePositionId("127ab7d18903fe0916ac74df896cdac6").size());
		
	}
	
	@Test
	public void testQueryByEmployeeDepartmentId() {
		assertEquals(2, employeeService.queryByEmployeeDepartmentId("0c8723ad251acd5225fbc56743d813ad").size());
		
	}
	
	@Test
	public void testQueryByEmployeeStatus() {
		assertEquals(2, employeeService.queryByEmployeeStatus("001").size());
		
	}
	
	@Test
	public void testQueryByEmployeeName() {
		assertEquals(1, employeeService.queryByEmployeeName("田广利").size());
		
	}
	
	@Test
	public void testGetCountEmployee() {
		assertEquals(2, employeeService.getCountEmployee());
		
	}

}
