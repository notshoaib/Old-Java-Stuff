package com.fdmgroup.dtos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserDTOTest {
	
	
	private UserDTO user;
	
	@Before
	public void setUp(){
		this.user = new UserDTO();
	}

	@Test
	public void testGettersAndSetters() {
		user.setUsername("Mohamad");
		assertEquals(user.getUsername(),"Mohamad");
		
	}

}
