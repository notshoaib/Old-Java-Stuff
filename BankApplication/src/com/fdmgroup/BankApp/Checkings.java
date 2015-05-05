package com.fdmgroup.BankApp;

public abstract class Checkings implements Account {
	int customerID;
	String firstName;
	String lastName;
	String companyName;
	int balance=0;

	Checkings(String firstName, String lastName, int customerID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerID = customerID;
	}

	Checkings(String companyName, int customerID) {
		this.companyName = companyName;
		this.customerID = customerID;
	}
	@Override
	public abstract void withDraw(int x);

	@Override
	public abstract void deposit(int x);
		// TODO Auto-generated method stub

	

}
