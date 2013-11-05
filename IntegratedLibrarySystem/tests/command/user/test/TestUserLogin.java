package command.user.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fdmgroup.IBS.users.Employee;
import com.fdmgroup.IBS.users.SystemAdmin;
import com.fdmgroup.IBS.users.User;

public class TestUserLogin {

	@Test
	public void testEvaluateLoginMethod() {
		
		User user1= new Employee("Bob", "Jones");
		user1.signON();
		assertTrue(user1.isLoggedIn());
	}
	
	@Test
	public void testEvaluateLoggedOff() {
		
		SystemAdmin admin1= new SystemAdmin("Bob", "Jones");
		admin1.signON();
		admin1.signOFF();
		assertTrue(!admin1.isLoggedIn());
	}

}
