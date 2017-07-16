package com.clinic.clinicserver.patient;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientTypes {

	@Id
	private int patientTypeId;
	private String nameType;
	
	private PatientTypes(){}
	
	public int getPatientTypeId() {
		return patientTypeId;
	}
	
	public void setPatientTypeId(int patientTypeId) {
		this.patientTypeId = patientTypeId;
	}
	
	public String getNameType() {
		return nameType;
	}
	public void setNameType(String nameType) {
		this.nameType = nameType;
	}
}
