package command.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import org.junit.Test;

import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.IBS.command.CreatePatronCommand;
import com.fdmgroup.IBS.command.EmployeeAbility;
import com.fdmgroup.IBS.command.ViewTransCommand;

public class TestViewTransCommand {

	@Test
	public void testEvaulateViewTrans() {
		EmployeeAbility ability = mock(EmployeeAbility.class);
		Transaction t=mock (Transaction.class);
		ViewTransCommand command = new ViewTransCommand(ability,t);
		command.execute();
		verify(ability).viewTransaction(t);
	}
	
	

}
