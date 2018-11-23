
package scb.dev.sms.sm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import scb.dev.sms.sm.pojo.Permission;
import scb.dev.sms.sm.service.IPermissionService;
import scb.dev.sms.util.tool.PagingVO;



/**
 * 
	* @desc: clps.mms
	* @author: Harley.gu
	* @createTime: 2018年5月14日 上午9:45:05
	* @description: springmvc页面跳转
	* @version: v1.0
 */
@Controller
@RequestMapping(value="/sm")
public class PermissionController {
	

	@Resource
	private IPermissionService ipers;
	
	   @RequestMapping(value = "/permissionList")
	    public String showPermission(Model model, Integer page) throws Exception {

	        List<Permission> permissions = null;

	        PagingVO pagingVO = new PagingVO();


			pagingVO.setTotalCount(this.ipers.getCountPermission());
	        if (page == null || page == 0) {
	            pagingVO.setToPageNo(1);
	            permissions = this.ipers.findByPaging(pagingVO);
	        } else {
	            pagingVO.setToPageNo(page);
	            permissions = this.ipers.findByPaging(pagingVO);
	        }

	        model.addAttribute("permissions", permissions);
	        model.addAttribute("pagingVO", pagingVO);

	        return "sm/permission_list";
	    }
	
	@RequestMapping(value="/toAddPermission")
	public String toAddPermission(){
		return "sm/permission_add";
	}
	
	@RequestMapping(value="/addPermission")
	public String addPermission(Permission record,Model model){
		
		ipers.insertPermission(record);
		
		return "redirect:/sm/permissionList";
		
	}
	
	@RequestMapping(value="/delPermission",method=RequestMethod.GET)
	public String delPermission(int permissionId){
		
		ipers.deleteByPermissionId(permissionId);
		
		return "redirect:/sm/permissionList";
			
	}
	@RequestMapping(value="/toUpdatePermission",method=RequestMethod.GET)
	public String toUpdatePermission(int permissionId,Model model,HttpServletRequest request){
		request.setAttribute("permission",ipers.queryPermissionByPermissionId(permissionId));
		model.addAttribute("permission",ipers.queryPermissionByPermissionId(permissionId));
		return "sm/permission_update";
	}
	
	@RequestMapping(value="/updatePermission",method=RequestMethod.POST)
	public String updatePermission(Permission record,Model model,HttpServletRequest request){
		ipers.updatePermission(record);	
		record = ipers.queryPermissionByPermissionId(record.getPermissionId());
		request.setAttribute("permission", record);
		model.addAttribute("permission", record);
		return "redirect:/sm/permissionList";
	}	
	@RequestMapping(value="/queryPermissionByName")
	public String queryPermissionByName(String permissionName,Model model){
		List<Permission> permissions = ipers.queryPermissionByName(permissionName);
		model.addAttribute("permissions", permissions);
		return "redirect:/sm/permissionList";
	}
	
	
}
