package com.clinic.clinicserver.allergy;

import javax.persistence.Entity;

@Entity
public class Allergies {

	public Allergies(Long allergyId, String allergyName, String description) {
		super();
		this.allergyId = allergyId;
		this.allergyName = allergyName;
		this.description = description;
	}
	private Long allergyId;
	private String allergyName;
	private String description;
	
	
	public Long getAllergyId() {
		return allergyId;
	}
	public void setAllergyId(Long allergyId) {
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
