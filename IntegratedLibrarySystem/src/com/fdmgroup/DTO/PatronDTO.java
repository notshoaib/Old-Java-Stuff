package com.fdmgroup.DTO;

import com.fdmgroup.IBS.users.Patron;

public class PatronDTO {
	
	String name;
	int userID;
	
	
	public PatronDTO(Patron p){
		this.name=p.getName();
		this.userID=p.getUserID();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	

}
