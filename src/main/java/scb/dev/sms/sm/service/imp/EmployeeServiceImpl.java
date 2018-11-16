package scb.dev.sms.sm.service.imp;

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
	
	private Logger logger = Logger.getLogger(Logger.class);
	
	@Override
	public String initEmployee(Employee employee) {
		logger.info("initEmployee");
		try {
			String employeeId=TokenIDFactory.getUUID();
			
			EmployeeAddress employeeAddress=employee.getEmployeeAddress();
			EmployeeContactInfo employeeContactInfo=employee.getEmployeeContactInfo();
			
			employee.setEmployeeId(employeeId);
			employeeAddress.setEmployeeId(employeeId);
			employeeContactInfo.setEmployeeId(employeeId);
			
			employeeDao.insertSelective(employee);
			employeeAddressDao.insertSelective(employeeAddress);
			employeeContactInfoDao.insertSelective(employeeContactInfo);
			
			accountService.initAccount(employeeId, employee.getEmployeeNickname());
		}
		catch(Exception e) {
			logger.error(CommonData.SAVE_FAILURE);
			return CommonData.SAVE_FAILURE;
		}
		logger.info(CommonData.SAVE_SUCCESS);
		return CommonData.SAVE_SUCCESS;
	}

	@Override
	public String editEmployee(Employee employee) {
		logger.info("editEmployee");
		try {
			employeeDao.updateByEmployeeIdSelective(employee);
			employeeAddressDao.updateByPrimaryKeySelective(employee.getEmployeeAddress());
			employeeContactInfoDao.updateByPrimaryKeySelective(employee.getEmployeeContactInfo());
		}catch(Exception e) {
			logger.error(CommonData.UPDATE_FAILURE);
			return CommonData.UPDATE_FAILURE;
		}
		logger.info(CommonData.UPDATE_SUCCESS);
		return CommonData.UPDATE_SUCCESS;
	}

	@Override
	public List<Employee> queryAllEmployee() {
		logger.info("queryAllEmployee");
		employeeList = employeeDao.selectAllEmployeeWithAddAndCon();
		if(employeeList!=null) {
			logger.error(CommonData.QUERY_SUCCESS);
			return employeeList;
		}
		else {
			logger.error(CommonData.QUERY_FAILURE);
			return null;
		}
	}
	

}
