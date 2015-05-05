package com.fdmgroup.BankApp;

public class PersonalSavings extends Savings {
	
	int balance=0;
	PersonalSavings(String firstName, String lastName, int customerID) {
		super(firstName, lastName, customerID);
	
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withDraw(int amount) {
		if(amount>balance){
			System.out.println("Insufficient funds cannot withdraw $"+amount);
		}
		else
			balance=balance-amount;
		for(int i=0;i<Database.PSavingsList.size();i++){
			

		if(Database.PSavingsList.get(i).customerID==customerID){
			Database.PSavingsList.get(i).balance=balance;
			System.out.println("You have withdrawn $"+amount+" your balance is $"+balance);
		}
		}
		
	}
	@Override
	public void deposit(int amount){
		balance=balance+amount;
		for(int i=0;i<Database.PSavingsList.size();i++){
		if(Database.PSavingsList.get(i).customerID==customerID){
			Database.PSavingsList.get(i).balance=balance;
			System.out.println("You deposited $"+amount+" Your new balance is $"+ balance);
		}
		}
	}

}
