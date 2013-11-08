package com.fdmgroup.IBS.users;

import com.fdmgroup.DTO.PatronDTO;
import com.fdmgroup.DTO.TransDTO;
import com.fdmgroup.IBS.command.CommandControl;

public class Patron extends User {
	CommandControl<TransDTO> control;
	public Patron(String firstName, String lastName) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
	}
	
	public Patron(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
		// TODO Auto-generated constructor stub
	}

	public Patron() {

	}

	public void exportController(CommandControl c) {
		control = c;
	}

}
