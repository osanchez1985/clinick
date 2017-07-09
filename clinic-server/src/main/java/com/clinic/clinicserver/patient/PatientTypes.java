package com.clinic.clinicserver.patient;

import javax.persistence.Entity;

@Entity
public class PatientTypes {

	
	private int patientTypeId;
	private String nameType;
	
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
