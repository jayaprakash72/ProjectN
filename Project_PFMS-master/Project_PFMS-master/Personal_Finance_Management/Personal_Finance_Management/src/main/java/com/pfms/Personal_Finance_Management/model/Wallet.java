package com.pfms.Personal_Finance_Management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Wallet {
	
	@Id
	@GeneratedValue
	private long walletId;
	private String walletNameString;
	private Long walletLimitLong;
	public String getWalletNameString() {
		return walletNameString;
	}
	public void setWalletNameString(String walletNameString) {
		this.walletNameString = walletNameString;
	}
	public Long getWalletLimitLong() {
		return walletLimitLong;
	}
	public void setWalletLimitLong(Long walletLimitLong) {
		this.walletLimitLong = walletLimitLong;
	}
	public Wallet(long walletId, String walletNameString, Long walletLimitLong) {
		super();
		this.walletId = walletId;
		this.walletNameString = walletNameString;
		this.walletLimitLong = walletLimitLong;
	}
	public Wallet() {

	}
	
	

}
