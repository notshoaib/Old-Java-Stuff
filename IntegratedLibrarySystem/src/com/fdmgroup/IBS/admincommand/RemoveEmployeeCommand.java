package com.fdmgroup.IBS.admincommand;

import com.fdmgroup.DTO.DTO;
import com.fdmgroup.DTO.EmployeeDTO;
import com.fdmgroup.IBS.command.Command;
import com.fdmgroup.rammem.RamUserDatabase;

public class RemoveEmployeeCommand implements Command<DTO> {
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
	public DTO execute() {

		return (ability.removeEmployee(userID, ram));
	}
}
