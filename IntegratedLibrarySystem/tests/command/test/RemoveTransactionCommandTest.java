package command.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.IBS.command.EmployeeAbility;
import com.fdmgroup.IBS.command.RemoveTransactionCommand;
import com.fdmgroup.rammem.RamTransactionDatabase;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class RemoveTransactionCommandTest {

	@Test
	public void testEvaluateRemoveTransaction() {
		RamTransactionDatabase ram = mock(RamTransactionDatabase.class);
		Transaction t = mock(Transaction.class);
		when(t.getTransID()).thenReturn(9);
		EmployeeAbility ability = mock(EmployeeAbility.class);
		RemoveTransactionCommand rtc = new RemoveTransactionCommand(ability, 9,
				ram);
		rtc.execute();
		verify(ability).RemoveTransaction(9, ram);

	}

}
