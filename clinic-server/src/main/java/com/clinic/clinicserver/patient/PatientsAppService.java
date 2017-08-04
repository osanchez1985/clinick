package com.clinic.clinicserver.patient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientsAppService {


	@Autowired
	private final PatientsRepository patientsRepository;
	
	
	
	public PatientsAppService(PatientsRepository patientsRepository) {
		super();
		this.patientsRepository = patientsRepository;
		// TODO Auto-generated constructor stub
	}



	public List<PatientDto> getPatients() {

		List<Patients> patients = patientsRepository.findAll();

		List<PatientDto> dtoPatients = new ArrayList<PatientDto>();

		for (Patients patient : patients) {
			PatientDto dto = Materializar(patient);
			dtoPatients.add(dto);
		}

		return dtoPatients;
	}
	
	public PatientDto getPatientById(String employeId){
		
		Patients patient = patientsRepository.findOne(employeId);
		
		return  Materializar(patient);
	}

	private PatientDto Materializar(Patients patient) {
		PatientDto dto = new PatientDto();
		dto.setEmployeId(patient.getEmployeId());
		dto.setName(patient.getName());
		dto.setLastName(patient.getLastName());
		dto.setAddress(patient.getAddress());
		dto.setBirthDate(patient.getBirthDate());
		dto.setGender(patient.getGender());
		
		return dto;
	}
	
	public PatientDto createPatient(PatientDto patientDto){
		Patients patient = new Patients(patientDto.getEmployeId(),patientDto.getName(),patientDto.getLastName(),
				patientDto.getAddress(),patientDto.getPhoneNumber(),patientDto.getBirthDate(),patientDto.getGender());
		
		patientsRepository.saveAndFlush(patient);
		return Materializar(patient);
	}
}
