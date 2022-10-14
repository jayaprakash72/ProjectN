package com.pfms.Personal_Finance_Management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	@GeneratedValue
	private long categoryId;
	
	@Column
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Category(long categoryId, String category) {
		super();
		this.categoryId = categoryId;
		this.category = category;
	}
	public Category() {

	}

	public Category getCategoryId() {
		// TODO Auto-generated method stub
		return null;
	}





	

}
