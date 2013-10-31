package com.fdmgroup.IBS.command;

import com.fdmgroup.IBS.NoLoadedDataException;
import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.IBS.factory.UserDatabaseFactory;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.IBS.users.User;
import com.fdmgroup.rammem.DatabaseInterface;
import com.fdmgroup.rammem.RamUserDatabase;

public class EmployeeAbility {
	
	public void createPatron(String name) {
//		User P=UserFactory.makeUser(name);
//		
//		RamUserDatabase.userMap.put(P.userID, P);
		
		User user = new Patron(name);
		DatabaseInterface<User> db = UserDatabaseFactory.getDatabase("ram"); //TODO: Change this to properties file
		try {
			db.create(user);
		} catch (NoLoadedDataException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public void removePatron(int userID, RamUserDatabase ram) {
			ram.delete(userID);
	}
	
	public void viewTransaction(Transaction t){
		System.out.println("Transaction #"+t.getTransID()+ "Book Name: " +t.getBook().getBookname() 
				+ "Patron Name: " +t.getPatron().getName() 
				+ "Patron ID: "+t.getPatron().getUserID());
	}

}
