package com.fdmgroup.IBS.command;

import com.fdmgroup.DTO.TransDTO;
import com.fdmgroup.IBS.Book;
import com.fdmgroup.IBS.users.Patron;

public class CreateTransactionCommand implements Command {

	EmployeeAbility ability;
	Patron p;
	Book book;

	public CreateTransactionCommand(EmployeeAbility ability, Book book, Patron p) {
		this.ability = ability;
		this.p = p;
		this.book = book;
	}

	@Override
	public TransDTO execute() throws Exception {
		return ability.CreateTransaction(book, p);
	}

}
