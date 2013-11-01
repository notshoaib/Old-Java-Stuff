package com.fdmgroup.IBS.command;

import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.rammem.RamTransactionDatabase;

public class RemoveTransactionCommand implements Command {

	EmployeeAbility ability;
	int key;
	RamTransactionDatabase ram;
	
		public RemoveTransactionCommand(EmployeeAbility ability, int key, RamTransactionDatabase ram){
			this.ability=ability;
			this.key=key;
			this.ram=ram;
		}
	
	
	
	@Override
	public void execute() {
		ability.RemoveTransaction(key,ram);
		
	}

}
