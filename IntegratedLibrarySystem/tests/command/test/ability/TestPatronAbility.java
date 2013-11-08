package command.test.ability;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fdmgroup.DTO.DTO;
import com.fdmgroup.DTO.TransDTO;
import com.fdmgroup.IBS.Book;
import com.fdmgroup.IBS.NoLoadedDataException;
import com.fdmgroup.IBS.NoSuchRecordException;
import com.fdmgroup.IBS.Transaction;
import com.fdmgroup.IBS.patroncommand.PatronAbility;
import com.fdmgroup.IBS.users.Patron;
import com.fdmgroup.rammem.RamTransactionDatabase;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
public class TestPatronAbility {
	
	@Test
	public void testEvaluateViewCatalog() {
		PatronAbility ability=new PatronAbility();
		ability.viewCatalogCommand();
	}
	
	@Test
	public void testEvaluateViewTransaction() throws NoLoadedDataException {
		RamTransactionDatabase ram=new RamTransactionDatabase();
		Patron p=new Patron("Bob", "Erik");
		Book b=new Book("123","Hamlet");
		Transaction t=new Transaction(p.getUserID(),b.getISBN());
		ram.create(t);
		PatronAbility ability=new PatronAbility();
		
		DTO dto=ability.viewTransactions(ram, p);
		
		assertTrue(dto.getFirstName().equals("Bob")
				&&dto.getTransID()==t.getTransID());
	
		
	}

}
