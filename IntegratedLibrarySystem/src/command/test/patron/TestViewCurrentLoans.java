package command.test.patron;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fdmgroup.IBS.patroncommand.PatronAbility;
import com.fdmgroup.IBS.patroncommand.ViewCurrentLoansCommand;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.rammem.RamTransactionDatabase;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TestViewCurrentLoans {

	@Test
	public void testEvaluateCurrentLoansCommand() {

		PatronAbility ability = mock(PatronAbility.class);
		Patron p = mock(Patron.class);
		RamTransactionDatabase ram = mock(RamTransactionDatabase.class);
		ViewCurrentLoansCommand command = new ViewCurrentLoansCommand(ability,
				ram, p);
		command.execute();
		verify(ability).viewCurrentloans(ram, p);
	}

}
