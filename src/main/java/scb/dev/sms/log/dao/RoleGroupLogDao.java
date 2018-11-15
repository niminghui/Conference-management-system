package scb.dev.sms.log.dao;

import scb.dev.sms.log.pojo.RoleGroupLog;

public interface RoleGroupLogDao {
    /**
     *
     * @mbg.generated 2018-11-15
     */
    int deleteByPrimaryKey(String logRolegroupId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insert(RoleGroupLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insertSelective(RoleGroupLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    RoleGroupLog selectByPrimaryKey(String logRolegroupId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKeySelective(RoleGroupLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKey(RoleGroupLog record);
}