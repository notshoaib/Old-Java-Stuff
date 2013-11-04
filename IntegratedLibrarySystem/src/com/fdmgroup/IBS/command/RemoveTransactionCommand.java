package com.fdmgroup.IBS.command;

import com.fdmgroup.DTO.TransDTO;
import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.rammem.RamTransactionDatabase;

public class RemoveTransactionCommand implements Command<TransDTO> {

	EmployeeAbility ability;
	int key;
	RamTransactionDatabase ram;
	
		public RemoveTransactionCommand(EmployeeAbility ability, int key, RamTransactionDatabase ram){
			this.ability=ability;
			this.key=key;
			this.ram=ram;
		}
	
	
	
	@Override
	public TransDTO execute() {
		return(ability.RemoveTransaction(key,ram));
		
	}

}
