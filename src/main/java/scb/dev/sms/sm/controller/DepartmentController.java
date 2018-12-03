package scb.dev.sms.sm.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import scb.dev.sms.common.CommonData;
import scb.dev.sms.sm.pojo.Department;
import scb.dev.sms.sm.pojo.Employee;
import scb.dev.sms.sm.service.IDepartmentService;
import scb.dev.sms.sm.service.IEmployeeService;


@CrossOrigin
@Controller
public class DepartmentController {

	@Autowired
	private IDepartmentService iDepartmentService;
	@Autowired
	private IEmployeeService iEmployeeService;
	List<String> IdRes=new LinkedList<>();
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
		//添加下边子部门信息
		departments = iDepartmentService.findDepartmentAndSubInfo(department.getDepartmentId());
		// 查找所有部门信息，用来修改信息时做选择列表
		findAllDepartmentToSelect = getAllDepartmentToSelect();
		System.out.println("所有信息："+findAllDepartmentToSelect.toString());
		//查找所有子部门id信息
	    List<Department> departmentss=iDepartmentService.selectIdAndSubId(department.getDepartmentId());
	    System.out.println("departmentss:"+departmentss.toString());
	 // 从选择列中去掉自己部门以及子部门
	
	  //  System.out.println(resAllDepToSelect.size());
		if(departmentss.size()!=0) {
			resetDep(departmentss);
			for(int i=0;i<findAllDepartmentToSelect.size();i++) {
				
				for(String str:IdRes) {
					if(findAllDepartmentToSelect.get(i).getDepartmentId().equals(str)) {
						findAllDepartmentToSelect.remove(i);
						
					}
				}
			}
		//	System.out.println("findAllDepartmentToSelect.toString():"+findAllDepartmentToSelect.size()+findAllDepartmentToSelect.toString());
		//	System.out.println("resAllDepToSelect.toString()："+resAllDepToSelect.size()+resAllDepToSelect.toString());
		//	Iterator<Department> iterator=findAllDepartmentToSelect.iterator();
			//从列表里去掉自己全部子部门选项
			/*while(iterator.hasNext()) {
				synchronized (iterator) {
				       Department dep=iterator.next();
				       for(String str:IdRes){
				    	   if(!dep.getDepartmentId().equals(str)) {
					    	 //  iterator.remove();
					    	 //  break;
				    		 //  resAllDepToSelect.add(iterator);
					       } 
				       }
				       
				}
			}*/
		}
		
		//从列表里去掉自己部门选项
		for (int i = 0; i < findAllDepartmentToSelect.size(); i++) {
			if (findAllDepartmentToSelect.get(i).getDepartmentId().equals(department.getDepartmentId())) {
				System.out.println(" 从选择列中去掉自己部门及子部门");
				findAllDepartmentToSelect.remove(i);
				break;
			}
		}
	//	System.out.println(findAllDepartmentToSelect.toString());
		mv.addObject("findAllDepartmentToSelect", findAllDepartmentToSelect);

		mv.addObject("departments", departments);
		mv.addObject("department", department);
		mv.setViewName("department");
		return mv;
	}
	
	private List<String> resetDep(List<Department> departments){
		
		for(Department d: departments) {
			IdRes.add(d.getDepartmentId());
			if(d.getDepartments().size()!=0) {
				resetDep(d.getDepartments());
			}
		}
			
		return IdRes;
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

		// 查找下一层子部门
		departments = iDepartmentService.findDepartmentAndSubInfo(department.getDepartmentId());
		// 查找部门信息，用来修改信息时做选择列表
		findAllDepartmentToSelect = getAllDepartmentToSelect();
		// 从选择列中去掉自己部门以及子部门
	    List<Department> departmentss=iDepartmentService.selectIdAndSubId(department.getDepartmentId());
		if(departmentss.size()!=0) {
			resetDep(departmentss);
			for(int i=0;i<findAllDepartmentToSelect.size();i++) {
				for(String str:IdRes) {
					if(findAllDepartmentToSelect.get(i).getDepartmentId().equals(str)) {
						findAllDepartmentToSelect.remove(i);
						
					}
				}
			}
		}
		// 从选择列中去掉自己本身
		for (int i = 0; i < findAllDepartmentToSelect.size(); i++) {
			// int a=0,b=0;
			if (findAllDepartmentToSelect.get(i).getDepartmentId().equals(department.getDepartmentId())) {
				System.out.println(" 从选择列中去掉自己部门");
				findAllDepartmentToSelect.remove(i);
				// a=1;
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

	//获得部门列表
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

	@RequestMapping("/CreateNewDepartment")
	public ModelAndView CreateNewDepartment(HttpSession session, Department createDepartment) {
		// 查找部门信息，用来修改信息时做选择列表
		findAllDepartmentToSelect = getAllDepartmentToSelect();
		mv.addObject("findAllDepartmentToSelect", findAllDepartmentToSelect);
		mv.setViewName("createNewDep");
		return mv;
	}

	@RequestMapping(value = "/FinishCreateNewDepartment", method = RequestMethod.POST)
	public ModelAndView FinishCreateNewDepartment(HttpSession session, Department createDepartment) {
		mv.clear();
		String employeeId = (String) session.getAttribute("account_id");
		Employee employee = null;
		// Employee employee = iEmployeeService.queryByEmployeeId(employeeId);
		// 因为没有登录，所以会报错 -------需要改
		if (employeeId == null) {
			System.out.println("神秘人");
			createDepartment.setDepartmentUpdatedUser("神秘人");
			createDepartment.setDepartmentCreatedUser("神秘人");
		} else {
			employee = iEmployeeService.queryByEmployeeId(employeeId);
			createDepartment.setDepartmentUpdatedUser(employee.getEmployeeName());
			createDepartment.setDepartmentCreatedUser(employee.getEmployeeName());
		}

		String res = iDepartmentService.insertDepartment(createDepartment);

		if (res.equals(CommonData.STRING_SUCCESS)) {

			// 无论改变成功与否，重新装载页面数据 TODO
			findOneDepartment(createDepartment.getDepartmentAbbreviation(), "2");
			System.out.println("重新装载页面数据后");
			mv.addObject("msg", "创建成功");
			mv.setViewName("department");
		} else {
			System.out.println("返回失败");
			mv.addObject("msg", "创建失败,部门名称、部门简称不能重复");
			mv.setViewName("createNewDep");
		}

		return mv;
	}

	@RequestMapping("/cheakSameUsername")
	@ResponseBody
	public String cheakSameUsername(@RequestBody() String departmentStr) {

		String departmentName = (String) JSON.parseObject(departmentStr).get("departmentName");
		System.out.println("-----------------------" + departmentName);
		if (iDepartmentService.selectCountByName(departmentName) > 0) {
			return "false";
		} else {
			return "true";
		}
	}

	@RequestMapping("/cheakSameAbbreviation")
	@ResponseBody
	public String cheakSameAbbreviation(@RequestBody() String departmentStr) {
		System.out.println(departmentStr);
		String departmentAbbreviation = (String) JSON.parseObject(departmentStr).get("departmentAbbreviation");
		System.out.println("-----------------------" + departmentAbbreviation);

		if (iDepartmentService.selectCountByAbbrev(departmentAbbreviation) > 0) {
			return "false";
		} else {
			return "true";
		}
	}

	@RequestMapping("/updateNewDepartment")
	public ModelAndView updateDepartment(HttpSession session, Department updateDepartment) {
		mv.clear();
		department = updateDepartment;
		System.out.println(updateDepartment.toString());
		String employeeId = (String) session.getAttribute("account_id");

		// 因为没有登录，所以会报错 -------需要改
		if (employeeId == null) {
			System.out.println("神秘人");
			department.setDepartmentUpdatedUser("神秘人");
		} else {
			Employee employee = iEmployeeService.queryByEmployeeId(employeeId);
			department.setDepartmentUpdatedUser(employee.getEmployeeName());
		}

		department.setDepartmentOrderid("1");
		System.out.println(updateDepartment.toString());
		System.out.println(department.toString());
		String res = iDepartmentService.updateDepartmentByDepartmentId(department);
		System.out.println("res" + res);
		// 无论改变成功与否，重新装载页面数据 
		findOneDepartmentById(updateDepartment.getDepartmentId());

		if (res.equals(CommonData.STRING_SUCCESS)) {
			mv.addObject("msg", "修改成功");
		} else {
			mv.addObject("msg", "修改失败，部门名称、部门简称不能重复");
		}

		mv.setViewName("department");
		return mv;
	}

	@RequestMapping(value = "/deleteDepartment", method = RequestMethod.POST, produces = {
			"application/json;charset=UTF-8" }) // produces = {"application/json;charset=UTF-8"}解决json中文乱码问题
	@ResponseBody
	public String deleteDepartment(@RequestBody String departmentStr) {
		mv.clear();
		JSONObject jsonObject = new JSONObject();
		System.out.println(departmentStr);
		String departmentName = (String) JSON.parseObject(departmentStr).get("departmentId");
		System.out.println(departmentName);
		if (departmentName != null) {
			String res = iDepartmentService.deleteDepartmentByDepartmentId(departmentName);
			if (res.equals(CommonData.STRING_SUCCESS)) {

				jsonObject.put("msg", "删除成功");
			} else if (res.equals(CommonData.DEPARTMENT_NOT_EXIST)) {
                 jsonObject.put("msg", "该部门已经不存在，请刷新页面");
			} else {
				jsonObject.put("msg", "删除失败,服务器错误");
			}
		} else {
			jsonObject.put("msg", "页面错误，请联系维护人员");
		}		
		return jsonObject.toJSONString();
	}

}
