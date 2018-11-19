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

	/**
	 * 
	 * Description: 登录时校验账户名称与密码的合法性.<br/>
	 * 
	 * @param String account_name,String account_pwd
	 * @return String 校验结果信息
	 */
	public String validateAccount(String account_name, String account_pwd);

	/**
	 * 
	 * Description: 修改账户名字.<br/>
	 * 
	 * @param String account_id, String new_accountName
	 * @return String 修改结果信息
	 */
	public String updateAccountName(String account_id, String new_accountName);

	/**
	 * 
	 * Description: 修改账户密码.<br/>
	 * 
	 * @param String account_id, String new_accountName
	 * @return String 修改结果信息
	 */
	public String updateAccountPwd(String account_id, String new_pwd);

	/**
	 * 
	 * Description: 通过账户名字得到账户编号.<br/>
	 * 
	 * @param String account_name
	 * @return String
	 */
	public String getAccountID(String account_name);
}
