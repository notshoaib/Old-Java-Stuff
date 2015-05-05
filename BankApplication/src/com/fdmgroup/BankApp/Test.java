package com.fdmgroup.BankApp;

public class Test {

	public static void main(String args[]) {

		Customer AirJordan = new Person("Michael", "Jordan", "103 Bulls Lane IL", 23955);
		PersonalCheckings mikesAcct=new PersonalCheckings("Michael","Jordan",2000000);
		Savings mikesSvgAcct=new PersonalSavings("Michael","Jordan",2000000);
		
		Customer HSBC = new Company("HSBC", 45555);
		
		Checkings ckHSBC=new BusinessCheckings ("HSBC",2000007);

		
		
		Database.addAccount((BusinessCheckings)ckHSBC);
		Database.addAccount(mikesAcct);
		Database.addAccount((PersonalSavings)mikesSvgAcct);
	
		mikesAcct.deposit(1000);
		mikesAcct.withDraw(200);
		mikesSvgAcct.deposit(7500);
		ckHSBC.deposit(1500);
		
		((Person) AirJordan).Display();

		((Company)HSBC).Display();
//		
//		mansaccount.deposit(500);
//		System.out.println(Database.BCheckingsList.get(0).balance);
//		mansaccount.withDraw(550);
		
		
		//System.out.println(dude2.getCustomerID());
	//	System.out.println(dude.getCustomerID());
	
		
		

	}
}
