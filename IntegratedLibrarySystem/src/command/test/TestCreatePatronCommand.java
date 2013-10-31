package command.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.fdmgroup.IBS.command.CreatePatronCommand;
import com.fdmgroup.IBS.command.EmployeeAbility;

public class TestCreatePatronCommand {

	@Test
	public void testExecuteSucceedsWithCorrectParameter() {
		EmployeeAbility ability = mock(EmployeeAbility.class);
		CreatePatronCommand command = new CreatePatronCommand(ability,"John");
		command.execute();
		verify(ability).createPatron("John");
	}
	
	@Test
	public void testExecuteFailsWithIncorrectParameter() {
		EmployeeAbility ability = mock(EmployeeAbility.class);
		CreatePatronCommand command = new CreatePatronCommand(ability,"John");
		command.execute();
		verify(ability,org.mockito.Mockito.times(0)).createPatron("Sally");
	}
	

}
