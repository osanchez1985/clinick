package com.clinic.clinicserver.allergy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping(method= RequestMethod.GET)
	public List<AllergiesDto> getAllergyes(){
		
		return allergiesAppService.getAllergies();
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/{allergyId}")
	public AllergiesDto getAllergybyId(@PathVariable long allergyId ){
		
		return allergiesAppService.getAllergyById(allergyId);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public AllergiesDto createAllergy(@RequestBody AllergiesDto allergydto ){
		
	return	allergiesAppService.createAllergy(allergydto);
	
	}

}
