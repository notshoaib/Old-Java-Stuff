package com.fdmgroup.IBS.command;

import com.fdmgroup.DTO.PatronDTO;

public class CreatePatronCommand implements Command<PatronDTO> {

	EmployeeAbility ability;
	String firstname;
	String lastname;

	public CreatePatronCommand(EmployeeAbility ability, String firstname,
			String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.ability = ability;
	}

	@Override
	public PatronDTO execute() {
		return (ability.createPatron(firstname, lastname));

	}

}
