package scb.dev.sms.sm.controller;

import javax.annotation.Resource;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
