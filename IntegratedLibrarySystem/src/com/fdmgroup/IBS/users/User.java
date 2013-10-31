package com.fdmgroup.IBS.users;

public abstract class User {
	
	String name=null;
	static int tID=1000;
	int userID;
	
	User(String name){
		this.name=name;
		setuserID();
	}
	
	User(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void viewTransactions();
	
	public abstract void viewFees();
	
	public abstract void reserveTitle();
	
	public void setuserID() {
		this.userID=tID;
		tID+=3;
	
	}

	public int getUserID() {
		return userID;
	}


	

}
