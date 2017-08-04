package com.clinic.clinicserver.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Api/Patients")

public class PatientController {

	private final PatientsAppService patientsAppService;
	
	@Autowired
	public PatientController(PatientsAppService patientsAppService){
		super();
		this.patientsAppService = patientsAppService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<PatientDto> getPatients(){
		
		return patientsAppService.getPatients();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{employeId}")
	public PatientDto getPatientById(@PathVariable String employeId){
		return patientsAppService.getPatientById( employeId);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public PatientDto createPatient(@RequestBody PatientDto patientDto ){
		
		return patientsAppService.createPatient(patientDto);
	}
	
	/*@RequestMapping(method = RequestMethod.POST)
	public AllergiesDto createAllergy(@RequestBody AllergiesDto allergydto ){
		
	return	allergiesAppService.createAllergy(allergydto);
	
	}*/

}
