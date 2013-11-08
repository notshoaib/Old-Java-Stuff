package com.fdmgroup.IBS.patroncommand;

import com.fdmgroup.DTO.DTO;
import com.fdmgroup.DTO.TransDTO;
import com.fdmgroup.IBS.NoSuchRecordException;
import com.fdmgroup.IBS.command.Command;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.rammem.RamTransactionDatabase;

public class ViewTransHistoryCommand implements Command<DTO> {
	
	PatronAbility ability;
	RamTransactionDatabase ram;
	Patron p;
	
		public ViewTransHistoryCommand(RamTransactionDatabase ram, PatronAbility ability, Patron p){
			this.ram=ram;
			this.ability=ability;
			this.p=p;
		}

		@Override
		public DTO execute() throws NoSuchRecordException {
			return(ability.viewTransactions(ram, p));
			
		}
		
		

}
