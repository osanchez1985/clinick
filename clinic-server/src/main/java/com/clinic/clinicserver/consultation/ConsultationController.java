package com.clinic.clinicserver.consultation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Api/Consultation")
public class ConsultationController {

	private final ConsultationAppService consultationAppService;
	
	@Autowired
	public ConsultationController(ConsultationAppService consultationAppService){
		super();
		this.consultationAppService = consultationAppService;
	}
	
	public List<ConsultationDto> getConsultation(){
		return consultationAppService.getConsultation();
	}
}
