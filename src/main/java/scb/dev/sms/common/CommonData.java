/**
 * Project Name:clps.sms
 * File Name:CommonData.java
 * Package Name:com.clps.dev.sms.common
 * Date:2018年10月31日下午1:10:01
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.common;

/**
 * ClassName: CommonData <br/>
 * Description: 公共数据类. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年10月31日 下午1:10:01 <br/>
 */
public interface CommonData {
	public static final String SUCCESS = "001";
	public static final String FAILURE = "002";

	public static final String SAVE_SUCCESS = "001-001";
	public static final String UPDATE_SUCCESS = "002-001";
	public static final String DELETE_SUCCESS = "003-001";
	public static final String QUERY_SUCCESS = "004-001";

	public static final String SAVE_FAILURE = "001-002";
	public static final String UPDATE_FAILURE = "002-002";
	public static final String DELETE_FAILURE = "003-002";
	public static final String QUERY_FAILURE = "004-002";

	// status参数 0：未激活 1：已激活 2：离职 3：部门解散待业
	public static final String STATUS_UNUSED = "000";
	public static final String STATUS_INUSED = "001";
	public static final String STATUS_LEAVE_OFFICE = "002";
	public static final String STATUS_DISSOLVE = "003";

	public static final String DEPARTMENT_PID = "1";

	public static final String STRING_SUCCESS = "success";
	public static final String STRING_FAILURE = "failure";

	public static final String STRING_ACCOUNT_NOTFOUND = "Account is't found.";
	public static final String STRING_ACCOUNT_EXIST = "Account already exist.";
	public static final String STRING_ACCOUNT_NOTACTIVATED = "Account not activated.";

	// 职员已离职
	public static final String STRING_HASLEFT = "Employee has left.";

	public static final String STRING_YZMERROR = "Verification code error.";
}
