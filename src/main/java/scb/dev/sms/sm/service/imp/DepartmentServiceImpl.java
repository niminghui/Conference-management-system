package scb.dev.sms.sm.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import scb.dev.sms.sm.dao.DepartmentDao;
import scb.dev.sms.sm.dao.EmployeeDao;
import scb.dev.sms.sm.pojo.Department;
import scb.dev.sms.sm.service.DepartmentService;
import scb.dev.sms.util.factory.TokenIDFactory;
@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentDao departmentDao;

	@Autowired 
	private EmployeeDao employeeDao;
	@Transactional
	@Override
	public String deleteDepartment(String departmentId) {
		// TODO Auto-generated method stub
		//3是status参数  0: 未激活  1：已激活  2：离职  3：部门解散待业  
		employeeDao.deleteDepartmentInEmployee("3", departmentId);
		return departmentDao.deleteByPrimaryKey(departmentId)==0?"success":"error";
	}

	@Override
	public String updateDepartment(Department department) {
		// TODO Auto-generated method stub
		
		return departmentDao.updateByPrimaryKeySelective(department)==1?"success":"error";
	}

	@Override
	public String insertDepartment(Department department) {
		// TODO Auto-generated method stub
		department.setDepartmentId(TokenIDFactory.getUUID());
		return departmentDao.insertSelective(department)==1?"success":"error";
	}

	
	
}
