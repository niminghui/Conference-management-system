package scb.dev.sms.sm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import scb.dev.sms.common.CommonData;
import scb.dev.sms.sm.pojo.Department;
import scb.dev.sms.sm.pojo.Employee;
import scb.dev.sms.sm.service.IDepartmentService;
import scb.dev.sms.sm.service.IEmployeeService;

@Controller
public class DepartmentController {

	@Autowired
	private IDepartmentService iDepartmentService;
	@Autowired
	private IEmployeeService iEmployeeService;

	Department department;
	List<Department> departments;
	ModelAndView mv = new ModelAndView();

	@RequestMapping("/findOneDepartmentById")
	public ModelAndView findOneDepartmentById(@RequestParam(value = "departmentId") String departmentId) {
		department = iDepartmentService.findOneDepartmentById(departmentId);
		mv.addObject("department", department);
		mv.setViewName("pages/departmentDetails");
		return mv;
	}

	@RequestMapping("/findOneDepartmentByByAbbrev")
	public ModelAndView findOneDepartmentByByAbbrev(@RequestParam(value = "departmentAbbrev") String departmentAbbrev) {
		department = iDepartmentService.findOneDepartmentByAbbrev(departmentAbbrev);
		mv.addObject("department", department);
		mv.setViewName("pages/departmentDetails");
		return mv;
	}

	@RequestMapping("/findTreeDepartmentsInfo")
	public ModelAndView findTreeDepartmentsInfo() {
		departments = iDepartmentService.findTreeDepartmentsInfo();
		mv.addObject("department", department);
		mv.setViewName("pages/department");
		return mv;
	}

	@RequestMapping("/createNewDepartment")
	public ModelAndView createNewDepartment(HttpSession session,Department createDepartment) {
		String employeeId=(String) session.getAttribute("account_id");
		Employee employee=iEmployeeService.queryByEmployeeId(employeeId);
		createDepartment.setDepartmentUpdatedUser(employee.getEmployeeName());
		String res = iDepartmentService.insertDepartment(createDepartment);
		if (res.equals(CommonData.STRING_SUCCESS)) {
			mv.addObject("msg", "创建成功");
		} else {
			mv.addObject("msg", "创建失败,部门名称、部门简称不能重复");
		}
		mv.setViewName("pages/createDepartment");
		return mv;
	}
	@RequestMapping("/updateNewDepartment")
	public ModelAndView updateDepartment(HttpSession session,Department updateDepartment) {
		String employeeId=(String) session.getAttribute("account_id");
		Employee employee=iEmployeeService.queryByEmployeeId(employeeId);
		updateDepartment.setDepartmentUpdatedUser(employee.getEmployeeName());
		String res = iDepartmentService.updateDepartmentByDepartmentId(updateDepartment);
		if (res.equals(CommonData.STRING_SUCCESS)) {
			mv.addObject("msg", "修改成功");
		} else {
			mv.addObject("msg", "修改失败，部门名称、部门简称不能重复");
		}
		mv.setViewName("pages/departmentDetails");
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
