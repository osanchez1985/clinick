package com.clinic.clinicserver.Area;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Areas {

	@Id
	private int areaId;
	private String areaName;
	
	private Areas(){}
	
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
}
