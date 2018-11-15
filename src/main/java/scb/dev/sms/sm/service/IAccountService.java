/**
 * Project Name:scb.sms
 * File Name:AccountService.java
 * Package Name:scb.dev.sms.sm.service
 * Date:2018年11月15日上午10:39:21
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.service;

/**
 * ClassName: IAccountService <br/>
 * Description: IAccountService interface. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月15日 上午10:39:21 <br/>
 */
public interface IAccountService {
	/**
	 * 
	 * Description: 创建职员时初始化该账户.<br/>
	 * 
	 * @param String employee_id, String employee_nickname
	 * @return String 创建账户成功与否信息
	 */
	public String initAccount(String employee_id, String employee_nickname);
}
