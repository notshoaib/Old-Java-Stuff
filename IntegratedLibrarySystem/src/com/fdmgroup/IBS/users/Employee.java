package com.fdmgroup.IBS.users;

import com.fdmgroup.IBS.Book;
import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.IBS.command.CommandControl;

public class Employee extends User {

	CommandControl<Object> control;

	public Employee(String firstName, String lastName) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
	}

	public Object performAction() throws Exception {
		return control.pressButton();

	}

	public void exportController(CommandControl c) {
		control = c;
	}

}
