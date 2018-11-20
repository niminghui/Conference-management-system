package scb.dev.sms.sm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import scb.dev.sms.sm.pojo.Menu;
import scb.dev.sms.sm.service.IMenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {

	@Resource
	private IMenuService menuService;

	@PostMapping("/getMenu")
	public Menu getMenu(String menuId) {
		return menuService.queryMenu(menuId);
	}
	
	@PostMapping("/getAllMenu")
	public String getAllMenu(){
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
	
	
}
