package com.fdmgroup.IBS.factory;

import com.fdmgroup.IBS.users.Employee;
import com.fdmgroup.IBS.users.UserFactory;

public class EmployeeFactory extends UserFactory
{

	@Override
	protected Employee makeEmployee(String name) {
		
		return new Employee (name);
	}

}
