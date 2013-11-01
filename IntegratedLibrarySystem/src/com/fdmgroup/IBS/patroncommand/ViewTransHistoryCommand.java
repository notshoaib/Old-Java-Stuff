package com.fdmgroup.IBS.patroncommand;

import com.fdmgroup.IBS.command.Command;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.rammem.RamTransactionDatabase;

public class ViewTransHistoryCommand implements Command {
	
	PatronAbility ability;
	RamTransactionDatabase ram;
	Patron p;
	
		public ViewTransHistoryCommand(RamTransactionDatabase ram, PatronAbility ability, Patron p){
			this.ram=ram;
			this.ability=ability;
			this.p=p;
		}

		@Override
		public void execute() {
			ability.viewTransactions(ram, p);
			
		}
		
		

}
