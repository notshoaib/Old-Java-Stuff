package command.test;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.fdmgroup.IBS.command.Command;
import com.fdmgroup.IBS.command.EmployeeAbility;
import com.fdmgroup.IBS.command.ViewCatalogCommand;

public class TestViewOPAC {

	@Test
	public void testEvaulateViewCatalog() {
		EmployeeAbility ability=mock(EmployeeAbility.class);
		ViewCatalogCommand vcc=new ViewCatalogCommand(ability);
		vcc.execute();
		verify(ability).viewCatalogCommand() ;
	}

}
