package com.fdmgroup.BankApp;

public abstract class Savings implements Account{
	String companyName;
	String firstName;
	String lastName;
	int customerID;
	int balance=0;
	int interestRate=0;
	Savings(){
		}
	Savings(String companyName){
		this.companyName=companyName;
	}
	Savings (String firstName, String lastName, int customerID){
		this.firstName=firstName;
		this.lastName=lastName;
		this.customerID=customerID;
	}
	@Override
	public void withDraw(int x) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		
	}
	public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

}
