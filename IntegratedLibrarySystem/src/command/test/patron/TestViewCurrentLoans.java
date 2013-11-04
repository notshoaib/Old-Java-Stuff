package command.test.patron;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fdmgroup.IBS.NoLoadedDataException;
import com.fdmgroup.IBS.NoSuchRecordException;
import com.fdmgroup.IBS.patroncommand.PatronAbility;
import com.fdmgroup.IBS.patroncommand.ViewCurrentLoansCommand;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.rammem.RamTransactionDatabase;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TestViewCurrentLoans {

	@Test
	public void testEvaluateCurrentLoansCommand() throws NoSuchRecordException {

		PatronAbility ability = mock(PatronAbility.class);
		Patron p = mock(Patron.class);
		RamTransactionDatabase ram = mock(RamTransactionDatabase.class);
		ViewCurrentLoansCommand command = new ViewCurrentLoansCommand(ability,
				ram, p);
		when(p.isGuest()).thenReturn(false);
		command.execute();
		try {
			verify(ability).viewCurrentloans(ram, p);
		} catch (NoSuchRecordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(expected = NoSuchRecordException.class)
	public void testEvaluateCurrentLoansGuestException()
			throws NoSuchRecordException {

		PatronAbility ability = mock(PatronAbility.class);
		Patron p = mock(Patron.class);
		RamTransactionDatabase ram = mock(RamTransactionDatabase.class);
		ViewCurrentLoansCommand command = new ViewCurrentLoansCommand(ability,
				ram, p);
		when(p.isGuest()).thenReturn(true);
		command.execute();

		verify(ability).viewCurrentloans(ram, p);

	}

}
