package in.jt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.jt.request.binding.CitizenData;
import in.jt.service.CitizenDataService;

@RestController
public class CitizenDataRestController {

	@Autowired
	private CitizenDataService service;
	
	@PostMapping(value = "/citizenData", consumes = "application/json")
	public String saveCitizenData(@RequestBody CitizenData cd) {
		return service.confirmSaveInfo(cd);
	}
}
