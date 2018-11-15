package scb.dev.sms.log.dao;

import scb.dev.sms.log.pojo.DepartmentLog;

public interface DepartmentLogDao {
    /**
     *
     * @mbg.generated 2018-11-15
     */
    int deleteByPrimaryKey(String logDepartmentId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insert(DepartmentLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insertSelective(DepartmentLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    DepartmentLog selectByPrimaryKey(String logDepartmentId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKeySelective(DepartmentLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKey(DepartmentLog record);
}