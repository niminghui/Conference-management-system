package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.EmployeeAddress;

public interface EmployeeAddressMapper {
    /**
     *
     * @mbg.generated 2018-11-13
     */
    int deleteByPrimaryKey(String employeeId);

    /**
     *
     * @mbg.generated 2018-11-13
     */
    int insert(EmployeeAddress record);

    /**
     *
     * @mbg.generated 2018-11-13
     */
    int insertSelective(EmployeeAddress record);

    /**
     *
     * @mbg.generated 2018-11-13
     */
    EmployeeAddress selectByPrimaryKey(String employeeId);

    /**
     *
     * @mbg.generated 2018-11-13
     */
    int updateByPrimaryKeySelective(EmployeeAddress record);

    /**
     *
     * @mbg.generated 2018-11-13
     */
    int updateByPrimaryKey(EmployeeAddress record);
}