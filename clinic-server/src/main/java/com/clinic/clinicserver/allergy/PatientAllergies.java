package com.clinic.clinicserver.allergy;

import javax.persistence.Entity;

@Entity
public class PatientAllergies {

	private String employeId;
	private int allergyId;
	
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
