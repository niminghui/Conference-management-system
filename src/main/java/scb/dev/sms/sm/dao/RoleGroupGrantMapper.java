package scb.dev.sms.sm.dao;

import org.apache.ibatis.annotations.Param;
import scb.dev.sms.sm.pojo.RoleGroupGrant;

public interface RoleGroupGrantMapper {
    /**
     *
     * @mbg.generated 2018-11-14
     */
    int deleteByPrimaryKey(@Param("rgRolegroupId") String rgRolegroupId, @Param("rgMenuId") String rgMenuId);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    int insert(RoleGroupGrant record);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    int insertSelective(RoleGroupGrant record);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    RoleGroupGrant selectByPrimaryKey(@Param("rgRolegroupId") String rgRolegroupId, @Param("rgMenuId") String rgMenuId);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    int updateByPrimaryKeySelective(RoleGroupGrant record);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    int updateByPrimaryKey(RoleGroupGrant record);
}