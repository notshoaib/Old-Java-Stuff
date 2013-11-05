package com.fdmgroup.DTO;

import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.IBS.users.Employee;
import com.fdmgroup.IBS.users.Patron;

public class DTO {

	String firstName;
	String lastName;
	int userID;
	int transID;
	boolean currentLoan = false;

	public DTO(Transaction t) {
		this.transID = t.getTransID();
		this.currentLoan = t.iscurrentLoan();
		this.firstName = t.getPatron().getfirstName();
		this.lastName = t.getPatron().getLastName();
	}

	public DTO(Employee e) {
		this.firstName = e.getfirstName();
		this.lastName = e.getLastName();
		this.userID = e.getUserID();

	}

	public DTO(Patron p) {
		this.firstName = p.getfirstName();
		this.lastName = p.getLastName();
		this.userID = p.getUserID();

	}

}
