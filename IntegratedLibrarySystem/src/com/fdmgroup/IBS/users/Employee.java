package com.fdmgroup.IBS.users;

import com.fdmgroup.IBS.Book;
import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.IBS.command.CommandControl;

public class Employee extends User  {
	
	CommandControl control;

	public Employee(String Name) {
		super(Name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void viewTransactions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewFees() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reserveTitle() {
		// TODO Auto-generated method stub
		
	}

	public void createPatron() {
		control.pressButton();
		
	}
	
	public void exportController(CommandControl c){
		control = c;
	}
	

}
