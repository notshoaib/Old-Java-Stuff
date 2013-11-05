package command.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.Test;

import com.fdmgroup.IBS.command.EmployeeAbility;
import com.fdmgroup.IBS.command.RemovePatronCommand;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.rammem.RamUserDatabase;

public class TestRemovePatronCommand {

	@Test
	public void testExecuteSucceedsWithCorrectParameter() {
		EmployeeAbility ability = mock(EmployeeAbility.class);
		RamUserDatabase rm=mock(RamUserDatabase.class);
		Patron p=mock(Patron.class);
		when(p.getUserID()).thenReturn(9);
		
		RemovePatronCommand command2 = new RemovePatronCommand(ability,9,rm);
		command2.execute();
		verify(ability).removePatron(9,rm);
	}
}
