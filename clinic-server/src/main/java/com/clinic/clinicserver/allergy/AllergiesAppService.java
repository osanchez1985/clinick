package com.clinic.clinicserver.allergy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllergiesAppService {
	
	public AllergiesAppService(AllergiesRepository allergiesRepository) {
		super();
		this.allergiesRepository = allergiesRepository;
	}


	@Autowired
	private final AllergiesRepository allergiesRepository;
	
	
 public List<AllergiesDto> getAllergies(){
	 
	 Iterable<Allergies> allergies = allergiesRepository.findAll();
      
	 List<AllergiesDto> allergiesDto = new ArrayList<AllergiesDto>();
	 for(Allergies allergy :allergies)
	 {
		 AllergiesDto item = new AllergiesDto();
		 item.setAllergyId(allergy.getAllergyId());
		 item.setAllergyName(allergy.getAllergyName());
		 item.setDescription(allergy.getDescription());
		 allergiesDto.add(item);
	 }
	 
	 return allergiesDto;

			
			
	
 }
}
