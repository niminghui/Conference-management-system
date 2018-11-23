
package scb.dev.sms.sm.service;


import java.util.List;

import scb.dev.sms.sm.pojo.Permission;

import scb.dev.sms.util.tool.PagingVO;






/**
 * 
	* @desc: clps.mms

	* @createTime: 2018年5月14日 上午10:06:08
	* @version: v1.0
 */
public interface IPermissionService {
	
	/** 
	* @Title: queryAllPermission 
	* @Description: 查询所有权限内容
	* @param @return 
	* @return List<Permission> 
	* @throws 
	*/
	List<Permission> queryAllPermission();
	
	/** 
	* @Title: queryPermissionByPermissionId 
	* @Description: 通过权限Id查询
	* @param @param permissionId
	* @param @return 
	* @return Permission 
	* @throws 
	*/
	Permission queryPermissionByPermissionId(Integer permissionId);
	
	/** 
	* @Title: insertPermission 
	* @Description: 查询权限
	* @param @param record
	* @param @return 
	* @return int 
	* @throws 
	*/
	String insertPermission(Permission record);
	
	
	/** 
	* @Title: deleteByPermissionId 
	* @Description: 通过权限id删除
	* @param @param permissionId
	* @param @return 
	* @return int 
	* @throws 
	*/
	String deleteByPermissionId(Integer permissionId);



	
	/** 
	* @Title: updatePermission 
	* @Description: 修改权限
	* @param @param record
	* @param @return 
	* @return int 
	* @throws 
	*/
	String updatePermission(Permission record);

	/** 
	* @Title: queryPermissionByName 
	* @Description: 通过权限名称查询
	* @param @param permissionRecipient
	* @param @return 
	* @return List<Permission> 
	* @throws 
	*/
	List<Permission> queryPermissionByName(String permissionName);
	



    int getCountPermission();
    
    
    
    
    List<Permission> findByPaging(PagingVO pagingVO) throws Exception;

	

}
