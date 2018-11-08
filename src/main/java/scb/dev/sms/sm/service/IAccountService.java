/**
 * Project Name:clps.sms
 * File Name:IAccountService.java
 * Package Name:com.clps.dev.sms.sm.service
 * Date:2018年11月1日下午2:23:05
 * Copyright (c) 2018, Minghui.Ni@sc.com All Rights Reserved.
 *
 */
package scb.dev.sms.sm.service;

import java.util.List;

import scb.dev.sms.sm.pojo.Account;
import scb.dev.sms.sm.vo.AccountVO;

/**
 * ClassName: IAccountService <br/>
 * Description: IAccountService. <br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月1日 下午2:23:05 <br/>
 */
public interface IAccountService {
	public String addAccount(Account account);

	public List<AccountVO> queryAllAccountVO();
}
