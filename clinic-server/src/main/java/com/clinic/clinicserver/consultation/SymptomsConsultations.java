package com.clinic.clinicserver.consultation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SymptomsConsultations {

	@Id
	private long ConsultationSymptomId;
	private long consultationId;
	private long symptomId;
}
