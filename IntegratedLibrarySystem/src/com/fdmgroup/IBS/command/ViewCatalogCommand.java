package com.fdmgroup.IBS.command;

public class ViewCatalogCommand implements Command {
	
	EmployeeAbility ability;
	
	public ViewCatalogCommand(EmployeeAbility ability){
		this.ability=ability;
	}

	@Override
	public void execute() {
		ability.viewCatalogCommand();

		
	}
	
	

}
