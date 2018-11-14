package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.EmployeeContactInfo;

public interface EmployeeContactInfoDao {
    /**
     *
     * @mbg.generated 2018-11-14
     */
    int deleteByPrimaryKey(String employeeId);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    int insert(EmployeeContactInfo record);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    int insertSelective(EmployeeContactInfo record);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    EmployeeContactInfo selectByPrimaryKey(String employeeId);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    int updateByPrimaryKeySelective(EmployeeContactInfo record);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    int updateByPrimaryKey(EmployeeContactInfo record);
}