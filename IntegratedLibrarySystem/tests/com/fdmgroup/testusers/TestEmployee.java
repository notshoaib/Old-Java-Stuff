package com.fdmgroup.testusers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.fdmgroup.IBS.command.CommandControl;
import com.fdmgroup.IBS.command.CreatePatronCommand;
import com.fdmgroup.IBS.command.EmployeeAbility;
import com.fdmgroup.IBS.users.Employee;

public class TestEmployee {

	@Test
	public void test() throws Exception {
		Employee Kobe = new Employee("Kobe", "Bryant");
		EmployeeAbility ability = new EmployeeAbility();
		CommandControl controller = new CommandControl();
		CreatePatronCommand command = new CreatePatronCommand(ability, "John",
				"Doe");
		controller.setCommand(command);
		Kobe.exportController(controller);
		Kobe.performAction();
		verify(ability).createPatron("John", "Doe");

	}

}
