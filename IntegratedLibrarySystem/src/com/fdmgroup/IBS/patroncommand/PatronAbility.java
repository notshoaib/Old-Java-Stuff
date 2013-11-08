package com.fdmgroup.IBS.patroncommand;

import org.apache.log4j.Logger;

import SQLDatabase.TransactionTable;

import com.fdmgroup.DTO.DTO;
import com.fdmgroup.DTO.PatronDTO;
import com.fdmgroup.DTO.TransDTO;
import com.fdmgroup.IBS.Logging;
import com.fdmgroup.IBS.NoSuchRecordException;
import com.fdmgroup.IBS.OPAC;
import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.IBS.users.User;
import com.fdmgroup.rammem.RamTransactionDatabase;
import com.fdmgroup.rammem.RamUserDatabase;

public class PatronAbility {
	public TransDTO viewCurrentloans(RamTransactionDatabase ram, Patron p)
			throws NoSuchRecordException {
		if (p.isGuest()) {
			throw new NoSuchRecordException("No data: Guest Account");
		}

		else
			return new TransDTO(ram.retrieve(p));

	}

	public DTO viewTransactions(RamTransactionDatabase ram, Patron p)
			throws NoSuchRecordException {
		if (p.isGuest()) {
			Logging.log.error("No data: Guest Account");
			throw new NoSuchRecordException("No data: Guest Account");

		} else {
			return new DTO(ram.transHistory(p));
		}
	}

	public DTO viewTransactions(Transaction t) {
		TransactionTable table = new TransactionTable();
		return table.retrieve(t.getTransID());
	}

	public OPAC viewCatalogCommand() {

		return OPAC.getInstance();
	}

}
