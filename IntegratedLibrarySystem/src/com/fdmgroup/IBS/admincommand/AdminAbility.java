package com.fdmgroup.IBS.admincommand;

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

	
	EmployeeDTO eDTO;
	
	public EmployeeDTO createEmployee(String name) {
		// User P=UserFactory.makeUser(name);
		//
		// RamUserDatabase.userMap.put(P.userID, P);

		User user = new Employee(name);
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

		return new EmployeeDTO((Employee) user);

	}
	
	public EmployeeDTO removeEmployee(int userID, RamUserDatabase ram) {
		eDTO.setUserID(userID);
		ram.delete(userID);
		return eDTO;

	}
	
}
