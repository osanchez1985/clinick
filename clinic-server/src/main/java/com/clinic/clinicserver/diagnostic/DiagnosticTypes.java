package com.clinic.clinicserver.diagnostic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DiagnosticTypes {

	@Id
	private int diagnotictypeId;
	private String diagnosticTyepeId;
	
	private DiagnosticTypes(){}
	
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
