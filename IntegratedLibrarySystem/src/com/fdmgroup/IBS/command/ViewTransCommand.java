package com.fdmgroup.IBS.command;

import com.fdmgroup.IBS.Transaction;

public class ViewTransCommand implements Command{
	
	EmployeeAbility ability;
	Transaction t;
	
	public ViewTransCommand(EmployeeAbility ability, Transaction t){
		this.t=t;
		this.ability=ability;
	}

	@Override
	public void execute() {
		ability.viewTransaction(t);
		
	}
	
	
	
	
	
	
}
