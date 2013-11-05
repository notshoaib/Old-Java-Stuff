package com.fdmgroup.IBS.admincommand;

import com.fdmgroup.DTO.EmployeeDTO;
import com.fdmgroup.IBS.command.Command;

public class CreateEmployeeCommand implements Command<EmployeeDTO> {

	AdminAbility ability;
	String firstname;
	String lastname;

	public CreateEmployeeCommand(AdminAbility ability, String firstname, String lastname) {
		this.firstname = firstname;
		this.ability = ability;
		this.lastname=lastname;
	}

	@Override
		public EmployeeDTO execute() 
		{
			return (ability.createEmployee(firstname,lastname));
			
		}
}
