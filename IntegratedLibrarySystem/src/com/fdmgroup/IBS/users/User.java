package com.fdmgroup.IBS.users;

public abstract class User {

	String firstName = null;
	String lastName= null;
	static int tID = 1000;
	int userID;
	boolean guest = false;
	boolean loggedIn = false;

	User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName=lastName;
		setuserID();
	}

	User() {
		this.guest = true;
	}

	public boolean isGuest() {
		return guest;
	}

	public void setGuest(boolean guest) {
		this.guest = guest;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setName(String firstName) {
		this.firstName =firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setuserID() {
		this.userID = tID;
		tID += 3;

	}

	public int getUserID() {
		return userID;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void signON() {
		this.loggedIn = true;
	}

	public void signOFF() {
		this.loggedIn = false;
	}

}
