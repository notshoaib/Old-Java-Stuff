package com.fdmgroup.SQLDB;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fdmgroup.DTO.DTO;
import com.fdmgroup.IBS.NoLoadedDataException;
import com.fdmgroup.IBS.admincommand.AdminAbility;
import com.fdmgroup.IBS.admincommand.CreateEmployeeCommand;
import com.fdmgroup.IBS.command.CreatePatronCommand;
import com.fdmgroup.IBS.command.EmployeeAbility;
import com.fdmgroup.IBS.command.ViewPatronInfoCommand;
import com.fdmgroup.IBS.users.Employee;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.IBS.users.SystemAdmin;
import com.fdmgroup.IBS.users.User;

import SQLDatabase.UserTable;

public class TestUserTable {

	@Test
	public void test() throws NoLoadedDataException {
		UserTable table=new UserTable();
		User u=new Patron("Erik","Williams");
		EmployeeAbility ability=new EmployeeAbility();
		CreatePatronCommand command=new CreatePatronCommand(ability,"Erik", "Williams");
		table.create(command.execute());
	}
	@Test
	public void testCreateEmployee() throws NoLoadedDataException {
		UserTable table=new UserTable();
		User u=new Employee("Erik","Williams");
		AdminAbility ability=new AdminAbility();
		CreateEmployeeCommand command=new CreateEmployeeCommand(ability,"Erik", "Williams");
		table.create(command.execute());
	}
	
	@Test
	public void testRetrieve() throws NoLoadedDataException {
		UserTable table=new UserTable();
		User u=new Patron("Erik","Williams");
		u.setuserID(1009);
		EmployeeAbility ability=new EmployeeAbility();
		ViewPatronInfoCommand command=new ViewPatronInfoCommand(ability,(Patron) u);
		DTO d=table.retrieve(u.getUserID());
		assertTrue(d.getFirstName().equals("Erik"));
		
	}
	
	@Test
	public void testEvaluateUpdate() throws NoLoadedDataException {
		UserTable table=new UserTable();
		User u=new Employee("Erik","Williams");
		AdminAbility ability=new AdminAbility();
		CreateEmployeeCommand command=new CreateEmployeeCommand(ability,"Erik", "Williams");
		table.create(command.execute());
		u.setuserID(1009);
		u.setLastName("Fred");
		DTO dto=new DTO((Employee)u);
		table.update(u.getUserID(), dto);
		
	}
	
	@Test
	public void testEvaluateDBDelete() throws NoLoadedDataException {
		UserTable table=new UserTable();
		User u=new Patron("Erik","Williams");
		u.setuserID(1009);
		table.delete(u.getUserID());
	}

}
