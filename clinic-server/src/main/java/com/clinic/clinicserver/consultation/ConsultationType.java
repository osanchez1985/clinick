package com.clinic.clinicserver.consultation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ConsultationType {
	
	@Id
	@GeneratedValue
	private int consultationTypeId;
	private String Name;
	
	public int getConsultationTypeId() {
		return consultationTypeId;
	}
	public void setConsultationTypeId(int consultationTypeId) {
		this.consultationTypeId = consultationTypeId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	

}
