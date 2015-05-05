package com.fdmgroup.BankApp;



public class Person extends Customer{
	String cusName;
	int i=0;
	
	
	Person(String firstName, String lastName, String address, int taxIDnum){
		
		super(firstName,lastName, address, taxIDnum);
		
	}
	

	public void findAccounts(){

		for(int i=0;i<Database.PCheckingsList.size();i++){
			System.out.println(customerID);

		if(Database.PCheckingsList.get(i).customerID==customerID){
			System.out.println("Got it 1");
		}
		}
		
	
	}
	
	public void reset(){
		for(int i=0;i<Database.PCheckingsList.size();i++){
			
			System.out.println(customerID);
			if(Database.PCheckingsList.get(i).customerID==customerID){
				Database.PCheckingsList.get(i).balance=0;
				System.out.println("Account "+Database.PCheckingsList.get(i).customerID+" Has reset balance to $" +Database.PCheckingsList.get(i).balance);
			}
		}
		for(int i=0;i<Database.PSavingsList.size();i++){
			if(Database.PSavingsList.get(i).customerID==customerID){
				Database.PSavingsList.get(i).balance=0;
				System.out.println("Account "+Database.PSavingsList.get(i).customerID+" Has reset balance to $" +Database.PSavingsList.get(i).balance);
			}
		
	}
	

}
	public void Display(){
		for(int i=0;i<Database.PCheckingsList.size();i++){
			if(Database.PCheckingsList.get(i).customerID==customerID){
				System.out.println("\t"+"Checking Accounts:");
				System.out.println("First"+"\t"+"Last"+"\t"+"Balance"+"\t"+"Check#");
				System.out.println(Database.PCheckingsList.get(i).firstName+"\t"+Database.PCheckingsList.get(i).lastName+"\t"+Database.PCheckingsList.get(i).balance+"\t"+Database.PCheckingsList.get(i).checkNumber);
			}
		}
		System.out.println("");
		for(int i=0;i<Database.PSavingsList.size();i++){
			if(Database.PSavingsList.get(i).customerID==customerID){
				System.out.println("\t"+"Savings Accounts:");
				System.out.println("First"+"\t"+"Last"+"\t"+"Balance"+"\t"+"Interest Rate");
				System.out.println(Database.PSavingsList.get(i).firstName+"\t"+Database.PSavingsList.get(i).lastName+"\t"+Database.PSavingsList.get(i).balance+"\t"+Database.PSavingsList.get(i).interestRate);			
			}
		}
		System.out.println("");
	
	}
}