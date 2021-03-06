package com.clinic.clinicserver.consultation;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Consultations {

	@Id
	private int consultation;
	private String employeId;
	private Date consultationDate;
	private int areaId;
	private int shiftId;
	private String facilityId;
	private String temperature;
	private boolean aPP;
	private boolean aq;
	private boolean aA;
	private int consultationResponsable;
	private int patientTypeId;
	private int consultationType;
	
	
	private Consultations(){}
	
	public int getConsultation() {
		return consultation;
	}
	public void setConsultation(int consultation) {
		this.consultation = consultation;
	}
	public String getEmployeId() {
		return employeId;
	}
	public void setEmployeId(String employeId) {
		this.employeId = employeId;
	}
	public Date getConsultationDate() {
		return consultationDate;
	}
	public void setConsultationDate(Date consultationDate) {
		this.consultationDate = consultationDate;
	}
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public int getShiftId() {
		return shiftId;
	}
	public void setShiftId(int shiftId) {
		this.shiftId = shiftId;
	}
	public String getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public boolean isaPP() {
		return aPP;
	}
	public void setaPP(boolean aPP) {
		this.aPP = aPP;
	}
	public boolean isAq() {
		return aq;
	}
	public void setAq(boolean aq) {
		this.aq = aq;
	}
	public boolean isaA() {
		return aA;
	}
	public void setaA(boolean aA) {
		this.aA = aA;
	}
	public int getConsultationResponsable() {
		return consultationResponsable;
	}
	public void setConsultationResponsable(int consultationResponsable) {
		this.consultationResponsable = consultationResponsable;
	}
	
}
