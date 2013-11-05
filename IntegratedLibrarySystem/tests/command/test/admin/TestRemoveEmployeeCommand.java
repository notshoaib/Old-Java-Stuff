package command.test.admin;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.fdmgroup.IBS.admincommand.AdminAbility;
import com.fdmgroup.IBS.admincommand.RemoveEmployeeCommand;
import com.fdmgroup.IBS.command.EmployeeAbility;
import com.fdmgroup.IBS.command.RemovePatronCommand;
import com.fdmgroup.IBS.users.Employee;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.rammem.RamUserDatabase;

public class TestRemoveEmployeeCommand {

	@Test
	public void testExecuteSucceedsWithCorrectParameter() {
		AdminAbility ability = mock(AdminAbility.class);
		RamUserDatabase rm=mock(RamUserDatabase.class);
		Employee e=mock(Employee.class);
		when(e.getUserID()).thenReturn(9);
		
		RemoveEmployeeCommand command2 = new RemoveEmployeeCommand(ability,9,rm);
		command2.execute();
		verify(ability).removePatron(9,rm);
	}

}
