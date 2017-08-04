package com.clinic.clinicserver.consultation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ConsultationAppService {

	private final ConsultationRepository consultationRepository;
	
	public ConsultationAppService(ConsultationRepository consultationRepository){
		super();
		this.consultationRepository = consultationRepository;
	}
	
	public List<ConsultationDto> getConsultation() {
	
		List<Consultations> consultations = consultationRepository.findAll();
		
		List<ConsultationDto> listConsultation = new ArrayList<ConsultationDto>();
		
		for (Consultations consultation : consultations) {
			listConsultation.add(TransformConsultation(consultation));
			
		}
		return listConsultation;
	}
	
	public ConsultationDto getConsultationById(Long consultationId){
		Consultations consultation = consultationRepository.findOne(consultationId);
		
		return TransformConsultation(consultation);
	}
	
	private ConsultationDto  TransformConsultation(Consultations consultation){
		
		ConsultationDto dto = new ConsultationDto();
		dto.setaA(consultation.isaA());
		dto.setaPP(consultation.isaPP());
		dto.setAq(consultation.isAq());
		dto.setEmployeId(consultation.getEmployeId());
		dto.setAreaId(consultation.getAreaId());
		dto.setTemperature(consultation.getTemperature());
		dto.setConsultation(consultation.getConsultation());
	    dto.setShiftId(consultation.getShiftId());
	    dto.setFacilityId(consultation.getFacilityId());
		
		return dto;
	}
	
	

}
