package com.fdmgroup.IBS.command;

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
	
	public PatronDTO createPatron(String firstname, String lastname) {

		User user = new Patron(firstname, lastname);
		DatabaseInterface<User> db = UserDatabaseFactory.getDatabase("ram"); // TODO:
		// file
		try {
			db.create(user);
		} catch (NoLoadedDataException e) {

			e.printStackTrace();
		}

		PatronDTO pDTO = new PatronDTO((Patron) user);
		return pDTO;

	}

	public PatronDTO removePatron(int userID, RamUserDatabase ram) {
		dto.setUserID(userID);
		ram.delete(userID);
		return dto;

	}

	public TransDTO viewTransaction(Transaction t) {
		TransDTO tDTO = new TransDTO(t);
		return tDTO;
	}

	public PatronDTO viewPatronInfo(Patron p) {
		PatronDTO pDTO = new PatronDTO(p);
		return pDTO;

	}

	public TransDTO RemoveTransaction(int key, RamTransactionDatabase ram) {
		tDTO.setTransID(key);
		ram.delete(key);
		return tDTO;

	}

	public TransDTO CreateTransaction(Book book, Patron p) {

		Transaction t = new Transaction(book, p);
		DatabaseInterface<Transaction> db = TransactionDatabaseFactory
				.getDatabase("ram"); // TODO:
		// file
		try {
			db.create(t);
		} catch (NoLoadedDataException e) {

			e.printStackTrace();
		}

		TransDTO tDTO = new TransDTO(t);
		return tDTO;

	}

}
