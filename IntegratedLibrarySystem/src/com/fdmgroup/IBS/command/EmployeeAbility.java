package com.fdmgroup.IBS.command;

import SQLDatabase.TransactionTable;
import SQLDatabase.UserTable;

import com.fdmgroup.DTO.DTO;
import com.fdmgroup.DTO.PatronDTO;
import com.fdmgroup.DTO.TransDTO;
import com.fdmgroup.IBS.Book;
import com.fdmgroup.IBS.NoLoadedDataException;
import com.fdmgroup.IBS.OPAC;
import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.IBS.factory.TransactionDatabaseFactory;
import com.fdmgroup.IBS.factory.UserDatabaseFactory;
import com.fdmgroup.IBS.patroncommand.PatronAbility;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.IBS.users.User;
import com.fdmgroup.rammem.DatabaseInterface;
import com.fdmgroup.rammem.RamTransactionDatabase;
import com.fdmgroup.rammem.RamUserDatabase;

public class EmployeeAbility extends PatronAbility {

	PatronDTO dto;
	TransDTO tDTO;

	public DTO createPatron(String firstname, String lastname) {

		User user = new Patron(firstname, lastname);
		DatabaseInterface<User> db = UserDatabaseFactory.getDatabase("ram"); // TODO:
		// file
		try {
			db.create(user);
		} catch (NoLoadedDataException e) {

			e.printStackTrace();
		}

		DTO pDTO = new DTO((Patron) user);
		return pDTO;

	}

	public PatronDTO removePatron(int userID, RamUserDatabase ram) {
		dto.setUserID(userID);
		ram.delete(userID);
		return dto;

	}

	public DTO viewTransaction(Transaction t) {
		TransactionTable table=new TransactionTable();
		return table.retrieve(t.getTransID());
	}

	public DTO viewPatronInfo(Patron p) {
		UserTable table=new UserTable();
		return table.retrieve(p.getUserID());
		

	}

	public TransDTO RemoveTransaction(int key, RamTransactionDatabase ram) {
		tDTO.setTransID(key);
		ram.delete(key);
		return tDTO;

	}

	public DTO CreateTransaction(int userID, String ISBN) {

		Transaction t = new Transaction(userID, ISBN);
		DatabaseInterface<Transaction> db = TransactionDatabaseFactory
				.getDatabase("ram"); // TODO:
		// file
		try {
			db.create(t);
		} catch (NoLoadedDataException e) {

			e.printStackTrace();
		}

		DTO tDTO = new DTO(t);
		return tDTO;

	}

}
