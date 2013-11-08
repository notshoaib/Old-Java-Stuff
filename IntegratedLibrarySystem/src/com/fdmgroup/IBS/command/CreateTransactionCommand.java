package com.fdmgroup.IBS.command;

import com.fdmgroup.DTO.DTO;
import com.fdmgroup.DTO.TransDTO;
import com.fdmgroup.IBS.Book;
import com.fdmgroup.IBS.users.Patron;

public class CreateTransactionCommand implements Command<DTO> {

	EmployeeAbility ability;
	Patron p;
	Book book;
	String ISBN;
	int userID;

	public CreateTransactionCommand(EmployeeAbility ability, int userID, String ISBN) {
		this.ability = ability;
		this.userID = userID;
		this.ISBN = ISBN;
	}

	@Override
	public DTO execute() throws Exception {
		return ability.CreateTransaction(userID, ISBN);
	}

}
