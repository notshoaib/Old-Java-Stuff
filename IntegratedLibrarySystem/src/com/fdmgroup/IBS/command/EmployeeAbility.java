package com.fdmgroup.IBS.command;

import com.fdmgroup.IBS.NoLoadedDataException;
import com.fdmgroup.IBS.OPAC;
import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.IBS.factory.UserDatabaseFactory;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.IBS.users.User;
import com.fdmgroup.rammem.DatabaseInterface;
import com.fdmgroup.rammem.RamTransactionDatabase;
import com.fdmgroup.rammem.RamUserDatabase;

public class EmployeeAbility {
	
	public User createPatron(String name) {
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
		
		return user;
		
		
	}
	
	public void removePatron(int userID, RamUserDatabase ram) {
			ram.delete(userID);
	}
	
	public String viewTransaction(Transaction t){
		return t.toString();
	}
	
	public String viewPatronInfo(Patron p){
		return p.toString();
				
	}
	
	public OPAC viewCatalogCommand(){
	
		return OPAC.getInstance();
	}
	
	public void RemoveTransaction(int key, RamTransactionDatabase ram){
		ram.delete(key);
		
		
	}
	

	
	
	
	

}
