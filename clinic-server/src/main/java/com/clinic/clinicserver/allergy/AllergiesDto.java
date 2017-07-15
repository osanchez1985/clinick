package com.clinic.clinicserver.allergy;


public class AllergiesDto {

	private Long allergyId;
	private String allergyName;
	private String description;
	
	
	public AllergiesDto() {
		super();
		// TODO Auto-generated constructor stub
	}
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
