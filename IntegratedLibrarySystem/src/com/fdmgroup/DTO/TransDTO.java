package com.fdmgroup.DTO;

import com.fdmgroup.IBS.Transaction;

public class TransDTO {

	int transID;
	boolean currentLoan = false;
	String patronName;

	public TransDTO(Transaction t) {
		this.transID = t.getTransID();
		this.currentLoan = t.iscurrentLoan();
		this.patronName = t.getPatron().getName();

	}

	public int getTransID() {
		return transID;
	}

	public void setTransID(int transID) {
		this.transID = transID;
	}

	public boolean isCurrentLoan() {
		return currentLoan;
	}

	public void setCurrentLoan(boolean currentLoan) {
		this.currentLoan = currentLoan;
	}

	public String getPatronName() {
		return patronName;
	}

	public void setPatronName(String patronName) {
		this.patronName = patronName;
	}
}
