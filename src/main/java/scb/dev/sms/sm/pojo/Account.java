/**
 * Project Name:clps.sms
 * File Name:Account.java
 * Package Name:com.clps.dev.sms.sm.pojo
 * Date:2018年10月31日下午2:29:00
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * ClassName: Account <br/>
 * Description: Account实体类 <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年10月31日 下午2:29:00 <br/>
 */
public class Account implements Serializable {

	private static final long serialVersionUID = 4939117968767633010L;

	private String accountId;
	private String accountName;
	private String accountPwd;
	private String accountDescription;
	private String accountCreatedName;
	private Timestamp accountCreatedDate;
	private String accountUpdatedName;
	private Timestamp accountUpdatedDate;

	public Account() {
		super();
	}

	public final String getAccountId() {
		return accountId;
	}

	public final void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public final String getAccountName() {
		return accountName;
	}

	public final void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public final String getAccountPwd() {
		return accountPwd;
	}

	public final void setAccountPwd(String accountPwd) {
		this.accountPwd = accountPwd;
	}

	public final String getAccountDescription() {
		return accountDescription;
	}

	public final void setAccountDescription(String accountDescription) {
		this.accountDescription = accountDescription;
	}

	public final String getAccountCreatedName() {
		return accountCreatedName;
	}

	public final void setAccountCreatedName(String accountCreatedName) {
		this.accountCreatedName = accountCreatedName;
	}

	public final Timestamp getAccountCreatedDate() {
		return accountCreatedDate;
	}

	public final void setAccountCreatedDate(Timestamp accountCreatedDate) {
		this.accountCreatedDate = accountCreatedDate;
	}

	public final String getAccountUpdatedName() {
		return accountUpdatedName;
	}

	public final void setAccountUpdatedName(String accountUpdatedName) {
		this.accountUpdatedName = accountUpdatedName;
	}

	public final Timestamp getAccountUpdatedDate() {
		return accountUpdatedDate;
	}

	public final void setAccountUpdatedDate(Timestamp accountUpdatedDate) {
		this.accountUpdatedDate = accountUpdatedDate;
	}

	/**
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [accountCreatedDate=" + accountCreatedDate + ", accountCreatedName=" + accountCreatedName
				+ ", accountDescription=" + accountDescription + ", accountId=" + accountId + ", accountName="
				+ accountName + ", accountPwd=" + accountPwd + ", accountUpdatedDate=" + accountUpdatedDate
				+ ", accountUpdatedName=" + accountUpdatedName + "]";
	}

}