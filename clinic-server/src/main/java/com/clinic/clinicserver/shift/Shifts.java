package com.clinic.clinicserver.shift;

import javax.persistence.Entity;

@Entity
public class Shifts {

	private int shiftId;
	private String shiftName;
	
	
	public int getShiftId() {
		return shiftId;
	}
	public void setShiftId(int shiftId) {
		this.shiftId = shiftId;
	}
	public String getShiftName() {
		return shiftName;
	}
	public void setShiftName(String shiftName) {
		this.shiftName = shiftName;
	}
}
