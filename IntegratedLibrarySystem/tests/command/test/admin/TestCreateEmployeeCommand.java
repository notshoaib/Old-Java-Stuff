package command.test.admin;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.fdmgroup.IBS.admincommand.AdminAbility;
import com.fdmgroup.IBS.admincommand.CreateEmployeeCommand;
import com.fdmgroup.IBS.command.CreatePatronCommand;
import com.fdmgroup.IBS.command.EmployeeAbility;

public class TestCreateEmployeeCommand {

	@Test
	public void testExecuteSucceedsWithCorrectParameter() {
		AdminAbility ability = mock(AdminAbility.class);
		CreateEmployeeCommand command = new CreateEmployeeCommand(ability,"John", "Doe");
		command.execute();
		verify(ability).createEmployee("John", "Doe");
	}
	
	@Test
	public void testExecuteFailsWithIncorrectParameter() {
		AdminAbility ability = mock(AdminAbility.class);
		CreateEmployeeCommand command = new CreateEmployeeCommand(ability,"John", "Doe");
		command.execute();
		verify(ability,org.mockito.Mockito.times(0)).createEmployee("Sally", "Jane");
	}

}
