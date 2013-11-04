package com.fdmgroup.IBS.command;

import com.fdmgroup.DTO.PatronDTO;
import com.fdmgroup.IBS.users.Patron;

public class ViewPatronInfoCommand implements Command<PatronDTO> {
	
		EmployeeAbility ability;
		Patron p;
		public ViewPatronInfoCommand(EmployeeAbility ability, Patron p){
		this.ability=ability;
		this.p=p;
	}
		@Override
		public PatronDTO execute() {
			// TODO Auto-generated method stub
			return(ability.viewPatronInfo(p));
		}

}
