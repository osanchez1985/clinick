package com.clinic.clinicserver.symptom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Symptoms {

	@Id
	@GeneratedValue
	private long symptomId;
	private String symptomName;
	
	public long getSymptomId() {
		return symptomId;
	}
	public void setSymptomId(long symptomId) {
		this.symptomId = symptomId;
	}
	public String getSymptomName() {
		return symptomName;
	}
	public void setSymptomName(String symptomName) {
		this.symptomName = symptomName;
	}
}
