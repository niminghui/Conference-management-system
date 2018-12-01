package scb.dev.sms.sm.aspect;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import scb.dev.sms.common.CommonData;
import scb.dev.sms.common.CommonOperationType;
import scb.dev.sms.log.pojo.MenuLog;
import scb.dev.sms.log.service.IMenuLogService;
import scb.dev.sms.sm.service.IMenuService;
import scb.dev.sms.util.factory.TokenIDFactory;

/**
 * 每次对menu操作时将操作写入数据库
 * 
 * @author Weilei
 *
 */
@Component
@Aspect
public class MenuAspect {

	@Resource
	private IMenuLogService menuLogService;

	@Resource
	private IMenuService menuService;

	private Logger logger = Logger.getLogger(MenuAspect.class);

	/**
	 * 增加菜单时作为切入点
	 */
	@Pointcut("execution(* scb.dev.sms.controller.MenuController.addMenu(..))")
	public void addMenuPointCut() {

	}

	/**
	 * 修改菜单时作为切入点
	 */
	@Pointcut("execution(* scb.dev.sms.controller.MenuController.updateMenu(..))")
	public void updateMenuPointCut() {

	}

	/**
	 * 增加菜单时将其写入数据库
	 */
	@After("addMenuPointCut()")
	public void addAfter(JoinPoint joinPoint) {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		MenuLog menuLog = new MenuLog();
		menuLog.setLogMenuId(TokenIDFactory.getUUID());
		menuLog.setLogMenuOperatorType(CommonOperationType.ADD);
		menuLog.setLogMenuOperatorEid(request.getParameter("account_id"));
		if (CommonData.STRING_SUCCESS.equals(menuLogService.addMenuLog(menuLog))) {
			logger.info("add after: add menu log success");
		} else {
			logger.error("add after: add menu log failure");
		}		
	}

	@After("updateMenuPointCut()")
	public void updateAfter(JoinPoint joinPoint) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		MenuLog menuLog = new MenuLog();
		menuLog.setLogMenuId(TokenIDFactory.getUUID());
		menuLog.setLogMenuOperatorType(CommonOperationType.UPDATE);
		menuLog.setLogMenuOperatorEid(request.getParameter("account_id"));
		menuLogService.addMenuLog(menuLog);
		if (CommonData.STRING_SUCCESS.equals(menuLogService.addMenuLog(menuLog))) {
			logger.info("update after: update menu log success");
		} else {
			logger.error("update after: update menu log failure");
		}		
	}

}
