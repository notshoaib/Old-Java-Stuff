package com.fdmgroup.BankApp;

import java.util.ArrayList;



public class Database {
	static ArrayList<PersonalCheckings> PCheckingsList = new ArrayList<PersonalCheckings>();
	static ArrayList<BusinessCheckings> BCheckingsList= new ArrayList<BusinessCheckings>();
	static ArrayList<PersonalSavings> PSavingsList= new ArrayList<PersonalSavings>();
	static ArrayList<BusinessSavings> BSavingsList= new ArrayList<BusinessSavings>();
 
	public static void addAccount(PersonalCheckings account){
		PCheckingsList.add(account);
		
		
	}

	public static void addAccount(BusinessCheckings account2) {
		// TODO Auto-generated method stub
		BCheckingsList.add(account2);
	}
	
	public static void addAccount(PersonalSavings account){
		PSavingsList.add(account);
	}
	public static void addAccount(BusinessSavings account){
		BSavingsList.add(account);
	}

}
