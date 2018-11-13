package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.EmployeeContactInfo;

public interface EmployeeContactInfoMapper {
    /**
     *
     * @mbg.generated 2018-11-13
     */
    int deleteByPrimaryKey(String employeeId);

    /**
     *
     * @mbg.generated 2018-11-13
     */
    int insert(EmployeeContactInfo record);

    /**
     *
     * @mbg.generated 2018-11-13
     */
    int insertSelective(EmployeeContactInfo record);

    /**
     *
     * @mbg.generated 2018-11-13
     */
    EmployeeContactInfo selectByPrimaryKey(String employeeId);

    /**
     *
     * @mbg.generated 2018-11-13
     */
    int updateByPrimaryKeySelective(EmployeeContactInfo record);

    /**
     *
     * @mbg.generated 2018-11-13
     */
    int updateByPrimaryKey(EmployeeContactInfo record);
}