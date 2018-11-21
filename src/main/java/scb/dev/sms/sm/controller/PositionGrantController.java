package scb.dev.sms.sm.controller;

import javax.annotation.Resource;

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
@RestController
public class PositionGrantController {

	@Resource
	private IPositionGrantService positionGrantService;

	@PostMapping("/add")
	public Boolean addGrant(PositionGrant record) {
		return positionGrantService.addPositionGrant(record);
	}

	@PostMapping("/update")
	public Boolean update(PositionGrant record) {
		return positionGrantService.updatePositionGrant(record);
	}

	@PostMapping("/delete")
	public Boolean delete(String pgPositionId,String pgMenuId) {
		return positionGrantService.deletePositionGrantByPrimaryKey(pgPositionId, pgMenuId);
	}

}
