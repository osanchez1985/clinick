package com.clinic.clinicserver.shift;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shifts {

	@Id
	private int shiftId;
	private String shiftName;
	
	private Shifts(){}
	
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
