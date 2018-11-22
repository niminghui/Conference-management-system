package scb.dev.sms.sm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import scb.dev.sms.common.CommonData;
import scb.dev.sms.sm.dao.DepartmentDao;
import scb.dev.sms.sm.pojo.Department;
import scb.dev.sms.sm.pojo.Employee;
import scb.dev.sms.sm.pojo.EmployeeAddress;
import scb.dev.sms.sm.pojo.EmployeeContactInfo;
import scb.dev.sms.sm.pojo.Position;
import scb.dev.sms.sm.service.IDepartmentService;
import scb.dev.sms.sm.service.IEmployeeService;
import scb.dev.sms.sm.service.IPositionService;
import scb.dev.sms.util.tool.PagingVO;

@Controller
@RequestMapping("/sm")
public class EmployeeController {
	
	@Resource
	private IEmployeeService employeeService;
	
	@Resource
	private DepartmentDao departmentDao;
	
	@Resource
	private IPositionService positionService;
	
	
	//页码对象
	private PagingVO pagingVO=new PagingVO();
	
	private List<Employee> employees;
	
	/**
	 * 
	 * @Title: employeeList   
	 * @Description: 点击查询标签，跳转到employee_list.jsp查询界面   
	 * @param: @param model
	 * @param: @param pageNo
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value="/employeeList",method=RequestMethod.GET)
	public String queryAllEmployeeInfo(Model model,Integer pageNo) {
		
		paging(model,pageNo);
		
		return "employee_list";
	}
	
	/**
	 * 
	 * @Title: queryEmployeeById   
	 * @Description: 点击查询标签，获取一个员工信息 
	 * @param: @param model
	 * @param: @param employeeId
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value="/queryOneEmployee",method=RequestMethod.GET)
	public String queryEmployeeById(Model model,String employeeId) {
		Employee employee = employeeService.queryByEmployeeId(employeeId);
		model.addAttribute("employee", employee);
		return "sms/employee";
	}
	
	
	/**
	 * 
	 * @Title: goAddEmployee   
	 * @Description: 点击添加员工标签，跳转到employee_add.jsp添加界面  
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/goAddEmployee", method = RequestMethod.GET)
	public String goAddEmployee(Model model) {
		List<Position> positions=positionService.queryAllPosition();
		List<Department> departments=departmentDao.selectAllDepartment();
		model.addAttribute("positions", positions);
		model.addAttribute("departments", departments);
		return "employee_add";
	}
	
	@RequestMapping(value="/addEmployee",method=RequestMethod.POST)
	public String addEmployee(Model model,Integer pageNo,Employee employee,EmployeeAddress address,
			EmployeeContactInfo employeeContactInfo,HttpServletRequest request) {
		
		//employee.setEmployeeCreatedUser((String)request.getSession().getAttribute("account"));
		employee.setEmployeeCreatedUser("0dea625ffbac4a64b5cb264bc7932357");
		//设置职位更改人
		employee.setEmployeeUpdatedUser(employee.getEmployeeCreatedUser());
		
		employeeService.initEmployee(employee,address,employeeContactInfo);
		
		paging(model,pageNo);
		
        return "redirect:employeeList";
	}
	
	/**
	 * 
	 * @Title: goEditEmployee   
	 * @Description: 点击修改标签，跳转到employee_edit.jsp编辑界面   
	 * @param: @param request
	 * @param: @param model
	 * @param: @param pageNo
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/goEditEmployee", method = RequestMethod.GET)
	public String goEditEmployee(HttpServletRequest request, Model model,Integer pageNo) {
		String employeeId = request.getParameter("employeeId");
		Employee employee = employeeService.queryByEmployeeId(employeeId);
		if(null!=employee){
			model.addAttribute("employee", employee);
			model.addAttribute("pageNo",pageNo);
			
		}
		List<Position> positions=positionService.queryAllPosition();
		List<Department> departments=departmentDao.selectAllDepartment();
		model.addAttribute("positions", positions);
		model.addAttribute("departments", departments);

		return "employee_edit";
	}
	
	/**
	 * 
	 * @Title: editEmployee   
	 * @Description: 提交更新form表单，跳转到employee_list.jsp查询界面
	 * @param: @param request
	 * @param: @param model
	 * @param: @param position
	 * @param: @param pageNo
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value="/editEmployee",method=RequestMethod.POST)
	public String editEmployee(HttpServletRequest request, Model model,Integer pageNo,
			Employee employee,EmployeeAddress employeeAddress,EmployeeContactInfo employeeContactInfo) {
		employee.setEmployeeUpdatedUser((String)request.getSession().getAttribute("account"));

		employeeService.editEmployee(employee,employeeAddress,employeeContactInfo);
		paging(model,pageNo);
		
        return "redirect:employeeList";
	}
	
	
	/**
	 * 
	 * @Title: editEmployee   
	 * @Description: 提交更新form表单，跳转到employee_list.jsp查询界面
	 * @param: @param request
	 * @param: @param model
	 * @param: @param position
	 * @param: @param pageNo
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value="/editEmployeeToLeave")
	public String editEmployeeStatusToLeave(HttpServletRequest request, Model model,Integer pageNo,
			Employee employee,EmployeeAddress employeeAddress,EmployeeContactInfo employeeContactInfo) {
		employee.setEmployeeUpdatedUser((String)request.getSession().getAttribute("account"));
		employee.setEmployeeStatus(CommonData.STATUS_LEAVE_OFFICE);
		employeeService.editEmployee(employee,employeeAddress,employeeContactInfo);
		paging(model,pageNo);
		
        return "redirect:employeeList";
	}
	
	
	/**
	 * 
	 * paging:(分页查询操作). <br/>
	 * @param model 
	 * @param pageNo 当前页数
	 *
	 * @author ryan.li
	 * @since JDK 1.8
	 */
	public void paging(Model model,Integer pageNo) {
		
		pagingVO.setTotalCount(this.employeeService.getCountEmployee(""));
		
        if (pageNo == null || pageNo == 0) {
            pagingVO.setToPageNo(1);
            employees = this.employeeService.queryAllEmployee(pagingVO);
        } else {
            pagingVO.setToPageNo(pageNo);//设置要前往的页码
            employees = this.employeeService.queryAllEmployee(pagingVO);
        }
        
        if(null!=employees){
        model.addAttribute("employees", employees);
        model.addAttribute("pagingVO", pagingVO);
        }
	}
}
