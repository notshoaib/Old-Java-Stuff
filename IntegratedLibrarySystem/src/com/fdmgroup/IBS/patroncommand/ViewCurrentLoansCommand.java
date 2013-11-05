package com.fdmgroup.IBS.patroncommand;

import com.fdmgroup.DTO.TransDTO;
import com.fdmgroup.IBS.NoSuchRecordException;
import com.fdmgroup.IBS.command.Command;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.rammem.RamTransactionDatabase;

public class ViewCurrentLoansCommand implements Command {

	PatronAbility ability;
	RamTransactionDatabase ram;
	Patron p;

	public ViewCurrentLoansCommand(PatronAbility ability,
			RamTransactionDatabase ram, Patron p) {
		this.ability = ability;
		this.ram = ram;
		this.p = p;
	}

	@Override
	public TransDTO execute() throws NoSuchRecordException {
		return (ability.viewCurrentloans(ram, p));
	}

}
