package com.fdmgroup.SQLDB;

import static org.junit.Assert.*;

import org.junit.Test;

import SQLDatabase.TransactionTable;
import SQLDatabase.UserTable;

import com.fdmgroup.DTO.DTO;
import com.fdmgroup.IBS.NoLoadedDataException;
import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.IBS.admincommand.AdminAbility;
import com.fdmgroup.IBS.admincommand.CreateEmployeeCommand;
import com.fdmgroup.IBS.command.CreatePatronCommand;
import com.fdmgroup.IBS.command.CreateTransactionCommand;
import com.fdmgroup.IBS.command.EmployeeAbility;
import com.fdmgroup.IBS.command.ViewPatronInfoCommand;
import com.fdmgroup.IBS.command.ViewTransCommand;
import com.fdmgroup.IBS.users.Employee;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.IBS.users.User;

public class TestTransactionTable {

	@Test
	public void test() throws NoLoadedDataException {
		TransactionTable table=new TransactionTable();
		Transaction t=new Transaction(1,23,"75-24-B9");
		EmployeeAbility ability=new EmployeeAbility();
		CreateTransactionCommand command=new CreateTransactionCommand(ability,t.getUserID(), t.getISBN());
		try {
			table.create(command.execute());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRetrieveTransaction() throws NoLoadedDataException {
		TransactionTable table=new TransactionTable();
		Transaction t=new Transaction(1000,23,"75-24-B9");
		DTO dto=(table.retrieve(t.getTransID()));
		assertTrue(dto.getISBN().equals("75-24-B9"));
		
	}
	
	@Test
	public void testEvaluateDBDelete() throws NoLoadedDataException {
		TransactionTable table=new TransactionTable();
		Transaction t=new Transaction(1000,23,"75-24-B9");
		table.delete(t.getTransID());
	}

}
