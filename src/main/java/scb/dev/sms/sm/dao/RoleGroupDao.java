package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.RoleGroup;

public interface RoleGroupDao {
    /**
     *
     * @mbg.generated 2018-11-20
     */
    int deleteByPrimaryKey(String rolegroupId);

    /**
     *
     * @mbg.generated 2018-11-20
     */
    int insert(RoleGroup record);

    /**
     *
     * @mbg.generated 2018-11-20
     */
    int insertSelective(RoleGroup record);

    /**
     *
     * @mbg.generated 2018-11-20
     */
    RoleGroup selectByPrimaryKey(String rolegroupId);

    /**
     *
     * @mbg.generated 2018-11-20
     */
    int updateByPrimaryKeySelective(RoleGroup record);

    /**
     *
     * @mbg.generated 2018-11-20
     */
    int updateByPrimaryKey(RoleGroup record);
}