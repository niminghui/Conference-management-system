package scb.dev.sms.sm.pojo;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Account {
	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column sm_account.account_id
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	private String accountId;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column sm_account.account_name
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	private String accountName;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column sm_account.account_password
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	private String accountPassword;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column sm_account.account_updated_user
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	private String accountUpdatedUser;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column sm_account.account_updated_time
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	private Date accountUpdatedTime;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column sm_account.employee_id
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	private String employeeId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column sm_account.account_id
	 *
	 * @return the value of sm_account.account_id
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column sm_account.account_id
	 *
	 * @param accountId the value for sm_account.account_id
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column sm_account.account_name
	 *
	 * @return the value of sm_account.account_name
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column sm_account.account_name
	 *
	 * @param accountName the value for sm_account.account_name
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column sm_account.account_password
	 *
	 * @return the value of sm_account.account_password
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	public String getAccountPassword() {
		return accountPassword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column sm_account.account_password
	 *
	 * @param accountPassword the value for sm_account.account_password
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column sm_account.account_updated_user
	 *
	 * @return the value of sm_account.account_updated_user
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	public String getAccountUpdatedUser() {
		return accountUpdatedUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column sm_account.account_updated_user
	 *
	 * @param accountUpdatedUser the value for sm_account.account_updated_user
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	public void setAccountUpdatedUser(String accountUpdatedUser) {
		this.accountUpdatedUser = accountUpdatedUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column sm_account.account_updated_time
	 *
	 * @return the value of sm_account.account_updated_time
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	public Date getAccountUpdatedTime() {
		return accountUpdatedTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column sm_account.account_updated_time
	 *
	 * @param accountUpdatedTime the value for sm_account.account_updated_time
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	public void setAccountUpdatedTime(Date accountUpdatedTime) {
		this.accountUpdatedTime = accountUpdatedTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column sm_account.employee_id
	 *
	 * @return the value of sm_account.employee_id
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column sm_account.employee_id
	 *
	 * @param employeeId the value for sm_account.employee_id
	 *
	 * @mbg.generated Tue Nov 13 15:44:44 CST 2018
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
}