package com.clinic.clinicserver.allergy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/allergies")
public class AllergiesController {
	private final AllergiesAppService allergiesAppService;
	
	@Autowired
	public AllergiesController(AllergiesAppService allergiesAppService) {
		super();
		this.allergiesAppService = allergiesAppService;
	}

	
	

}
