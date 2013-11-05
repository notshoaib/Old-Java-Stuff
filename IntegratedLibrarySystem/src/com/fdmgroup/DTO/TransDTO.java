package com.fdmgroup.DTO;

import com.fdmgroup.IBS.Transaction;

public class TransDTO {

	int transID;
	boolean currentLoan = false;
	String firstName;
	String lastName;

	public TransDTO(Transaction t) {
		this.transID = t.getTransID();
		this.currentLoan = t.iscurrentLoan();
		this.firstName = t.getPatron().getfirstName();
		this.lastName=t.getPatron().getLastName();
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String FirstName) {
		this.firstName = FirstName;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
