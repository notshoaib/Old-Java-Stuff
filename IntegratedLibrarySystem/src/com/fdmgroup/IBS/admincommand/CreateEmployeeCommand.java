package com.fdmgroup.IBS.admincommand;

import com.fdmgroup.DTO.EmployeeDTO;
import com.fdmgroup.IBS.command.Command;

public class CreateEmployeeCommand implements Command<EmployeeDTO> {

	AdminAbility ability;
	String name;

	protected CreateEmployeeCommand(AdminAbility ability, String name) {
		this.name = name;
		this.ability = ability;
	}

	@Override
		public EmployeeDTO execute() 
		{
			return (ability.createEmployee(name);
			
		}
}
