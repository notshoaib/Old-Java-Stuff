package com.fdmgroup.IBS.patroncommand;

import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.IBS.users.User;
import com.fdmgroup.rammem.RamTransactionDatabase;
import com.fdmgroup.rammem.RamUserDatabase;

public class PatronAbility {
	
		public void viewCurrentloans(RamTransactionDatabase ram, Patron p){
			ram.retrieve(p);
			
			
		}
		
		public void viewTransactions(RamTransactionDatabase ram, Patron p){
			ram.transHistory(p);
		}
	

	}


