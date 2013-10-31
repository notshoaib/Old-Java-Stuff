package com.fdmgroup.IBS.command;

import com.fdmgroup.rammem.RamUserDatabase;

public class RemovePatronCommand implements Command {


	EmployeeAbility ability;
	int userID;
	RamUserDatabase ram;
	
	public RemovePatronCommand(EmployeeAbility ability, int userID, RamUserDatabase ram) {
		this.userID=userID;
		this.ram=ram;
		this.ability = ability;
	}

	@Override
	public void execute() {

		ability.removePatron(userID,ram);
	}

}
