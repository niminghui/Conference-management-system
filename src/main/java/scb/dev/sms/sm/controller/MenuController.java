package scb.dev.sms.sm.controller;

import java.util.List;

import javax.annotation.Resource;

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
@RestController
@RequestMapping(value="/menu",produces="text/html;charset=utf-8")
public class MenuController {

	@Resource
	private IMenuService menuService;

	@Resource
	private IPositionGrantService positionGrantServie;

	@PostMapping("/getMenu")
	public Menu getMenu(String menuId) {
		return menuService.queryMenu(menuId);
	}

	@PostMapping("/getOwnMenu")
	public String getOwnMenu(String positionId) {
		return JSON.toJSONString(positionGrantServie.getOwnMenu(positionId));
	}

	@PostMapping("/getAllMenu")
	public String getAllMenu() {
		return JSON.toJSONString(menuService.queryAllMenu());
	}

	@PostMapping("/addMenu")
	public String addMenu(String menuName, String menuParentId, String createUserName) {
		menuService.addMenu(menuName, menuParentId, createUserName);
		return "sm/menu_addresult";
	}

	@PostMapping("/updateMenu")
	public String updateMenu(String menuId, String menuName, String menuOrderId, String menuUrl,
			String updateUserName) {
		menuService.updateMenu(menuId, menuName, menuOrderId, menuUrl, updateUserName);
		return "";
	}
	
	@RequestMapping(value="/menuList",method=RequestMethod.GET)
	public String showMenu() {
		return "redirect:index.jsp";
	}
	
	
	

}
