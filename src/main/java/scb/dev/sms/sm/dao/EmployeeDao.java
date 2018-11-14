package scb.dev.sms.sm.dao;

import scb.dev.sms.sm.pojo.Employee;

/**
 * 
 * ClassName: EmployeeDao <br/>
 * Description: 员工实体层. <br/><br/>
 * date: 2018年11月14日 下午3:07:29 <br/>
 *
 * @author ryan。li
 * @version V1.0
 * @since JDK 1.8
 */
public interface EmployeeDao {
	/**
	 * 通过员工编号删除一个员工
	 * @param employeeId 员工编号
	 * @return 0：删除失败	1： 删除成功
	 * @mbg.generated  2018-11-13
	 */

    int deleteByPrimaryKey(String employeeId);

    /**
	 * 插入一个员工
	 * @param record 要插入的员工对象
	 * @return 0：插入失败	1： 插入成功
	 * @mbg.generated  2018-11-13
	 */
    int insert(Employee record);

    /**
	 * 根据员工对象写入的字段插入一个员工
	 * @param record 要插入的员工对象
	 * @return 0：插入失败	1： 插入成功
	 * @mbg.generated  2018-11-13
	 */
    int insertSelective(Employee record);

    /**
     *根据员工编号查询员工
     *@param employeeId 员工编号
     *@return 查到的员工对象
     * @mbg.generated 2018-11-14
     */
    Employee selectByPrimaryKey(String employeeId);

    /**
     *根据员工编号修改对象中指定字段
     *@param record 员工对象
     * @mbg.generated 2018-11-14
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     *根据员工编号修改记录中所有属性为对象中的属性值
     *@param record 员工对象
     * @mbg.generated 2018-11-14
     */
    int updateByPrimaryKeyWithBLOBs(Employee record);

    /**
     *根据员工编号修改记录中除员工照片外所有属性为对象中的属性值
     *@param record 员工对象
     * @mbg.generated 2018-11-14
     */
    int updateByPrimaryKey(Employee record);
}