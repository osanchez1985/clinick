package com.clinic.clinicserver.User;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categories {

	@Id
	private int categoryId;
	private String categoryName;
	
	
	private Categories(){}
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
