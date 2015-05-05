package com.fdmgroup.BankApp;

public class Company extends Customer {
	

		
		Company(String companyName, int taxID){
			super(companyName, taxID);
		
		}
		
		public void findAccounts(){

			for(int i=0;i<Database.BCheckingsList.size();i++){
				System.out.println(customerID);
				
			if(Database.BCheckingsList.get(i).customerID==customerID){
				System.out.print("Got it");
			}
			}
			
		
		}
		
		public void Display(){
			
			for(int i=0;i<Database.BCheckingsList.size();i++){
				if(Database.BCheckingsList.get(i).customerID==customerID){
					System.out.println("\t"+"Checking Accounts:");
					System.out.println("Company Name"+"\t"+"Balance"+"\t"+"Check#");
					System.out.println("\t"+Database.BCheckingsList.get(i).companyName+"\t"+Database.BCheckingsList.get(i).balance+"\t"+Database.BCheckingsList.get(i).checkNumber);
				}
		}
			for(int i=0;i<Database.BSavingsList.size();i++){
				if(Database.BSavingsList.get(i).customerID==customerID){
					System.out.println("\t"+"Savings Accounts:");
					System.out.println("Company Name"+"\t"+"Balance"+"\t"+"Interest Rate");
					System.out.println(Database.BSavingsList.get(i).companyName+"\t"+Database.BSavingsList.get(i).balance+"\t"+Database.BSavingsList.get(i).interestRate);
				}
		}
		}
}
