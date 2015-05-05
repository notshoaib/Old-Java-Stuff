package com.fdmgroup.BankApp;

public class PersonalCheckings extends Checkings {
	int checkNumber = 1;

	public int getCheckNumber() {
		return checkNumber;
	}

	public void nextCheck() {
		checkNumber = checkNumber + 1;
	}

	PersonalCheckings(String firstName, String lastName, int customerID) {
		super(firstName, lastName, customerID);

		// TODO Auto-generated constructor stub
	}

	@Override
	public void withDraw(int amount) {
		balance = balance - amount;
		System.out.println("You withdrew $"+amount+" Your new balance is $"+balance);
		for (int i = 0; i < Database.PCheckingsList.size(); i++) {
			

			if (Database.PCheckingsList.get(i).customerID == customerID) {
				Database.PCheckingsList.get(i).balance = balance;
			}
		}

		if (0 > balance) {
			System.out.println("You are overdrawn. Balance is  $" + balance);
		}

	}

	@Override
	public void deposit(int amount) {
		balance = balance + amount;
		for (int i = 0; i < Database.PCheckingsList.size(); i++) {

			if (Database.PCheckingsList.get(i).customerID == customerID) {
				Database.PCheckingsList.get(i).balance = balance;

				System.out.println("You deposited $" + amount
						+ " Your new balance is $" + balance);
			}
		}
	}

}
