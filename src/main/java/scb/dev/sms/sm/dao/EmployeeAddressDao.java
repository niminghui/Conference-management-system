package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.EmployeeAddress;
/**
 * 
 * ClassName: EmployeeAddressDao <br/>
 * Description: 员工地址实体层. <br/><br/>
 * date: 2018年11月14日 下午4:32:26 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
public interface EmployeeAddressDao {
	/**
	 * 通过员工编号删除一个员工地址
	 * @param employeeId 员工编号
	 * @return 0：删除失败	1： 删除成功
	 * @mbg.generated  2018-11-13
	 */
    int deleteByPrimaryKey(String employeeId);

    /**
	 * 插入一个员工地址
	 * @param record 要插入的员工地址对象
	 * @return 0：插入失败	1： 插入成功
	 * @mbg.generated  2018-11-13
	 */
    int insert(EmployeeAddress record);

    /**
	 * 根据员工对象写入的字段插入一个员工地址
	 * @param record 要插入的员工地址对象
	 * @return 0：插入失败	1： 插入成功
	 * @mbg.generated  2018-11-13
	 */
    int insertSelective(EmployeeAddress record);

    /**
     *根据员工编号查询员工地址
     *@param employeeId 员工编号
     *@return 查到的员工地址对象
     * @mbg.generated 2018-11-14
     */
    EmployeeAddress selectByPrimaryKey(String employeeId);

    /**
     *根据员工编号修改对象中指定字段
     *@param record 员工地址对象
     * @mbg.generated 2018-11-14
     */
    int updateByPrimaryKeySelective(EmployeeAddress record);

    /**
     *根据员工编号修改记录中所有属性为对象中的属性值
     *@param record 员工地址对象
     * @mbg.generated 2018-11-14
     */
    int updateByPrimaryKey(EmployeeAddress record);
}