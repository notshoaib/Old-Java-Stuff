package command.test.patron;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fdmgroup.IBS.patroncommand.PatronAbility;
import com.fdmgroup.IBS.patroncommand.ViewTransHistoryCommand;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.rammem.RamTransactionDatabase;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
public class TestViewTransHistory {

	@Test
	public void testEvaluateViewTrans() {
		RamTransactionDatabase ram=mock(RamTransactionDatabase.class);
		Patron p=mock(Patron.class);
		PatronAbility ability=mock(PatronAbility.class);
		
		ViewTransHistoryCommand command= new ViewTransHistoryCommand(ram,ability,p);
		command.execute();
		verify(ability).viewTransactions(ram, p);
		
	}

}
