package com.fdmgroup.IBS.users;

import com.fdmgroup.IBS.command.CommandControl;

public class Patron extends User {
	CommandControl control;
	public Patron(String Name) {
		super(Name);
		// TODO Auto-generated constructor stub
	}

	public Patron() {

	}

	public String toString() {
		String patron = "User ID:" + this.getUserID() + " Name:"
				+ this.getName();
		return patron;

	}
	public void exportController(CommandControl c) {
		control = c;
	}

}
