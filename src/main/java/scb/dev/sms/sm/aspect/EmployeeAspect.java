package scb.dev.sms.sm.aspect;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import scb.dev.sms.common.CommonOperationType;
import scb.dev.sms.log.pojo.EmployeeLog;
import scb.dev.sms.log.service.IEmployeeLogService;
import scb.dev.sms.util.factory.TokenIDFactory;

@Component
@Aspect
public class EmployeeAspect {
	@Resource
	private IEmployeeLogService employeeLogService;

	private Logger logger = Logger.getLogger(EmployeeAspect.class);
	
	@After("execution(* scb.dev.sms.sm.controller.EmployeeController.queryAllEmployeeInfo(..))")
	public void employeeListAfter() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		EmployeeLog employeeLog = new EmployeeLog();
		employeeLog.setLogEmployeeOperatorEid((String)request.getSession().getAttribute("account_id"));
		employeeLog.setLogEmployeeOperatorType(CommonOperationType.QUERY);
		employeeLog.setLogEmployeeId(TokenIDFactory.getUUID());
		if("SUCCESS".equals(employeeLogService.addEmployeeLog(employeeLog))) {
			logger.info("employeeList affter:add employee log success");
		}
		else {
			logger.error("employeeList after:add employee log fail");
		}
	}
	@After("execution(* scb.dev.sms.sm.controller.EmployeeController.addEmployee(..))")
	public void employeeAddAfter() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		EmployeeLog employeeLog = new EmployeeLog();
		employeeLog.setLogEmployeeOperatorEid((String)request.getSession().getAttribute("account_id"));
		employeeLog.setLogEmployeeOperatorType(CommonOperationType.SAVE);
		employeeLog.setLogEmployeeId(TokenIDFactory.getUUID());
		if("SUCCESS".equals(employeeLogService.addEmployeeLog(employeeLog))) {
			logger.info("employeeAdd affter:add employee log success");
		}
		else {
			logger.error("employeeAdd after:add employee log fail");
		}
	}
	@After("execution(* scb.dev.sms.sm.controller.EmployeeController.editEmployee(..))")
	public void employeeEditAfter() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		EmployeeLog employeeLog = new EmployeeLog();
		employeeLog.setLogEmployeeOperatorEid((String)request.getSession().getAttribute("account_id"));
		employeeLog.setLogEmployeeOperatorType(CommonOperationType.UPDATE);
		employeeLog.setLogEmployeeId(TokenIDFactory.getUUID());
		if("SUCCESS".equals(employeeLogService.addEmployeeLog(employeeLog))) {
			logger.info("employeeEdit affter:add employee log success");
		}
		else {
			logger.error("employeeEdit after:add employee log fail");
		}
	}
	@After("execution(* scb.dev.sms.sm.controller.EmployeeController.editEmployeeStatusToLeave(..))")
	public void employeeLeaveAfter() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		EmployeeLog employeeLog = new EmployeeLog();
		employeeLog.setLogEmployeeOperatorEid((String)request.getSession().getAttribute("account_id"));
		employeeLog.setLogEmployeeOperatorType(CommonOperationType.DELETE);
		employeeLog.setLogEmployeeId(TokenIDFactory.getUUID());
		if("SUCCESS".equals(employeeLogService.addEmployeeLog(employeeLog))) {
			logger.info("employeeLeave affter:add employee log success");
		}
		else {
			logger.error("employeeLeave after:add employee log fail");
		}
	}
}
