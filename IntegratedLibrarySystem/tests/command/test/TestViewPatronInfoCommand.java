package command.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.Test;

import com.fdmgroup.IBS.command.Command;
import com.fdmgroup.IBS.command.EmployeeAbility;
import com.fdmgroup.IBS.command.ViewPatronInfoCommand;
import com.fdmgroup.IBS.users.Patron;

public class TestViewPatronInfoCommand {

	@Test
	public void testEvaulateViewPatronCommand() {
		EmployeeAbility ability= mock(EmployeeAbility.class);
		Patron p=mock(Patron.class);
		ViewPatronInfoCommand vpic=new ViewPatronInfoCommand(ability,p);
		vpic.execute();
		verify(ability).viewPatronInfo(p);
		}
	
	@Test
	public void testEvaulateFailViewPatronCommand() {
		EmployeeAbility ability= mock(EmployeeAbility.class);
		Patron p=mock(Patron.class);
		Patron c=mock(Patron.class);
		ViewPatronInfoCommand vpic=new ViewPatronInfoCommand(ability,p);
		vpic.execute();
		verify(ability,org.mockito.Mockito.times(0)).viewPatronInfo(c);
		}

}
