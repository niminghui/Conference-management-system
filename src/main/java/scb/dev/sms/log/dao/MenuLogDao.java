package scb.dev.sms.log.dao;

import scb.dev.sms.log.pojo.MenuLog;

public interface MenuLogDao {
    /**
     *
     * @mbg.generated 2018-11-15
     */
    int deleteByPrimaryKey(String logMenuId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insert(MenuLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insertSelective(MenuLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    MenuLog selectByPrimaryKey(String logMenuId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKeySelective(MenuLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKey(MenuLog record);
}