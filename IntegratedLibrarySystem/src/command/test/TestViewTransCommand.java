package command.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import com.fdmgroup.IBS.command.CreatePatronCommand;
import com.fdmgroup.IBS.command.EmployeeAbility;
import com.fdmgroup.IBS.command.ViewTransCommand;

public class TestViewTransCommand {

	@Test
	public void test() {
		EmployeeAbility ability = mock(EmployeeAbility.class);
		ViewTransCommand command = new ViewTransCommand(ability,"John");
	}

}
