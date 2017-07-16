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
	 
	 AllergiesDto item = new AllergiesDto();
	 item.setAllergyId(1l);
	 item.setAllergyName("Olvin");
	 allergiesDto.add(item);
	 return allergiesDto;
 }
 
 public AllergiesDto getAllergyById(Long allergyId){
	 
	 Allergies allergy = allergiesRepository.findOne(allergyId);
	 if (allergy != null)
	 {
	 AllergiesDto allergyDto = new AllergiesDto();
	 allergyDto.setAllergyId(allergy.getAllergyId());
	 allergyDto.setAllergyName(allergy.getAllergyName());
	 allergyDto.setDescription(allergy.getDescription());
	 }
	 AllergiesDto allergyDto = new AllergiesDto();
	 allergyDto.setAllergyId(1l);
	 allergyDto.setAllergyName("Olvin");
	 allergyDto.setDescription("EStoy Aqiu");
	 return allergyDto;
 }
 
 public void createAllergy(AllergiesDto allergy){
	 Allergies allergyentity= new Allergies(allergy.getAllergyId(), allergy.getAllergyName(), allergy.getDescription());
	 
	 allergiesRepository.save(allergyentity);
	 
 }
 public void modifyAllergy(long id, String name, String description){
	 
	 Allergies allergy = allergiesRepository.getOne(id);
	 allergy.setAllergyName(name);
	 allergy.setDescription(description);
	 
	 allergiesRepository.save(allergy);
	 
 }
}
