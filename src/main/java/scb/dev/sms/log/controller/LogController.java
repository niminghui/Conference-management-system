/**
 * Project Name:scb.sms
 * File Name:LogController.java
 * Package Name:scb.dev.sms.log.controller
 * Date:2018年12月2日下午2:16:22
 * Copyright (c) 2018, erwin.wang@clpsglobal.com All Rights Reserved.
 *
 */
package scb.dev.sms.log.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import scb.dev.sms.log.pojo.EmployeeLog;
import scb.dev.sms.log.service.IEmployeeLogService;
import org.springframework.ui.Model;

/**
 * ClassName: LogController <br/>
 * Description: TODO ADD REASON(可选). <br/><br/>
 * date: 2018年12月2日 下午2:16:22 <br/>
 *
 * @author Oscar.Zhang
 * @version V1.0
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/log")
public class LogController {
	@Autowired
	IEmployeeLogService employeeLogService;
	
	@RequestMapping("/showLogList")
	public String showLogList() {
		return "log_list";
	}
	
	@RequestMapping("/showEmployeeList")
	public String showEmployeeList(Model model,HttpServletRequest request) {
		String str = request.getParameter("leixing");
		if (str.equals("职员")) {
			List<EmployeeLog> lists = employeeLogService.showAllEmployeeLog();
			model.addAttribute("employeeLog", lists);
			System.out.println(lists);
		}
		return "log_list";
	}
	
	@RequestMapping("/deleteEmployeeList/{employeeId}")
	public String deleteEmployeeList(Model model,@PathVariable("employeeId")String employeeId) {
		
		 if (employeeLogService.deleteEmployeeLog(employeeId).equals("success")) {
			 List<EmployeeLog> lists = employeeLogService.showAllEmployeeLog();
			 model.addAttribute("employeeLog", lists);
		}
		 return "log_list";
	}
}
