package scb.dev.sms.sm.dao;

import java.util.List;

import scb.dev.sms.sm.pojo.Permission;
import scb.dev.sms.util.tool.PagingVO;


/**
 * 
	* @desc: clps.mms
	* @author: Harley.gu
	* @createTime: 2018年5月14日 上午9:43:45
	* @description:接口设置
	* @history:
	* @version: v1.0
 */
public interface PermissionDao {
	/**
	 * 
	 * @Title: deleteByPermissionId 
	 * @Description: 通过权限Id删除
	 * @param @param permissionId
	 * @param @return 
	 * @return int 
	 * @throws
	 */
    int deleteByPermissionId(Integer permissionId);
    /**
     * 
     * @Title: queryPermissionByPermissionId 
     * @Description: 通过权限Id查询
     * @param @param permissionId
     * @param @return 
     * @return Permission 
     * @throws
     */
    Permission queryPermissionByPermissionId(Integer permissionId);
   /**
    * @Title: queryAllPermission 
    * @Description: 查询所有权限
    * @param @return 
    * @return List<Permission> 
    * @throws
    */
	List<Permission> queryAllPermission();
   /**
    * 
    * @Title: queryPermissionByName 
    * @Description: 通过名称查询
    * @param @param permissionRecipient
    * @param @return 
    * @return List<Permission> 
    * @throws
    */
	List<Permission> queryPermissionByName(String permissionName);
   /**
    * 
    * @Title: insertPermission 
    * @Description: 查询权限
    * @param @param record
    * @param @return 
    * @return int 
    * @throws
    */
	int insertPermission(Permission record);
   /**
    * 
    * @Title: updatePermission 
    * @Description: 修改权限
    * @param @param record
    * @param @return 
    * @return int 
    * @throws
    */
	int updatePermission(Permission record);
	
	List<Permission> findByPaging(PagingVO pagingVO) throws Exception;
	
	int getCountPermission();
}