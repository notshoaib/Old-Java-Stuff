package com.fdmgroup.DTO;

import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.IBS.users.Employee;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.IBS.users.SystemAdmin;

public class DTO {

	String firstName;
	String lastName;
	int userID;
	int transID;
	int type;
	boolean currentLoan = false;
	boolean isGuest=false;
	String ISBN;



	public DTO(Transaction t) {
		this.transID = t.getTransID();
		this.currentLoan = t.iscurrentLoan();
		this.userID=t.getUserID();
		this.ISBN=t.getISBN();
	}

	public DTO(Employee e) {
		this.firstName = e.getfirstName();
		this.lastName = e.getLastName();
		this.userID = e.getUserID();
		this.type=1;

	}

	public DTO(Patron p) {
		this.firstName = p.getfirstName();
		this.lastName = p.getLastName();
		this.userID = p.getUserID();
		this.type=2;

	}
	
	public DTO(SystemAdmin p) {
		this.firstName = p.getfirstName();
		this.lastName = p.getLastName();
		this.userID = p.getUserID();
		this.type=3;

	}
	
	public DTO(){
		
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int isGuest() {
		int one=1;
		int zero=0;
		if(isGuest){
			return one;
		}
		else
		return zero;
	}

	public void setGuest(boolean isGuest) {
		this.isGuest = isGuest;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public int getTransID() {
		return transID;
	}

	public void setTransID(int transID) {
		this.transID = transID;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
