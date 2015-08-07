package com.fdmgroup.tradingplatform.actions;

import com.fdmgroup.tradingplatform.dao.AccountDAO;
import com.fdmgroup.tradingplatform.pojo.Account;

public class LoginAction {
	
	private AccountDAO accountDAO;
	private Account account;
	
	public LoginAction(AccountDAO accountDAO,Account account){
		this.account=account;
		this.accountDAO=accountDAO;
	}
	
	public boolean login(){
		Account storedAccount=accountDAO.read(account.getUsername());
		if(storedAccount.verifyLogin(account)){
			return true;
		}
		else
			return false;
	}

}
