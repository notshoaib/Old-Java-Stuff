package com.fdmgroup.IBS.command;

import com.fdmgroup.IBS.Transaction;

public class ViewTransCommand implements Command{
	
	EmployeeAbility ability;
	Transaction t;
	
	public ViewTransCommand(Transaction t){
		this.t=t;
	}

	@Override
	public void execute() {
		ability.viewTransaction(t);
		
	}
	
	
	
	
	
	
}
