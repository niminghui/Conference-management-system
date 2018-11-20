package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.Permission;

public interface PermissionDao {
    /**
     *
     * @mbg.generated 2018-11-20
     */
    int deleteByPrimaryKey(String permissionId);

    /**
     *
     * @mbg.generated 2018-11-20
     */
    int insert(Permission record);

    /**
     *
     * @mbg.generated 2018-11-20
     */
    int insertSelective(Permission record);

    /**
     *
     * @mbg.generated 2018-11-20
     */
    Permission selectByPrimaryKey(String permissionId);

    /**
     *
     * @mbg.generated 2018-11-20
     */
    int updateByPrimaryKeySelective(Permission record);

    /**
     *
     * @mbg.generated 2018-11-20
     */
    int updateByPrimaryKey(Permission record);
}