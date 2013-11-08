package com.fdmgroup.IBS.command;

import com.fdmgroup.DTO.DTO;
import com.fdmgroup.DTO.PatronDTO;
import com.fdmgroup.IBS.users.Patron;

public class ViewPatronInfoCommand implements Command<DTO> {
	
		EmployeeAbility ability;
		Patron p;
		public ViewPatronInfoCommand(EmployeeAbility ability, Patron p){
		this.ability=ability;
		this.p=p;
	}
		@Override
		public DTO execute() {
			// TODO Auto-generated method stub
			return(ability.viewPatronInfo(p));
		}

}
