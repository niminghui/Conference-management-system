package scb.dev.sms.sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RedirectController {

	@RequestMapping(value="/userIndex",method=RequestMethod.GET)
	public String showMenu() {
		return "user_index";
	}
	
	@RequestMapping(value="/map",method=RequestMethod.GET)
	public String showMap() {
		return "map";
	}
}
