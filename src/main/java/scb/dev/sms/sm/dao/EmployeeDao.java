package scb.dev.sms.sm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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

    int deleteByEmployeeId(String employeeId);

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
    Employee selectByEmployeeId(String employeeId);
    
    /**
     *根据员工编号查询员工
     *@param employeeId 员工编号
     *@return 查到的员工对象
     * @mbg.generated 2018-11-14
     */
    Employee selectByEmployeeIdWithAddAndCon(String employeeId);
    
    /**
     *根据员工姓名查询员工
     *@param employeeName 员工姓名
     *@return 查到的员工对象集合
     * @mbg.generated 2018-11-14
     */
    List<Employee> selectByEmployeeName(String employeeName);
    
    /**
     *根据员工姓名查询员工
     *@param employeeName 员工姓名
     *@return 查到的员工对象集合
     * @mbg.generated 2018-11-14
     */
    List<Employee> selectByEmployeeNameWithAddAndCon(String employeeName);

    /**
     *根据员工工号查询员工
     *@param employeeWorkId 员工工号
     *@return 查到的员工对象
     * @mbg.generated 2018-11-14
     */
    Employee selectByEmployeeWorkId(String employeeWorkId);
    
    /**
     *根据员工工号查询员工
     *@param employeeWorkId 员工工号
     *@return 查到的员工对象
     * @mbg.generated 2018-11-14
     */
    Employee selectByEmployeeWorkIdWithAddAndCon(String employeeWorkId);
    
    /**
     *根据员工昵称查询员工
     *@param employeeNickname 员工昵称
     *@return 查到的员工对象集合
     * @mbg.generated 2018-11-14
     */
    List<Employee> selectByEmployeeNickname(String employeeNickname);

    /**
     *根据员工职位编号查询员工
     *@param employeePositionId 员工职位编号
     *@return 查到的员工对象集合
     * @mbg.generated 2018-11-14
     */
    List<Employee> selectByEmployeePositionId(String employeePositionId);
    
    /**
     *根据员工职位编号查询员工
     *@param employeePositionId 员工职位编号
     *@return 查到的员工对象集合
     * @mbg.generated 2018-11-14
     */
    List<Employee> selectByEmployeePositionIdWithAddAndCon(String employeePositionId);

    /**
     *根据员工部门编号查询员工
     *@param employeeDepartmentId 员工部门编号
     *@return 查到的员工对象集合
     * @mbg.generated 2018-11-14
     */
    List<Employee> selectByEmployeeDepartmentId(String employeeDepartmentId);
    
    /**
     *根据员工部门编号查询员工
     *@param employeeDepartmentId 员工部门编号
     *@return 查到的员工对象集合
     * @mbg.generated 2018-11-14
     */
    List<Employee> selectByEmployeeDepartmentIdWithAddAndCon(String employeeDepartmentId);

    /**
     *根据员工状态查询员工
     *@param employeeStatus 员工状态
     *@return 查到的员工对象集合
     * @mbg.generated 2018-11-14
     */
    List<Employee> selectByEmployeeStatus(String employeeStatus);
    
    /**
     *根据员工状态查询员工
     *@param employeeStatus 员工状态
     *@return 查到的员工对象集合
     * @mbg.generated 2018-11-14
     */
    List<Employee> selectByEmployeeStatusWithAddAndCon(String employeeStatus);

    /**
     *根据员工公司查询员工
     *@param employeeCompany 员工公司
     *@return 查到的员工对象集合
     * @mbg.generated 2018-11-14
     */
    List<Employee> selectByEmployeeCompany(String employeeCompany);

    /**
     *查询所有员工
     *@return 查到的员工对象集合
     * @mbg.generated 2018-11-14
     */
    List<Employee> selectAllEmployee();
    
    /**
     * 查询所有员工，包含员工地址和联系方式
     *@return 查到的员工对象集合
     * @mbg.generated 2018-11-14
     */
    List<Employee> selectAllEmployeeWithAddAndCon();
    
    
    /**
     *根据员工编号修改对象中指定字段
     *@param record 员工对象
     * @mbg.generated 2018-11-14
     */
    int updateByEmployeeIdSelective(Employee record);

    /**
     *根据员工编号修改记录中所有属性为对象中的属性值
     *@param record 员工对象
     * @mbg.generated 2018-11-14
     */
    int updateByEmployeeIdWithBLOBs(Employee record);

    /**
     *根据员工编号修改记录中除员工照片外所有属性为对象中的属性值
     *@param record 员工对象
     * @mbg.generated 2018-11-14
     */
    int updateByEmployeeId(Employee record);
    int deleteDepartmentInEmployee(@Param("employeeStatus")String employeeStatus,  @Param("departmentId")String departmentId);
}