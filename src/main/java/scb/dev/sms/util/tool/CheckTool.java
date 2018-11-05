/**
 * Project Name:clps.sms
 * File Name:EmailTool.java
 * Package Name:com.clps.dev.sms.util.tool
 * Date:2018年11月1日下午2:17:03
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.util.tool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import scb.dev.sms.common.CommonEmailType;

/**
 * ClassName: EmailTool <br/>
 * Description: TODO ADD REASON(可选). <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月1日 下午2:17:03 <br/>
 */
public class CheckTool {
	public static String checkEmail(String email) {
		String emailType = "";
		String emailPermission = "";
		String regEx1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		Pattern pattern;
		Matcher matcher;
		pattern = Pattern.compile(regEx1);
		matcher = pattern.matcher(email);
		if (matcher.matches()) {
			if (email.contains("clpsglobal.com")) {
				emailType = CommonEmailType.CLPS_EMAIL;
				emailPermission = CommonEmailType.EMAIL_PERMISSION_SEND_AND_READ;
			} else if (email.contains("sc.com")) {
				emailType = CommonEmailType.SCB_EMAIL;
				emailPermission = CommonEmailType.EMAIL_PERMISSION_SEND;
			} else if (email.contains("qq.com")) {
				emailType = CommonEmailType.QQ_EMAIL;
				emailPermission = CommonEmailType.EMAIL_PERMISSION_READ;
			} else {
				emailType = CommonEmailType.OTHERS_EMAIL;
				emailPermission = CommonEmailType.EMAIL_PERMISSION_READ;
			}
		} else {
			emailType = CommonEmailType.NO_EMAIL;
			emailPermission = CommonEmailType.EMAIL_PERMISSION_NO;
		}
		return emailType + emailPermission;
	}

	public static boolean checkCLPSEmail(String email) {
		if (email.contains("@")) {
			String[] strings = email.split("@");
			if (strings[1].equals("clpsglobal.com")) {
				String reg = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]";
				Pattern pattern;
				Matcher matcher;
				pattern = Pattern.compile(reg);
				matcher = pattern.matcher(strings[0]);
				if (matcher.matches() && strings[0].length() >= 3 && strings[0].length() <= 16) {
					return true;
				}
			}
		}
		return false;
	}

	public static List<String> checkCLPSEmailsAndSort(List<String> emails) {
		List<String> checkEmails = new ArrayList<String>();
		for (String s : emails) {
			if (checkCLPSEmail(s)) {
				checkEmails.add(s);
			}
		}
		Collections.sort(checkEmails);
		return checkEmails;
	}
}
