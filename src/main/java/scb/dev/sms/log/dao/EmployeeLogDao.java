package scb.dev.sms.log.dao;

import java.util.List;

import scb.dev.sms.log.pojo.EmployeeLog;

public interface EmployeeLogDao {
    /**
     *
     * @mbg.generated 2018-11-15
     */
    int deleteByPrimaryKey(String logEmployeeId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insert(EmployeeLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int insertSelective(EmployeeLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    EmployeeLog selectByPrimaryKey(String logEmployeeId);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKeySelective(EmployeeLog record);

    /**
     *
     * @mbg.generated 2018-11-15
     */
    int updateByPrimaryKey(EmployeeLog record);
    
    List<EmployeeLog> findAllEmployeeLog();
}