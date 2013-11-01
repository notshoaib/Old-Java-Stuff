package com.fdmgroup.IBS.users;


public class Patron extends User {

	public Patron(String Name) {
		super(Name);
		// TODO Auto-generated constructor stub
	}

	
	
	
	public String toString(){
		String patron="User ID:"+this.getUserID()+" Name:"+this.getName();
		return patron;
		
	}

}
