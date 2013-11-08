package com.fdmgroup.IBS.command;

import com.fdmgroup.DTO.DTO;
import com.fdmgroup.DTO.TransDTO;
import com.fdmgroup.IBS.Transaction;

public class ViewTransCommand implements Command<DTO>{
	
	EmployeeAbility ability;
	Transaction t;
	
	public ViewTransCommand(EmployeeAbility ability, Transaction t){
		this.t=t;
		this.ability=ability;
	}

	@Override
	public DTO execute() {
		return(ability.viewTransaction(t));
		
	}
	
	
	
	
	
	
}
