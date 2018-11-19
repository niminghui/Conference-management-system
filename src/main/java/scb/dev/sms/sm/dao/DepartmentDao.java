package scb.dev.sms.sm.dao;



import java.util.List;



import scb.dev.sms.sm.pojo.Department;

public interface DepartmentDao {
	/**
	 * Description:根据departmentId删除department
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int deleteByPrimaryKey(String departmentId);
    /**
	 * Description:插入department
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int insert(Department record);

    /**
	 * Description:插入department部分数据
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int insertSelective(Department record);

    /**
	 * Description:根据id查询department
	 * 
	 * @mbg.generated 2018-11-15
	 */
    Department selectByPrimaryKey(String departmentId);

    /**
	 * Description:根据id更新部分department
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKeySelective(Department record);

    /**
	 * Description:根据id更新department
	 * 
	 * @mbg.generated 2018-11-15
	 */
    int updateByPrimaryKey(Department record);
    /**
	 * Description:查找父id是。。。的部门信息
	 * 返回部门id和名称
	 * 
	 * @mbg.generated 2018-11-15
	 */
    List<Department> selectSubClassByDepartmentId(String departmentId);
    /**
   	 * Description:查找所有部门信息
   	 * 
   	 * @mbg.generated 2018-11-15
   	 */
    List<Department> selectAllDepartment();
    /**
   	 * Description:查找所有部门信息,树形结构返回
   	 * 
   	 * @mbg.generated 2018-11-15
   	 */
    List<Department> selectTreeDepartment();
    
    Department findOneDepartmentById(String departmentId);
    
    Department findOneDepartmentByAbbrev(String departmentAbbreviation);
    //查找一个新的部门的父部门是否存在
    int selectCountByPid(String departmentPid);
}