package scb.dev.sms.sm.pojo;

import java.util.Date;

public class Account {
	/**
	 * 账户编号
	 */
	private String accountId;

	/**
	 * 账户名称
	 */
	private String accountName;

	/**
	 * 账户密码
	 */
	private String accountPassword;

	/**
	 * 修改人名
	 */
	private String accountUpdatedUser;

	/**
	 * 修改时间
	 */
	private Date accountUpdatedTime;

	/**
	 * 账户编号
	 * 
	 * @return account_id 账户编号
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * 账户编号
	 * 
	 * @param accountId 账户编号
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * 账户名称
	 * 
	 * @return account_name 账户名称
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * 账户名称
	 * 
	 * @param accountName 账户名称
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * 账户密码
	 * 
	 * @return account_password 账户密码
	 */
	public String getAccountPassword() {
		return accountPassword;
	}

	/**
	 * 账户密码
	 * 
	 * @param accountPassword 账户密码
	 */
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	/**
	 * 修改人名
	 * 
	 * @return account_updated_user 修改人名
	 */
	public String getAccountUpdatedUser() {
		return accountUpdatedUser;
	}

	/**
	 * 修改人名
	 * 
	 * @param accountUpdatedUser 修改人名
	 */
	public void setAccountUpdatedUser(String accountUpdatedUser) {
		this.accountUpdatedUser = accountUpdatedUser;
	}

	/**
	 * 修改时间
	 * 
	 * @return account_updated_time 修改时间
	 */
	public Date getAccountUpdatedTime() {
		return accountUpdatedTime;
	}

	/**
	 * 修改时间
	 * 
	 * @param accountUpdatedTime 修改时间
	 */
	public void setAccountUpdatedTime(Date accountUpdatedTime) {
		this.accountUpdatedTime = accountUpdatedTime;
	}

	/**
	 * 
	 * Creates a new instance of Account.
	 *
	 */
	public Account() {
		super();
	}

	/**
	 * Creates a new instance of Account.
	 *
	 * @param accountId
	 * @param accountName
	 * @param accountPassword
	 */
	public Account(String accountId, String accountName, String accountPassword) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountPassword = accountPassword;
	}

	/**
	 * Creates a new instance of Account.
	 *
	 * @param accountId
	 * @param accountName
	 * @param accountPassword
	 * @param accountUpdatedUser
	 * @param accountUpdatedTime
	 */

	public Account(String accountId, String accountName, String accountPassword, String accountUpdatedUser,
			Date accountUpdatedTime) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountPassword = accountPassword;
		this.accountUpdatedUser = accountUpdatedUser;
		this.accountUpdatedTime = accountUpdatedTime;
	}

}