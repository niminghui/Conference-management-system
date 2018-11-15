package scb.dev.sms.log.dao;

import scb.dev.sms.log.pojo.AccountLog;

public interface AccountLogDao {
    /**
     *
     * @mbg.generated 2018-11-15
     */
    int deleteByPrimaryKey(String logAccountId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insert(AccountLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insertSelective(AccountLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    AccountLog selectByPrimaryKey(String logAccountId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKeySelective(AccountLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKey(AccountLog record);
}