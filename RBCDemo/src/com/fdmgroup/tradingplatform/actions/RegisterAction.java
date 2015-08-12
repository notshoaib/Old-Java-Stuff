package com.fdmgroup.tradingplatform.actions;

import com.fdmgroup.tradingplatform.dao.AccountDAO;
import com.fdmgroup.tradingplatform.pojo.Account;

public class RegisterAction {

	private AccountDAO accountDAO;
	private Account account;

	public RegisterAction(AccountDAO accountDAO, Account account) {
		this.accountDAO = accountDAO;
		this.account = account;
	}

	public boolean register() {

		return accountDAO.create(account);

	}

}
