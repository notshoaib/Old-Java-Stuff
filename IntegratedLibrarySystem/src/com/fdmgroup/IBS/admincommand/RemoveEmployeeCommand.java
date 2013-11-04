package com.fdmgroup.IBS.admincommand;

import com.fdmgroup.DTO.EmployeeDTO;
import com.fdmgroup.IBS.command.Command;
import com.fdmgroup.rammem.RamUserDatabase;

public class RemoveEmployeeCommand implements Command<EmployeeDTO> {
	AdminAbility ability;
	int userID;
	RamUserDatabase ram;

	public RemoveEmployeeCommand(AdminAbility ability, int userID,
			RamUserDatabase ram) {
		this.userID = userID;
		this.ram = ram;
		this.ability = ability;
	}

	@Override
	public EmployeeDTO execute() {

		return (ability.removeEmployee(userID, ram));
	}
}
