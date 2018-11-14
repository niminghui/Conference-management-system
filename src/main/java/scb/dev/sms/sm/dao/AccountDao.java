package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.Account;

/**
 * 
 * ClassName: AccountDao <br/>
 * Description: AccountDao. <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年11月14日 下午3:21:36 <br/>
 */
public interface AccountDao {
	/**
	 * Description:根据AccountID删除Account
	 * 
	 * @mbg.generated 2018-11-14
	 */
	int deleteByAccountId(String accountId);

	/**
	 * Description:插入Account数据
	 * 
	 * @mbg.generated 2018-11-14
	 */
	int insert(Account record);

	/**
	 * Description:插入Account部分数据
	 * 
	 * @mbg.generated 2018-11-14
	 */
	int insertSelective(Account record);

	/**
	 * Description:根据AccountID查找Account
	 * 
	 * @mbg.generated 2018-11-14
	 */
	Account selectByAccountId(String accountId);

	/**
	 * Description:根据AccountName查找Account
	 * 
	 * @mbg.generated 2018-11-14
	 */
	Account selectByAccountName(String accountName);

	/**
	 * Description:根据AccountName查找AccountID
	 * 
	 * @mbg.generated 2018-11-14
	 */
	String selectAccountIdByAccountName(String accountName);

	/**
	 * Description:选择性根据AccountID更新Account
	 * 
	 * @mbg.generated 2018-11-14
	 */
	int updateByAccountIdSelective(Account record);

	/**
	 * Description:根据AccountID更新Account
	 * 
	 * @mbg.generated 2018-11-14
	 */
	int updateByAccountId(Account record);
}