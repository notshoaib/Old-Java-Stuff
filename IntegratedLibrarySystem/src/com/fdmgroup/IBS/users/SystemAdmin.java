package com.fdmgroup.IBS.users;

import com.fdmgroup.IBS.command.CommandControl;

public class SystemAdmin extends User {
	CommandControl<Object> control;

	public SystemAdmin(String firstName, String lastName) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
	}

	public void performAction() throws Exception {
		control.pressButton();

	}

	public void exportController(CommandControl c) {
		control = c;
	}
}
