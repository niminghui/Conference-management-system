package scb.dev.sms.sm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import scb.dev.sms.sm.pojo.PositionGrant;
import scb.dev.sms.sm.service.IPositionGrantService;

/**
 * 
 * @author Weilei
 *
 */
@RequestMapping("/grant")
@Controller
public class PositionGrantController {

	@Resource
	private IPositionGrantService positionGrantService;

	@RequestMapping("/add")
	public String addGrant(PositionGrant record) {
		positionGrantService.addPositionGrant(record);
		return "add_result";
	}

	@RequestMapping("/update")
	public String update(PositionGrant record) {
		positionGrantService.updatePositionGrant(record);
		return "update_result";
	}

	@RequestMapping("/delete")
	public String delete(String pgPositionId,String pgMenuId) {
		positionGrantService.deletePositionGrantByPrimaryKey(pgPositionId, pgMenuId);
		return "delete_result";
	}

}
