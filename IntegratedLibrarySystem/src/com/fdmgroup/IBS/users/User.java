package com.fdmgroup.IBS.users;

public abstract class User {
	
	String name=null;
	static int tID=1000;
	int userID;
	boolean guest=false;
	
	User(String name){
		this.name=name;
		setuserID();
	}
	
	User(){
		this.guest=true;
	}

	public boolean isGuest() {
		return guest;
	}

	public void setGuest(boolean guest) {
		this.guest = guest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void setuserID() {
		this.userID=tID;
		tID+=3;
	
	}

	public int getUserID() {
		return userID;
	}


	

}
