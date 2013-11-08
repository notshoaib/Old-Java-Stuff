package command.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.IBS.command.CreatePatronCommand;
import com.fdmgroup.IBS.command.EmployeeAbility;
import com.fdmgroup.IBS.command.ViewTransCommand;

public class TestViewTransCommand {

	@Test
	public void testEvaulateViewTrans() {
		EmployeeAbility ability = mock(EmployeeAbility.class);
		Transaction t = mock(Transaction.class);
		when(t.getISBN()).thenReturn("9");
		ViewTransCommand command = new ViewTransCommand(ability, t);
		command.execute();
		verify(ability).viewTransaction(t).getISBN().equals("9");
	}

}
