package scb.dev.sms.sm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import scb.dev.sms.sm.pojo.Employee;
import scb.dev.sms.sm.pojo.EmployeeAddress;
import scb.dev.sms.sm.pojo.EmployeeContactInfo;
import scb.dev.sms.sm.service.IEmployeeService;
import scb.dev.sms.util.tool.PagingVO;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Resource
	private IEmployeeService employeeService;
	//页码对象
	private PagingVO pagingVO=new PagingVO();
	
	private List<Employee> employeeList;
	
	/**
	 * 
	 * @Title: employeeList   
	 * @Description: 点击查询标签，跳转到employee_list.jsp查询界面   
	 * @param: @param model
	 * @param: @param page
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value="/employeeList",method=RequestMethod.GET)
	public String queryAllEmployeeInfo(Model model,Integer page) {
		//设置总页数
		pagingVO.setTotalCount(this.employeeService.getCountEmployee());
        if (page == null || page == 0) {
            pagingVO.setToPageNo(1);
            employeeList = this.employeeService.queryAllEmployee(pagingVO);
        } else {
            pagingVO.setToPageNo(page);//设置要前往的页码
            employeeList = this.employeeService.queryAllEmployee(pagingVO);
        }
        if(null!=employeeList){
        model.addAttribute("employeeList", employeeList);
        model.addAttribute("pagingVO", pagingVO);
        }
		
		return "employeeList";
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
	@RequestMapping(value="/employeeQuery",method=RequestMethod.GET)
	public String queryEmployeeById(Model model,String employeeId) {
		Employee employee = employeeService.queryByEmployeeId(employeeId);
		model.addAttribute("employee", employee);
		return "";
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
	public String goAddEmployee() {
		return "sms/employee_add";
	}
	
	@RequestMapping(value="/addEmployee",method=RequestMethod.GET)
	public String addEmployee(Model model,Integer page,Employee employee,EmployeeAddress employeeAddress,
			EmployeeContactInfo employeeContactInfo,HttpServletRequest request) {
		
		employee.setEmployeeCreatedUser((String)request.getSession().getAttribute("account"));
		//设置职位更改人
		employee.setEmployeeUpdatedUser(employee.getEmployeeCreatedUser());
		employee.setEmployeeAddress(employeeAddress);
		employee.setEmployeeContactInfo(employeeContactInfo);
		
		employeeService.initEmployee(employee);
		
		pagingVO.setTotalCount(this.employeeService.getCountEmployee());
        if (page == null || page == 0) {
            pagingVO.setToPageNo(1);
            employeeList = this.employeeService.queryAllEmployee(pagingVO);
        } else {
            pagingVO.setToPageNo(page);//设置要前往的页码
            employeeList = this.employeeService.queryAllEmployee(pagingVO);
        }
        if(null!=employeeList){
        model.addAttribute("employeeList", employeeList);
        model.addAttribute("pagingVO", pagingVO);
        }
		
        return "employeeList";
	}
	
	/**
	 * 
	 * @Title: goEditEmployee   
	 * @Description: 点击修改标签，跳转到employee_edit.jsp编辑界面   
	 * @param: @param request
	 * @param: @param model
	 * @param: @param page
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/goEditEmployee", method = RequestMethod.GET)
	public String goEditEmployee(HttpServletRequest request, Model model,Integer page) {
		String employeeId = request.getParameter("employeeId");
		Employee employee = employeeService.queryByEmployeeId(employeeId);
		if(null!=employee){
			model.addAttribute("employee", employee);
			model.addAttribute("page",page);
			
		}

		return "sms/position_edit";
	}
	
	/**
	 * 
	 * @Title: editEmployee   
	 * @Description: 提交更新form表单，跳转到employee_list.jsp查询界面
	 * @param: @param request
	 * @param: @param model
	 * @param: @param position
	 * @param: @param page
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value="/editEmployee",method=RequestMethod.GET)
	public String editEmployee(HttpServletRequest request, Model model,Integer page,
			Employee employee,EmployeeAddress employeeAddress,EmployeeContactInfo employeeContactInfo) {
		employee.setEmployeeUpdatedUser((String)request.getSession().getAttribute("account"));
		employee.setEmployeeAddress(employeeAddress);
		employee.setEmployeeContactInfo(employeeContactInfo);
		
		employeeService.editEmployee(employee);
		
		pagingVO.setTotalCount(this.employeeService.getCountEmployee());
        if (page == null || page == 0) {
            pagingVO.setToPageNo(1);
            employeeList = this.employeeService.queryAllEmployee(pagingVO);
        } else {
            pagingVO.setToPageNo(page);//设置要前往的页码
            employeeList = this.employeeService.queryAllEmployee(pagingVO);
        }
        if(null!=employeeList){
        model.addAttribute("employeeList", employeeList);
        model.addAttribute("pagingVO", pagingVO);
        }
		
        return "employeeList";
	}
	
}