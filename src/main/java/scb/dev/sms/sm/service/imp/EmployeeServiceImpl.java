package scb.dev.sms.sm.service.imp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scb.dev.sms.common.CommonData;
import scb.dev.sms.sm.dao.EmployeeAddressDao;
import scb.dev.sms.sm.dao.EmployeeContactInfoDao;
import scb.dev.sms.sm.dao.EmployeeDao;
import scb.dev.sms.sm.pojo.Employee;
import scb.dev.sms.sm.pojo.EmployeeAddress;
import scb.dev.sms.sm.pojo.EmployeeContactInfo;
import scb.dev.sms.sm.service.IAccountService;
import scb.dev.sms.sm.service.IEmployeeService;
import scb.dev.sms.util.factory.TokenIDFactory;
import scb.dev.sms.util.tool.PagingVO;

/**
 * 
 * ClassName: EmployeeServiceImpl <br/>
 * Description: 员工服务层实现. <br/><br/>
 * date: 2018年11月16日 下午1:29:34 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private EmployeeAddressDao employeeAddressDao;
	@Autowired
	private EmployeeContactInfoDao employeeContactInfoDao;
	@Autowired
	private IAccountService accountService;
	
	private List<Employee> employeeList;
	
	private Employee employee;
	
	private Logger logger = Logger.getLogger(Logger.class);
	
	@Override
	public String initEmployee(Employee employee,EmployeeAddress employeeAddress,
			EmployeeContactInfo employeeContactInfo) {
		logger.info("initEmployee");
		try {
			
			setWorkId(employee);
			employeeDao.insertSelective(employee);
			employeeAddressDao.insertSelective(employeeAddress);
			employeeContactInfoDao.insertSelective(employeeContactInfo);
			
			accountService.initAccount(employee.getEmployeeId(), employee.getEmployeeNickname());
		}
		catch(Exception e) {
			e.printStackTrace();
			logger.error(CommonData.SAVE_FAILURE);
			return CommonData.SAVE_FAILURE;
		}
		logger.info(CommonData.SAVE_SUCCESS);
		return CommonData.SAVE_SUCCESS;
	}

	@Override
	public String editEmployee(Employee employee,EmployeeAddress employeeAddress,
			EmployeeContactInfo employeeContactInfo) {
		logger.info("editEmployee");
		try {
			employeeDao.updateByEmployeeIdSelective(employee);
			employeeAddressDao.updateByPrimaryKeySelective(employeeAddress);
			employeeContactInfoDao.updateByPrimaryKeySelective(employeeContactInfo);
		}catch(Exception e) {
			logger.error(CommonData.UPDATE_FAILURE);
			return CommonData.UPDATE_FAILURE;
		}
		logger.info(CommonData.UPDATE_SUCCESS);
		return CommonData.UPDATE_SUCCESS;
	}

	@Override
	public List<Employee> queryAllEmployee(PagingVO pageVO) {
		logger.info("queryAllEmployee");
		employeeList = employeeDao.selectAllEmployeeWithAddAndCon(pageVO);
		if(employeeList!=null) {
			logger.error(CommonData.QUERY_SUCCESS);
			return employeeList;
		}
		else {
			logger.error(CommonData.QUERY_FAILURE);
			return null;
		}
	}

	@Override
	public Employee queryByEmployeeId(String employeeId) {
		logger.info("queryByEmployeeName");
		employee = employeeDao.selectByEmployeeIdWithAddAndCon(employeeId);
		if(employee!=null) {
			logger.error(CommonData.QUERY_SUCCESS);
			return employee;
		}
		else {
			logger.error(CommonData.QUERY_FAILURE);
			return null;
		}
	}

	@Override
	public List<Employee> queryByEmployeeName(String employeeName) {
		logger.info("queryByEmployeeName");
		employeeList = employeeDao.selectByEmployeeNameWithAddAndCon(employeeName);
		if(employeeList!=null) {
			logger.error(CommonData.QUERY_SUCCESS);
			return employeeList;
		}
		else {
			logger.error(CommonData.QUERY_FAILURE);
			return null;
		}
	}

	@Override
	public Employee queryByEmployeeWorkId(String employeeWorkId) {
		logger.info("queryByEmployeeWorkId");
		employee = employeeDao.selectByEmployeeWorkIdWithAddAndCon(employeeWorkId);
		if(employee!=null) {
			logger.error(CommonData.QUERY_SUCCESS);
			return employee;
		}
		else {
			logger.error(CommonData.QUERY_FAILURE);
			return null;
		}
	}

	@Override
	public List<Employee> queryByEmployeePositionId(String employeePositionId) {
		logger.info("queryByEmployeePositionId");
		employeeList = employeeDao.selectByEmployeePositionIdWithAddAndCon(employeePositionId);
		if(employeeList!=null) {
			logger.error(CommonData.QUERY_SUCCESS);
			return employeeList;
		}
		else {
			logger.error(CommonData.QUERY_FAILURE);
			return null;
		}
	}

	@Override
	public List<Employee> queryByEmployeeDepartmentId(String employeeDepartmentId) {
		logger.info("queryByEmployeeDepartmentId");
		employeeList = employeeDao.selectByEmployeeDepartmentIdWithAddAndCon(employeeDepartmentId);
		if(employeeList!=null) {
			logger.error(CommonData.QUERY_SUCCESS);
			return employeeList;
		}
		else {
			logger.error(CommonData.QUERY_FAILURE);
			return null;
		}
	}

	@Override
	public List<Employee> queryByEmployeeStatus(String employeeStatus) {
		logger.info("queryAllEmployee");
		employeeList = employeeDao.selectByEmployeeStatusWithAddAndCon(employeeStatus);
		if(employeeList!=null) {
			logger.error(CommonData.QUERY_SUCCESS);
			return employeeList;
		}
		else {
			logger.error(CommonData.QUERY_FAILURE);
			return null;
		}
	}

	@Override
	public int getCountEmployee(String employeeName) {
		logger.info("getCountEmployee");
		return employeeDao.getCountEmployee(employeeName);
	}
	
	
	public String getCurrentYearAndMonth() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyMM");
		String yearAndMonth=sdf.format(new Date());
		return yearAndMonth;
	}
	
	public void setWorkId(Employee employee) {
		String yearMonth=getCurrentYearAndMonth();
		String maxWorkId=employeeDao.selectMaxWorkIdByYearAndMonth(yearMonth);
		if(maxWorkId==null) {
			employee.setEmployeeWorkId(yearMonth+"001");
		}
		else {
			int num=Integer.parseInt(maxWorkId.substring(4));
			String endString=String.valueOf(num+1);
			if(endString.length()==1) {
				endString="00"+endString;
			}
			else if(endString.length()==2) {
				endString="0"+endString;
			}
			employee.setEmployeeWorkId(yearMonth+endString);
		}
		System.out.println(employee.getEmployeeWorkId());
		
	}

	@Override
	public int editEmployee(Employee employee) {
		
		return employeeDao.updateByEmployeeIdSelective(employee);
	}

}
