package com.fdmgroup.IBS.command;

import com.fdmgroup.IBS.OPAC;

public class ViewCatalogCommand implements Command<OPAC> {
	
	EmployeeAbility ability;
	
	public ViewCatalogCommand(EmployeeAbility ability){
		this.ability=ability;
	}

	@Override
	public OPAC execute() {
		return(ability.viewCatalogCommand());

		
	}
	
	

}
