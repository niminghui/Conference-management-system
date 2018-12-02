package scb.dev.sms.sm.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import scb.dev.sms.common.CommonData;
import scb.dev.sms.sm.pojo.Position;
import scb.dev.sms.sm.service.IPositionService;
import scb.dev.sms.util.tool.PagingVO;

/**
 * 
 * @ClassName:  PositionController   
 * @Description:职位信息Controller层操作   
 * @author: Steven.Lee 
 * @date:   2018年11月18日 下午8:08:33   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved.
 */
@Controller
@RequestMapping(value="/sms")
public class PositionController {

	@Resource
	private IPositionService positionService;
	
	Logger logger=Logger.getLogger(PositionController.class);
	List<Position> positions=null;
	//页码对象
	PagingVO pagingVO=new PagingVO();
	
	/**
	 * 
	 * @Title: showPosition   
	 * @Description: 点击查询标签，跳转到position_list.jsp查询界面   
	 * @param: @param model
	 * @param: @param page
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/positionList", method = RequestMethod.GET)
	public String showPosition(Model model,Integer page) {
		//设置总页数
		pagingVO.setTotalCount(this.positionService.getCountPosition());
        if (page == null || page == 0) {
            pagingVO.setToPageNo(1);
            System.out.println("*****************");
            positions = this.positionService.findByPaging(pagingVO);
        } else {
            pagingVO.setToPageNo(page);//设置要前往的页码
            positions = this.positionService.findByPaging(pagingVO);
        }
        if(null!=positions){
        model.addAttribute("positions", positions);
        model.addAttribute("pagingVO", pagingVO);
        }
        else{
        	logger.error(CommonData.QUERY_FAILURE);	
        }

        return "position_list";

	}

	/**
	 * 
	 * @Title: delUser   
	 * @Description: 点击删除标签，之后返回position_list.jsp查询界面
	 * @param: @param request
	 * @param: @param model
	 * @param: @param page
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/positionDelete", method = RequestMethod.GET)
	public String delUser(HttpServletRequest request, Model model,Integer page) {

		String positionid = request.getParameter("positionid");
		logger.info(positionService.removePosition(positionid));
		//设置总页数
		pagingVO.setTotalCount(this.positionService.getCountPosition());
        if (page == null || page == 0) {
            pagingVO.setToPageNo(1);
            positions = this.positionService.findByPaging(pagingVO);
        } else {
            pagingVO.setToPageNo(page);
            positions = this.positionService.findByPaging(pagingVO);
        }
		
		if(null!=positions){
			model.addAttribute("positions", positions);
			model.addAttribute("pagingVO", pagingVO);
			logger.info(CommonData.QUERY_SUCCESS);
		}
		else
			logger.error(CommonData.QUERY_FAILURE);

		return "sms/position_list";
	}

	/**
	 * 
	 * @Title: addPosition   
	 * @Description: 点击添加职位标签，跳转到position_add.jsp添加界面  
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/positionAdd", method = RequestMethod.GET)
	public String addPosition() {
		return "sms/position_add";
	}

	/**
	 * 
	 * @Title: createPosition   
	 * @Description: 提交添加的form表单，跳转到position_list.jsp查询界面
	 * @param: @param model
	 * @param: @param position
	 * @param: @param page
	 * @param: @param request
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/positionCreate", method = RequestMethod.POST)
	public String createPosition(Model model,Position position,Integer page,HttpServletRequest request) {
		if(null!=position){
			//设置职位创建人
			position.setPositionCreatedUser((String)request.getSession().getAttribute("account"));
			//设置职位更改人
			position.setPositionUpdatedUser(position.getPositionCreatedUser());
			//设置新增时间
			position.setPositionCreatedTime((new Timestamp(new Date().getTime())));
			logger.info(positionService.insertPosition(position));
			//设置总页数
			pagingVO.setTotalCount(this.positionService.getCountPosition());
	        if (page == null || page == 0) {
	            pagingVO.setToPageNo(1);
	            positions = this.positionService.findByPaging(pagingVO);
	        } else {
	            pagingVO.setToPageNo(page);
	            positions = this.positionService.findByPaging(pagingVO);
	        }
			if(null!=positions){
				logger.info(CommonData.QUERY_SUCCESS);
			    model.addAttribute("positions", positions);
			    model.addAttribute("pagingVO", pagingVO);
			    return "sms/position_list";
			}
			else{
				logger.error(CommonData.QUERY_FAILURE);
				return "sms/position_list";
			}
		}
		else{
			logger.error(CommonData.SAVE_FAILURE);
			return "sms/position_list";
		}
		
	}

	/**
	 * 
	 * @Title: update   
	 * @Description: 点击修改标签，跳转到position_edit.jsp编辑界面   
	 * @param: @param request
	 * @param: @param model
	 * @param: @param page
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/positionUpdate", method = RequestMethod.GET)
	public String update(HttpServletRequest request, Model model,Integer page) {
		int positionid = Integer.parseInt(request.getParameter("positionid"));
		Position position = positionService.queryPositionById(positionid);
		if(null!=position){
			model.addAttribute("position", position);
			model.addAttribute("page",page);
			logger.info(CommonData.QUERY_SUCCESS);
		}
		else{
			logger.error(CommonData.QUERY_FAILURE);
		}

		return "sms/position_edit";
	}

	/**
	 * 
	 * @Title: update1   
	 * @Description: 提交更新form表单，跳转到position_list.jsp查询界面
	 * @param: @param request
	 * @param: @param model
	 * @param: @param position
	 * @param: @param page
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/positionUpdate1", method = RequestMethod.POST)
	public String update1(HttpServletRequest request, Model model,Position position,Integer page) {
		int positionid = Integer.parseInt(request.getParameter("positionid"));
		Position position1 = positionService.queryPositionById(positionid);
		if(null!=position1){
			logger.info(CommonData.QUERY_SUCCESS);
			position1.setPositionName(position.getPositionName());
			//设置修改者
			position1.setPositionUpdatedUser((String)request.getSession().getAttribute("account"));
			position1.setRolegroupId(position.getRolegroupId());
			//设置修改时间
			position1.setPositionUpdatedTime(new Timestamp(new Date().getTime()));
			logger.info(positionService.modifyPositionInfo(position1));
			pagingVO.setTotalCount(this.positionService.getCountPosition());
	        if (page == null || page == 0){
	            pagingVO.setToPageNo(1);
	            positions = this.positionService.findByPaging(pagingVO);
	        } else {
	            pagingVO.setToPageNo(page);
	            positions = this.positionService.findByPaging(pagingVO);
	        }
			if(null!=positions){
				logger.info(CommonData.QUERY_SUCCESS);
				model.addAttribute("pagingVO", pagingVO);
				model.addAttribute("positions", positions);
				return "sms/position_list";
			}
			else{
				logger.error(CommonData.QUERY_FAILURE);
				return "sms/position_list";
			}
		}
		else{
			logger.error(CommonData.UPDATE_FAILURE);
			return "sms/position_list";
		}	
	}
	
	/**
	 * 
	 * @Title: select   
	 * @Description: 根据职位名称进行模糊查询,跳转到positionList界面
	 * @param: @param model
	 * @param: @param positionName
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping(value = "/positionSelect", method = RequestMethod.POST)
	public String select(Model model,String positionName) {
		positions=this.positionService.selectByPositionName(positionName);
		pagingVO.setTotalCount(1);
		pagingVO.setToPageNo(1);
		if(null!=positions){
			logger.info(CommonData.QUERY_SUCCESS);
			model.addAttribute("pagingVO", pagingVO);
			model.addAttribute("positions", positions);
			return "sms/position_list";
		}
		else{
			logger.error(CommonData.QUERY_FAILURE);
			return "sms/position_list";
		}
	}
}
