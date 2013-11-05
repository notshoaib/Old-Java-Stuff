package com.fdmgroup.DTO;

import com.fdmgroup.IBS.users.Patron;

public class PatronDTO {
	
	String firstName;
	String lastName;
	int userID;
	
	
	public PatronDTO(Patron p){
		this.firstName=p.getfirstName();
		this.lastName=p.getLastName();
		this.userID=p.getUserID();
	}


	public String getfirstName() {
		return firstName;
	}


	public void setfirstName(String name) {
		this.firstName = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	

}
