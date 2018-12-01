/**
 * Project Name:scb.sms
 * File Name:LoginInfo.java
 * Package Name:scb.dev.sms.sm.pojo
 * Date:2018年11月22日下午3:02:05
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.pojo;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

/**
 * ClassName: LoginInfo <br/>
 * Description: 封装用户登录信息. <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月22日 下午3:02:05 <br/>
 */
@Component
public class LoginInfo {
	@NotEmpty(message = "Captcha cannot be empty.")
	@Pattern(regexp = "([0-9]{4})", message = "Captcha must consist of four digits.")
	private String uyzm;

	@NotEmpty(message = "The account name cannot be empty.")
	@Size(min = 3, max = 25, message = "The length of the account name must be between {min} and {max}")
	private String account_name;

	@NotEmpty(message = "The account password cannot be empty.")
	private String account_pwd;

	/**
	 * uyzm.
	 *
	 * @return the uyzm
	 * @since JDK 1.8
	 */
	public String getUyzm() {
		return uyzm;
	}

	/**
	 * uyzm.
	 *
	 * @param uyzm the uyzm to set
	 * @since JDK 1.8
	 */
	public void setUyzm(String uyzm) {
		this.uyzm = uyzm;
	}

	/**
	 * account_name.
	 *
	 * @return the account_name
	 * @since JDK 1.8
	 */
	public String getAccount_name() {
		return account_name;
	}

	/**
	 * account_name.
	 *
	 * @param account_name the account_name to set
	 * @since JDK 1.8
	 */
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	/**
	 * account_pwd.
	 *
	 * @return the account_pwd
	 * @since JDK 1.8
	 */
	public String getAccount_pwd() {
		return account_pwd;
	}

	/**
	 * account_pwd.
	 *
	 * @param account_pwd the account_pwd to set
	 * @since JDK 1.8
	 */
	public void setAccount_pwd(String account_pwd) {
		this.account_pwd = account_pwd;
	}

}
