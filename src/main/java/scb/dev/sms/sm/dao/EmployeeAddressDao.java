package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.EmployeeAddress;

public interface EmployeeAddressDao {
    /**
     *
     * @mbg.generated 2018-11-14
     */
    int deleteByPrimaryKey(String employeeId);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    int insert(EmployeeAddress record);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    int insertSelective(EmployeeAddress record);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    EmployeeAddress selectByPrimaryKey(String employeeId);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    int updateByPrimaryKeySelective(EmployeeAddress record);

    /**
     *
     * @mbg.generated 2018-11-14
     */
    int updateByPrimaryKey(EmployeeAddress record);
}