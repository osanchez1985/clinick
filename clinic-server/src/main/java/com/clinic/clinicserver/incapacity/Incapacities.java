package com.clinic.clinicserver.incapacity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Incapacities {

	@Id
	private int incapacityId;
	private int consultationId;
	private Date incapacityDateFrom;
	private Date incapacityDateTo;
	
	private Incapacities(){}
	
	public int getIncapacityId() {
		return incapacityId;
	}
	public void setIncapacityId(int incapacityId) {
		this.incapacityId = incapacityId;
	}
	public int getConsultationId() {
		return consultationId;
	}
	public void setConsultationId(int consultationId) {
		this.consultationId = consultationId;
	}
	public Date getIncapacityDateFrom() {
		return incapacityDateFrom;
	}
	public void setIncapacityDateFrom(Date incapacityDateFrom) {
		this.incapacityDateFrom = incapacityDateFrom;
	}
	public Date getIncapacityDateTo() {
		return incapacityDateTo;
	}
	public void setIncapacityDateTo(Date incapacityDateTo) {
		this.incapacityDateTo = incapacityDateTo;
	}
}
