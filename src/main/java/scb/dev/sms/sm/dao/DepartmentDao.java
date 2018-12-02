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
    /**
   	 * Description:通过id查找部门信息
   	 * 
   	 * @mbg.generated 2018-11-15
   	 */
    Department findOneDepartmentById(String departmentId);
    /**
   	 * Description:查找部门信息通过简称
   	 * 
   	 * @mbg.generated 2018-11-15
   	 */
    Department findOneDepartmentByAbbrev(String departmentAbbreviation);
    //查找一个新的部门的父部门是否存在
    int selectCountByPid(String departmentPid);
    //查找一个新的部门的缩写是否存在冲突
    int selectCountByAbbrev(String departmentAbbreviation);
    //查找一个新的部门的名字是否存在冲突
    int selectCountByName(String departmentName);
    /**
   	 * Description:查找所有部门信息
   	 * 
   	 * @mbg.generated 2018-11-15
   	 */
    Department findOneDepartmentByName(String departmentName);
    /**
   	 * Description:查找一个部门的子部门信息
   	 * 
   	 * @mbg.generated 2018-11-15
   	 */
    List<Department> selectSubDep(String departmentId);
    /**
   	 * Description:查找部门的部门id和名字信息
   	 * 
   	 * @mbg.generated 2018-11-15
   	 */
    List<Department> findDepartmentNamesAndId();
    //查找一个部门以及所有子部门信息
    List<Department> selectIdAndSubId(String departmentId);
}