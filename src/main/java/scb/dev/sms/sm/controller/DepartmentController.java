package scb.dev.sms.sm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import scb.dev.sms.common.CommonData;
import scb.dev.sms.sm.pojo.Department;
import scb.dev.sms.sm.pojo.Employee;
import scb.dev.sms.sm.service.IDepartmentService;
import scb.dev.sms.sm.service.IEmployeeService;
import scb.dev.sms.sm.service.imp.DepartmentServiceImpl;

@Controller
public class DepartmentController {

	@Autowired
	private IDepartmentService iDepartmentService;
	@Autowired
	private IEmployeeService iEmployeeService;

	Department department;
	List<Department> departments, findAllDepartmentToSelect;

	ModelAndView mv = new ModelAndView();

	// 输入框方法
	@RequestMapping(value = "/findOneDepartment", method = RequestMethod.POST) // O是id,1是名称，2是简称
	public ModelAndView findOneDepartment(@RequestParam(value = "searchString") String departmentString,
			@RequestParam(value = "conditions") String conditions) {
		mv.clear();
		if (conditions == null) {
			conditions = "0";
		}
		if (conditions.equals("0")) {
			department = iDepartmentService.findOneDepartmentById(departmentString);

		} else if (conditions.equals("1")) {
			department = iDepartmentService.findOneDepartmentByName(departmentString);
		} else {
			department = iDepartmentService.findOneDepartmentByAbbrev(departmentString);
		}

		if (department == null) {
			mv.addObject("msg", "没有这个部门，请核对要查找的部门信息");
			departments = iDepartmentService.findParentDepartment();
			mv.addObject("departments", departments);
			mv.setViewName("department");
			return mv;
		}
		// 修改父部门名字
		Department pidDepartment = iDepartmentService.findOneDepartmentById(department.getDepartmentPid());

		if (!(pidDepartment == null)) {
			department.setDepartmentPid(pidDepartment.getDepartmentName());
		} else {
			department.setDepartmentPid("总部门");
		}
		departments = iDepartmentService.findDepartmentAndSubInfo(department.getDepartmentId());
		// 查找部门信息，用来修改信息时做选择列表
		findAllDepartmentToSelect = getAllDepartmentToSelect();
		// 从选择列中去掉自己部门
		for (int i=0;i<findAllDepartmentToSelect.size();i++) {
			if (findAllDepartmentToSelect.get(i).getDepartmentId().equals(department.getDepartmentId())) {
				System.out.println(" 从选择列中去掉自己部门");
				findAllDepartmentToSelect.remove(i);
				break;
			}

		}
		mv.addObject("findAllDepartmentToSelect", findAllDepartmentToSelect);

		mv.addObject("departments", departments);
		mv.addObject("department", department);
		mv.setViewName("department");
		System.out.println(departments.toString());
		System.out.println("----------------");
		return mv;
	}

	// 圆连接点击方法
	@RequestMapping(value = "/findOneDepartmentById", method = RequestMethod.GET) // O是id,1是名称，2是简称
	public ModelAndView findOneDepartmentById(@RequestParam(value = "searchString") String departmentString) {

		mv.clear();

		department = iDepartmentService.findOneDepartmentById(departmentString);
		if (department == null) {
			mv.addObject("msg", "没有这个部门，请核对要查找的部门信息");
			departments = iDepartmentService.findParentDepartment();
			mv.addObject("departments", departments);
			mv.setViewName("department");
			return mv;
		}
		// 修改父部门名字
		Department pidDepartment = iDepartmentService.findOneDepartmentById(department.getDepartmentPid());
		if (!(pidDepartment == null)) {
			department.setDepartmentPid(pidDepartment.getDepartmentName());
		} else {
			department.setDepartmentPid("总部门");
		}

		//查找子部门
		departments = iDepartmentService.findDepartmentAndSubInfo(department.getDepartmentId());
		// 查找部门信息，用来修改信息时做选择列表
		findAllDepartmentToSelect = getAllDepartmentToSelect();
		// 从选择列中去掉自己本身
		for (int i=0;i<findAllDepartmentToSelect.size();i++) {
			//int a=0,b=0;
			if (findAllDepartmentToSelect.get(i).getDepartmentId().equals(department.getDepartmentId())) {
				System.out.println(" 从选择列中去掉自己部门");
				findAllDepartmentToSelect.remove(i);
			//	a=1;
			}
			
			
		}
		mv.addObject("departments", departments);
		mv.addObject("department", department);
		mv.addObject("findAllDepartmentToSelect", findAllDepartmentToSelect);
		mv.setViewName("department");
		System.out.println(departments.toString());
		System.out.println("----------------");
		return mv;
	}

	private List<Department> getAllDepartmentToSelect() {
		List<Department> getAlldepartments = iDepartmentService.findDepartmentNamesAndId();
		Department OneDepartment = new Department();
		OneDepartment.setDepartmentId(CommonData.DEPARTMENT_PID);
		OneDepartment.setDepartmentName("总部门");
		getAlldepartments.add(OneDepartment);
		return getAlldepartments;
	}

	// 可能用不到了
	@RequestMapping(value = "/findTreeDepartmentsInfo", method = RequestMethod.GET)
	public ModelAndView findTreeDepartmentsInfo() {
		System.out.println("findTreeDepartmentsInfo");
		departments = iDepartmentService.findTreeDepartmentsInfo();
		mv.addObject("departments", departments);
		mv.setViewName("department");
		return mv;
	}

	@RequestMapping(value = "/findParentDepartments", method = RequestMethod.GET)
	public ModelAndView findParentDepartments() {
		mv.clear();
		departments = iDepartmentService.findParentDepartment();

		mv.addObject("departments", departments);
		mv.setViewName("department");
		return mv;
	}

	@RequestMapping("/createNewDepartment")
	public ModelAndView createNewDepartment(HttpSession session, Department createDepartment) {
		String employeeId = (String) session.getAttribute("account_id");
		Employee employee = iEmployeeService.queryByEmployeeId(employeeId);
		createDepartment.setDepartmentUpdatedUser(employee.getEmployeeName());
		String res = iDepartmentService.insertDepartment(createDepartment);
		if (res.equals(CommonData.STRING_SUCCESS)) {
			mv.addObject("msg", "创建成功");
		} else {
			mv.addObject("msg", "创建失败,部门名称、部门简称不能重复");
		}
		mv.setViewName("department");
		return mv;
	}

	@RequestMapping("/updateNewDepartment")
	public ModelAndView updateDepartment(HttpSession session, Department updateDepartment) {
		mv.clear();
		department=updateDepartment;
		System.out.println(updateDepartment.toString());
		String employeeId = (String) session.getAttribute("account_id");
		
		//因为没有登录，所以会报错       -------需要改
		if(employeeId==null) {
			System.out.println("神秘人");
			department.setDepartmentUpdatedUser("神秘人");
		}else {
			Employee employee = iEmployeeService.queryByEmployeeId(employeeId);
			department.setDepartmentUpdatedUser(employee.getEmployeeName());
		}
		
		department.setDepartmentOrderid("1");
		System.out.println(updateDepartment.toString());
		System.out.println(department.toString());
		String res = iDepartmentService.updateDepartmentByDepartmentId(department);
		System.out.println("res"+res);
		//无论改变成功与否，重新装载页面数据       TODO
		findOneDepartmentById(updateDepartment.getDepartmentId());
		
		
		if (res.equals(CommonData.STRING_SUCCESS)) {
			mv.addObject("msg", "修改成功");
		} else {
			mv.addObject("msg", "修改失败，部门名称、部门简称不能重复");
		}
		
		mv.setViewName("department");
		return mv;
	}

	@RequestMapping("/deleteDepartment")
	public ModelAndView deleteDepartment(@RequestParam(value = "departmentId") String departmentId) {

		String res = iDepartmentService.deleteDepartmentByDepartmentId(departmentId);
		if (res.equals(CommonData.STRING_SUCCESS)) {
			mv.addObject("msg", "删除成功");
		} else {
			mv.addObject("msg", "删除失败，部门名称、部门简称不能重复");
		}
		mv.setViewName("pages/department");
		return mv;
	}

}
