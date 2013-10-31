package com.fdmgroup.IBS.command;


public class CreatePatronCommand implements Command {


	EmployeeAbility ability;
	String name;
	
	public CreatePatronCommand(EmployeeAbility ability, String name) {
	this.name=name;
	this.ability=ability;
	}

	@Override
	public void execute() 
	{
		ability.createPatron(name);
	}

}
