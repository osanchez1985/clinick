package com.clinic.clinicserver.allergy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientAllergies {

	@Id
	private long patientAllergyId;
	private int allergyId;
	private String employeId;
	
	private PatientAllergies(){} 
		
	public Long getPatientAllergyId(){
		return patientAllergyId;
	}
	public void setPatientAllergyId(long patientAllergyId){
		
		this.patientAllergyId = patientAllergyId;
	}
	
	public String getEmployeId() {
		return employeId;
	}
	public void setEmployeId(String employeId) {
		this.employeId = employeId;
	}
	public int getAllergyId() {
		return allergyId;
	}
	public void setAllergyId(int allergyId) {
		this.allergyId = allergyId;
	}
}
