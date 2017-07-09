package com.clinic.clinicserver.allergy;

import javax.persistence.Entity;

@Entity
public class Allergies {

	private int allergyId;
	private String allergyName;
	private String description;
	
	
	public int getAllergyId() {
		return allergyId;
	}
	public void setAllergyId(int allergyId) {
		this.allergyId = allergyId;
	}
	public String getAllergyName() {
		return allergyName;
	}
	public void setAllergyName(String allergyName) {
		this.allergyName = allergyName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
