/**
 * Project Name:clps.sms
 * File Name:AccountController.java
 * Package Name:com.clps.dev.sms.sm.controller
 * Date:2018年10月31日下午2:11:13
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: AccountController <br/>
 * Description: TODO ADD REASON(可选). <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年10月31日 下午2:11:13 <br/>
 */
@Controller
@RequestMapping("/account")
public class AccountController {
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
