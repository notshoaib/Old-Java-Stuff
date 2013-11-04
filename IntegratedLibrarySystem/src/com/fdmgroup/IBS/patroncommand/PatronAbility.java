package com.fdmgroup.IBS.patroncommand;

import com.fdmgroup.DTO.PatronDTO;
import com.fdmgroup.DTO.TransDTO;
import com.fdmgroup.IBS.NoSuchRecordException;
import com.fdmgroup.IBS.OPAC;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.IBS.users.User;
import com.fdmgroup.rammem.RamTransactionDatabase;
import com.fdmgroup.rammem.RamUserDatabase;

public class PatronAbility {

	public TransDTO viewCurrentloans(RamTransactionDatabase ram, Patron p) throws NoSuchRecordException {
		if(p.isGuest()){
			throw new NoSuchRecordException("No data: Guest Account");
		}
		
		else
		return new TransDTO(ram.retrieve(p));

	}

	public TransDTO viewTransactions(RamTransactionDatabase ram, Patron p) throws NoSuchRecordException {
		if(p.isGuest()){
			throw new NoSuchRecordException("No data: Guest Account");
		
		}
		else{
		return new TransDTO(ram.transHistory(p));
	}}
	
	public OPAC viewCatalogCommand() {

		return OPAC.getInstance();
	}


}
