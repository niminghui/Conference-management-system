/**
 * Project Name:scb.sms
 * File Name:LoginAspect.java
 * Package Name:scb.dev.sms.sm.aspect
 * Date:2018年11月23日上午10:06:33
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.aspect;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import scb.dev.sms.common.CommonData;
import scb.dev.sms.common.CommonOperationType;
import scb.dev.sms.log.pojo.AccountLog;
import scb.dev.sms.log.service.IAccountLogService;
import scb.dev.sms.sm.service.IAccountService;
import scb.dev.sms.util.factory.TokenIDFactory;

/**
 * ClassName: LoginAspect <br/>
 * Description: 登录时记录用户登录情况并写入数据库. <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月23日 上午10:06:33 <br/>
 */
@Component
@Aspect
public class LoginAspect {
	@Resource
	private IAccountLogService accountLogService;
	@Resource
	private IAccountService accountService;

	private Logger logger = Logger.getLogger(LoginAspect.class);

	/**
	 * 
	 * Description: 登录操作切点.<br/>
	 */
	@Pointcut("execution(* scb.dev.sms.sm.controller.AccountController.loginValidate(..))")
	public void loginPointCut() {

	}

	/**
	 * 
	 * Description: 注销操作切点.<br/>
	 */
	@Pointcut("execution(* scb.dev.sms.sm.controller.AccountController.writeOff(..))")
	public void logoutPointCut() {

	}

	/**
	 * 
	 * Description: 用户登录时记录其登录信息并写入数据库 .<br/>
	 * 
	 * @param JoinPoint joinPoint
	 */
	@After("loginPointCut()")
	public void loginAfter(JoinPoint joinPoint) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		String account_name = request.getParameter("account_name");
		String account_id = accountService.getAccountID(account_name);
		if (account_id == null) {
			return;
		}
		AccountLog accountLog = new AccountLog();
		accountLog.setLogAccountId(TokenIDFactory.getUUID());
		accountLog.setLogAccountOperatorEid(account_id);
		accountLog.setLogAccountOperatorType(CommonOperationType.LOGIN);
		if (CommonData.STRING_SUCCESS.equals(accountLogService.addAccountLog(accountLog))) {
			logger.info("login after: add login log success");
		} else {
			logger.error("login after: add login log failure");
		}
	}

	/**
	 * 
	 * Description: 用户注销时记录其信息并写入数据库 .<br/>
	 * 
	 * @param JoinPoint joinPoint
	 */
	@Before("logoutPointCut()")
	public void logoutBefore(JoinPoint joinPoint) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		String account_name = (String) request.getSession().getAttribute("account_name");
		String account_id = accountService.getAccountID(account_name);
		AccountLog accountLog = new AccountLog();
		accountLog.setLogAccountId(TokenIDFactory.getUUID());
		accountLog.setLogAccountOperatorEid(account_id);
		accountLog.setLogAccountOperatorType(CommonOperationType.LOGOUT);
		if (CommonData.STRING_SUCCESS.equals(accountLogService.addAccountLog(accountLog))) {
			logger.info("logout before: add logout log success");
		} else {
			logger.error("logout before: add logout log failure");
		}
	}
}
