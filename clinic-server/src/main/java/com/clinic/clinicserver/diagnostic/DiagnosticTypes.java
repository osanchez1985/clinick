package com.clinic.clinicserver.diagnostic;

import javax.persistence.Entity;

@Entity
public class DiagnosticTypes {

	private int diagnotictypeId;
	private String diagnosticTyepeId;
	
	public int getDiagnotictypeId() {
		return diagnotictypeId;
	}
	public void setDiagnotictypeId(int diagnotictypeId) {
		this.diagnotictypeId = diagnotictypeId;
	}
	public String getDiagnosticTyepeId() {
		return diagnosticTyepeId;
	}
	public void setDiagnosticTyepeId(String diagnosticTyepeId) {
		this.diagnosticTyepeId = diagnosticTyepeId;
	}
}
