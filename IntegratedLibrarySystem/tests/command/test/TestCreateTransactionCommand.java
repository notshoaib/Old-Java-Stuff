package command.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.fdmgroup.IBS.Book;
import com.fdmgroup.IBS.command.CreatePatronCommand;
import com.fdmgroup.IBS.command.CreateTransactionCommand;
import com.fdmgroup.IBS.command.EmployeeAbility;
import com.fdmgroup.IBS.users.Patron;

public class TestCreateTransactionCommand {

	@Test
	public void test() throws Exception {

		EmployeeAbility ability = mock(EmployeeAbility.class);
		Book b = mock(Book.class);
		Patron p = mock(Patron.class);
		CreateTransactionCommand command = new CreateTransactionCommand(
				ability, p.getUserID(), b.getISBN());
		command.execute();
		verify(ability).CreateTransaction(p.getUserID(), b.getISBN());
	}
}
