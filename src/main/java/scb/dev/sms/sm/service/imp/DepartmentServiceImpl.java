package scb.dev.sms.sm.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import scb.dev.sms.common.CommonData;
import scb.dev.sms.sm.dao.DepartmentDao;
import scb.dev.sms.sm.dao.EmployeeDao;
import scb.dev.sms.sm.pojo.Department;
import scb.dev.sms.sm.service.IDepartmentService;
import scb.dev.sms.util.factory.TokenIDFactory;
import scb.dev.sms.util.tree.DepartmentCompare2;
import scb.dev.sms.util.tree.DepartmentTreeUtil2;
import scb.dev.sms.util.tree.MenuTreeUtil;

@Transactional
@Service
public class DepartmentServiceImpl implements IDepartmentService {

	@Autowired
	private DepartmentDao departmentDao;

	@Autowired
	private EmployeeDao employeeDao;

	List<Department> departments;
	/**
	 * 
	 * Description: 通过id删除指定部门,必须指定id.<br/>
	 * 
	 * @param departmentiId
	 * @return String 创建账户成功与否信息
	 */

	@Override
	public String deleteDepartmentByDepartmentId(String departmentId) {

		// status参数 0: 未激活 1：已激活 2：离职 3：部门解散待业
		if (departmentId == null)
			return CommonData.STRING_FAILURE;
		if (!deleteDepAndSubClassById(departmentId))
			return CommonData.STRING_FAILURE;
		employeeDao.deleteDepartmentInEmployee(CommonData.STATUS_DISSOLVE, departmentId);

		return departmentDao.deleteByPrimaryKey(departmentId) == 1 ? CommonData.STRING_SUCCESS : CommonData.STRING_FAILURE;
	}

	/**
	 * 
	 * Description: 通过id更新指定部门,必须指定id.<br/>
	 * 
	 * @param departmentiId
	 * @return String 更新账户成功与否信息
	 */
	@Override
	public String updateDepartmentByDepartmentId(Department department) {
		if (department.getDepartmentId().equals("")||department.getDepartmentId()==null)
			return CommonData.STRING_FAILURE;
		
		if (department.getDepartmentPid() != null)
			if (selectCountByPid(department.getDepartmentPid()) == 0)
				return CommonData.STRING_FAILURE;
		return departmentDao.updateByPrimaryKeySelective(department) == 1 ? CommonData.STRING_SUCCESS : CommonData.STRING_FAILURE;
	}

	/**
	 * 
	 * Description: 添加指定部门,类内生成id.<br/>
	 * 
	 * @param departmentiId
	 * @return String，添加账户成功与否信息
	 */
	@Override
	public String insertDepartment(Department department) {

	
		// 如果是主部门，设置父类pid为1（字符串）
		if (department.getDepartmentPid().equals("")||department.getDepartmentPid()==null)
			department.setDepartmentPid(CommonData.DEPARTMENT_PID);
		// 判断必须项是否存在
		if (!checkDepartmentIfQualified(department)) {
			return CommonData.STRING_FAILURE;
		}
		//创建时插入修改人
		department.setDepartmentUpdatedUser(department.getDepartmentCreatedUser());
		
		//判断父类是否存在
		if (department.getDepartmentPid() != null)
			if (selectCountByPid(department.getDepartmentPid()) == 0)
				return CommonData.STRING_FAILURE;
		return departmentDao.insertSelective(department) == 1 ? CommonData.STRING_SUCCESS : CommonData.STRING_FAILURE;
	}

	/**
	 * 
	 * Description: 查找部门所以信息.<br/>
	 * 
	 * @param
	 * @return Department，查找的部门信息
	 */
	@Override
	public List<Department> findDepartmentsInfo() {
		departments = (ArrayList<Department>) departmentDao.selectAllDepartment();
		return departments;
	}

	@Override
	public List<Department> findTreeDepartmentsInfo() {
	//	List<Department> departments = (ArrayList<Department>) departmentDao.selectTreeDepartment();
		departments =departmentDao.selectAllDepartment();
		DepartmentTreeUtil2 departmentTreeUtil2=new DepartmentTreeUtil2();
		departments=departmentTreeUtil2.turnedToDepartmentTree(departments);
		return departments;
	}

	@Override
	public Department findOneDepartmentById(String departmentId) {

		return departmentDao.findOneDepartmentById(departmentId);
	}

	public Department findOneDepartmentByName(String departmentName) {
		return departmentDao.findOneDepartmentByName(departmentName);
	}
	
	@Override
	public Department findOneDepartmentByAbbrev(String departmentAbbreviation) {
		return departmentDao.findOneDepartmentByAbbrev(departmentAbbreviation);
	}

	/**
	 * 
	 * Description: 类内方法.<br/>
	 * 
	 * @param
	 * @return
	 */

	private boolean checkDepartmentIfQualified(Department department) {
		if (department.getDepartmentName() == null  //department.getDepartmentId() == null || 
				|| department.getDepartmentOrderid() == null || department.getDepartmentCreatedUser() == null
				 || department.getDepartmentPid() == null
				|| department.getDepartmentAbbreviation() == null)  //|| department.getDepartmentCreatedTime() == null
			return false;
		return true;
	}

	private boolean deleteDepAndSubClassById(String departmentId) {
		List<Department> dList = departmentDao.selectSubClassByDepartmentId(departmentId);
		if (dList.size() != 0) {
			for (int i = 0; i < dList.size(); i++) {
				boolean ifsuccess = deleteDepAndSubClassById(dList.get(i).getDepartmentId());
				if (!ifsuccess) {
					return ifsuccess;
				}
				employeeDao.deleteDepartmentInEmployee(CommonData.STATUS_DISSOLVE, dList.get(i).getDepartmentId());
				departmentDao.deleteByPrimaryKey(dList.get(i).getDepartmentId());
			}

			return true;
		} else {

			return true;
		}

	}

	private int selectCountByPid(String departmentPid) {
		
		return departmentDao.selectCountByPid(departmentPid);
	}

}
