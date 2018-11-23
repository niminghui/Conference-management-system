/**   
* @Title: IPermission.java 
* @Package com.clps.mms.sm.service.impl 
* @Description: 
* @author gzf   
* @date 2018年5月7日 上午9:29:14 
* @version V1.0   
*/
package scb.dev.sms.sm.service.imp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scb.dev.sms.common.SupportConstant;

import scb.dev.sms.sm.dao.PermissionDao;
import scb.dev.sms.sm.pojo.Permission;
import scb.dev.sms.sm.service.IPermissionService;
import scb.dev.sms.util.tool.PagingVO;







@Service("permissionService")
public class PermissionServiceImpl implements IPermissionService{
	
	@Autowired
    private PermissionDao permissionDao;
	/* 
	*  
	*  
	* @return 
	* @see com.clps.mms.sm.service.IPermission#queryAllPermission() 
	*/

	public List<Permission> queryAllPermission() {
		
		return permissionDao.queryAllPermission();
	
	}
	/* 
	*  
	*  
	* @param record
	* @return 
	* @see com.clps.mms.sm.service.IPermissionService#insertPermission(com.clps.mms.sm.pojo.Permission) 
	*/

	public String insertPermission(Permission record) {
		
		if(permissionDao.insertPermission(record)>0){
			return SupportConstant.ADD_SUCCESS;
		}
		return SupportConstant.ADD_FAILURE;
	}
	/* 
	*  
	*  
	* @param permissionId
	* @return 
	* @see com.clps.mms.sm.service.IPermissionService#deleteByPermissionId(java.lang.Integer) 
	*/

	public String deleteByPermissionId(Integer permissionId) {
		if(permissionDao.deleteByPermissionId(permissionId)>0){
			return SupportConstant.DELETE_SUCESS;
		}
		return SupportConstant.DELETE_FAILURE;
	}
	/* 
	*  
	*  
	* @param record
	* @return 
	* @see com.clps.mms.sm.service.IPermissionService#updatePermission(com.clps.mms.sm.pojo.Permission) 
	*/

	public String updatePermission(Permission record) {
		
		if(permissionDao.updatePermission(record)>0){
			return SupportConstant.UPDATE_SUCESS;
		}
		return SupportConstant.UPDATE_FAILURE;
	}
	/* 
	*  
	*  
	* @param permissionId
	* @return 
	* @see com.clps.mms.sm.service.IPermissionService#queryPermissionByPermissionId(java.lang.Integer) 
	*/

	public Permission queryPermissionByPermissionId(Integer permissionId) {
		return permissionDao.queryPermissionByPermissionId(permissionId);
	
	}
	/* 
	*  
	*  
	* @param permissionRecipient
	* @return 
	* @see com.clps.mms.sm.service.IPermissionService#queryPermissionByName(java.lang.String) 
	*/

	public List<Permission> queryPermissionByName(String permissionName) {
		
		return permissionDao.queryPermissionByName(permissionName);
	}

	
	public int getCountPermission() {
		int count = this.permissionDao.getCountPermission();
		return count;
	}


	public List<Permission> findByPaging(PagingVO pagingVO) throws Exception {
      List<Permission> permissions = this.permissionDao.findByPaging(pagingVO);
		return permissions;
	}

}
