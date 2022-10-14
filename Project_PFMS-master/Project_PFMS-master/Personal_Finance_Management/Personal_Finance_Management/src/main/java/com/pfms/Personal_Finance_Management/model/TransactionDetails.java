package com.pfms.Personal_Finance_Management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class TransactionDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column
	private String date;
	@Column
	private String category;
	@Column
	private String bank_name;
	@Column
	private long amount;
	

	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getbank_name() {
		return bank_name;
	}
	public void setbank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public TransactionDetails(long id, String date, String category, String bank_name, long amount) {
		super();
		this.id = id;
		this.date = date;
		this.category = category;
		this.bank_name = bank_name;
		this.amount = amount;
	}
	public TransactionDetails() {
		super();
	}
	
	

}
