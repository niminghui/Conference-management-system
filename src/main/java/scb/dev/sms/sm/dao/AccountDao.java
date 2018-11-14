package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.Account;

public interface AccountDao {
    /**
     *
     * @mbg.generated 2018-11-14
     */
    int deleteByPrimaryKey(String accountId);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    int insert(Account record);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    int insertSelective(Account record);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    Account selectByPrimaryKey(String accountId);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    int updateByPrimaryKey(Account record);
}