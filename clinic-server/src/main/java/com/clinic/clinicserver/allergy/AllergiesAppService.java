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
 
 public AllergiesDto getAllergyById(Long allergyId){
	 
	 Allergies allergy = allergiesRepository.findOne(allergyId);
	 AllergiesDto allergyDto = new AllergiesDto();
	 if (allergy != null)
	 {
		 
	 allergyDto.setAllergyId(allergy.getAllergyId());
	 allergyDto.setAllergyName(allergy.getAllergyName());
	 allergyDto.setDescription(allergy.getDescription());
	 }

	 return allergyDto;
 }
 
 public AllergiesDto createAllergy(AllergiesDto allergy){
	 Allergies allergyentity= new Allergies(allergy.getAllergyName(), allergy.getDescription());
	 
	 allergiesRepository.saveAndFlush(allergyentity);
	 
	 AllergiesDto result = new AllergiesDto(allergyentity);
	 return result;
	 
 }
 public void modifyAllergy(long id, String name, String description){
	 
	 Allergies allergy = allergiesRepository.getOne(id);
	 allergy.setAllergyName(name);
	 allergy.setDescription(description);
	 
	 allergiesRepository.save(allergy);
	 
 }
}
