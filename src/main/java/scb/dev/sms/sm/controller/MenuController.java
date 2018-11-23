package scb.dev.sms.sm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import scb.dev.sms.sm.pojo.Menu;
import scb.dev.sms.sm.service.IMenuService;
import scb.dev.sms.sm.service.IPositionGrantService;
/**
 * 
 * @author Weilei
 *
 */
@Controller
@RequestMapping(value="/menu",produces="text/html;charset=utf-8")
public class MenuController {

	@Resource
	private IMenuService menuService;

	@Resource
	private IPositionGrantService positionGrantServie;

	/**
	 * 展示单条菜单信息
	 * @param menuId
	 * @return
	 */
	@RequestMapping("/getMenu")
	public Menu getMenu(String menuId) {
		return menuService.queryMenu(menuId);
	}

	/**
	 * 展示个人所能看到的菜单信息
	 * @param positionId
	 * @return
	 */
	@RequestMapping("/getOwnMenu")
	public String getOwnMenu(String positionId) {
		return JSON.toJSONString(positionGrantServie.getOwnMenu(positionId));
	}

	/**
	 * 不分权限的所有菜单
	 * @return
	 */
	@RequestMapping("/getAllMenu")
	public String getAllMenu(Model model) {
		model.addAttribute("menus",menuService);
		//return JSON.toJSONString(menuService.queryAllMenu());
		return "menu_list"; 
	}

	/**
	 * 添加菜单
	 * @param menuName
	 * @param menuParentId
	 * @param createUserName
	 * @return
	 */
	@RequestMapping("/addMenu")
	public String addMenu(String menuName, String menuParentId, String createUserName) {
		menuService.addMenu(menuName, menuParentId, createUserName);
		return "menu_addresult";
	}

	/**
	 * 修改菜单
	 * @param menuId
	 * @param menuName
	 * @param menuOrderId
	 * @param menuUrl
	 * @param updateUserName
	 * @return
	 */
	@RequestMapping("/updateMenu")
	public String updateMenu(String menuId, String menuName, String menuOrderId, String menuUrl,
			String updateUserName) {
		menuService.updateMenu(menuId, menuName, menuOrderId, menuUrl, updateUserName);
		return "menu_update";
	}
	
	@RequestMapping(value="/menuList",method=RequestMethod.GET)
	public String showMenu() {
		return "redirect:index.jsp";
	}
	
	
	

}
