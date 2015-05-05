package com.fdmgroup.BankApp;

public class BusinessCheckings extends Checkings {
	int checkNumber = 1;

	BusinessCheckings(String companyName, int customerID) {
		super(companyName, customerID);
		// TODO Auto-generated constructor stub

	}

	public int getCheckNumber() {
		return checkNumber;
	}

	public void nextCheck() {
		checkNumber = checkNumber + 1;
	}

	public void withDraw(int amount) {

		balance = balance - amount;
		System.out.println(balance);
		for (int i = 0; i < Database.BCheckingsList.size(); i++) {

			if (Database.BCheckingsList.get(i).customerID == customerID) {
				Database.BCheckingsList.get(i).balance = balance;
				System.out.println("You withdrew $" + amount
						+ " your new balance is $" + balance);
			}
		}
		if (0 > balance) {
			System.out.println("You are overdrawn. Balance is  $" + balance);
		}

	}

	@Override
	public void deposit(int amount) {

		balance = balance + amount;

		for (int i = 0; i < Database.BCheckingsList.size(); i++) {
			

			if (Database.BCheckingsList.get(i).customerID == customerID) {
				Database.BCheckingsList.get(i).balance = balance;
				System.out.println("You deposited $" + amount
						+ " Your new balance is $" + balance);
			}
		}
	}

}
