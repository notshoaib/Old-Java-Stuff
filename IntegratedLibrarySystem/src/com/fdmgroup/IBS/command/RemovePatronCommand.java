package com.fdmgroup.IBS.command;

import com.fdmgroup.DTO.PatronDTO;
import com.fdmgroup.rammem.RamUserDatabase;

public class RemovePatronCommand implements Command<PatronDTO> {


	EmployeeAbility ability;
	int userID;
	RamUserDatabase ram;
	
	public RemovePatronCommand(EmployeeAbility ability, int userID, RamUserDatabase ram) {
		this.userID=userID;
		this.ram=ram;
		this.ability = ability;
	}

	@Override
	public PatronDTO execute() {

		return(ability.removePatron(userID,ram));
	}

}
