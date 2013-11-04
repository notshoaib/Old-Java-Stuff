package com.fdmgroup.IBS.command;

import com.fdmgroup.DTO.PatronDTO;


public class CreatePatronCommand implements Command<PatronDTO> {


	EmployeeAbility ability;
	String name;
	
	public CreatePatronCommand(EmployeeAbility ability, String name) {
	this.name=name;
	this.ability=ability;
	}

	@Override
	public PatronDTO execute() 
	{
		return (ability.createPatron(name));
		
	}

}
