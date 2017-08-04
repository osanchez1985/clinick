package com.clinic.clinicserver.medicament;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Medicaments {

	@Id
	@GeneratedValue
	private long medicamentId;
	private String medicamentName;
	public long getMedicamentId() {
		return medicamentId;
	}
	public void setMedicamentId(long medicamentId) {
		this.medicamentId = medicamentId;
	}
	public String getMedicamentName() {
		return medicamentName;
	}
	public void setMedicamentName(String medicamentName) {
		this.medicamentName = medicamentName;
	}
	
}
