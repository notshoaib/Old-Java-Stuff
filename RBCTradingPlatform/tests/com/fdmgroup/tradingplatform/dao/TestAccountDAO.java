package com.fdmgroup.tradingplatform.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.tradingplatform.pojo.Account;

public class TestAccountDAO {
	Account account;
	ICrud<Account, Boolean, String> accountDAO;
	
	@Before
	public void setUp(){
		account = new Account();
		accountDAO = new AccountDAO();
		account.setPassword("password");
		account.setShareHolderId(1);
		account.setUsername("mosalimi");
		accountDAO.create(account);
	}

	@Test
	public void testCreatingAccount() {		
		Account account2= new Account("dummy2","password",10);
		assertTrue(accountDAO.create(account2));
		accountDAO.delete("dummy2");
	}
	
	@Test
	public void testUpdatingAccount(){
		account.setPassword("newpass");
		accountDAO.update(account);
		String username=account.getUsername();
		Account readAccount=accountDAO.read(username);
		assertTrue(readAccount.getPassword().equals("newpass"));
		
	}
	
//	@After
//	public void tearDown(){
//		accountDAO.delete("mosalimi");
//	}

}
