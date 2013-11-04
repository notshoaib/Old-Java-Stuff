package com.fdmgroup.IBS.users;

import com.fdmgroup.IBS.Book;
import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.IBS.command.CommandControl;

public class Employee extends User {

	CommandControl control;

	public Employee(String Name) {
		super(Name);
		// TODO Auto-generated constructor stub
	}

	public void performAction() throws Exception {
		control.pressButton();

	}

	public void exportController(CommandControl c) {
		control = c;
	}

}
