package com.fdmgroup.BankApp;

public class BusinessSavings extends Savings {

	BusinessSavings(String companyName) {
		super(companyName);
		// TODO Auto-generated constructor stub
	}
	public void withDraw(int amount) {
		if(amount>balance){
			System.out.println("Insufficient funds cannot withdraw $"+amount);
		}
		else
			balance=balance-amount;
		for(int i=0;i<Database.BCheckingsList.size();i++){
			System.out.println(customerID);

		if(Database.BCheckingsList.get(i).customerID==customerID){
			Database.BCheckingsList.set(i, null).balance=balance;
		}
		}

	}

	@Override
	public void deposit(int amount) {
		balance=balance+amount;
		for(int i=0;i<Database.BSavingsList.size();i++){
			System.out.println(customerID);

		if(Database.BSavingsList.get(i).customerID==customerID){
			Database.BSavingsList.get(i).balance=balance;
			System.out.println("You deposited $"+amount+" Your new balance is $"+ balance);
		}
		}
	}
}
