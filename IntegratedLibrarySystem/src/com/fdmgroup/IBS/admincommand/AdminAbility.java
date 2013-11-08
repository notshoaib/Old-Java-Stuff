package com.fdmgroup.IBS.admincommand;

import com.fdmgroup.DTO.DTO;
import com.fdmgroup.DTO.EmployeeDTO;
import com.fdmgroup.DTO.PatronDTO;
import com.fdmgroup.IBS.NoLoadedDataException;
import com.fdmgroup.IBS.command.EmployeeAbility;
import com.fdmgroup.IBS.factory.UserDatabaseFactory;
import com.fdmgroup.IBS.users.Employee;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.IBS.users.User;
import com.fdmgroup.rammem.DatabaseInterface;
import com.fdmgroup.rammem.RamUserDatabase;

public class AdminAbility extends EmployeeAbility {

	DTO eDTO;

	public DTO createEmployee(String firstName, String lastName) {
		// User P=UserFactory.makeUser(name);
		//
		// RamUserDatabase.userMap.put(P.userID, P);

		User user = new Employee(firstName, lastName);
		DatabaseInterface<User> db = UserDatabaseFactory.getDatabase("ram"); // TODO:
																				// Change
																				// this
																				// to
																				// properties
																				// file
		try {
			db.create(user);
		} catch (NoLoadedDataException e) {

			e.printStackTrace();
		}

		return new DTO((Employee) user);

	}

	public DTO removeEmployee(int userID, RamUserDatabase ram) {
		eDTO.setUserID(userID);
		ram.delete(userID);
		return eDTO;

	}

}
