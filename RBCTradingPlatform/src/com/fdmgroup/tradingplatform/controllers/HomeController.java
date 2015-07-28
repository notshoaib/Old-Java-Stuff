package com.fdmgroup.tradingplatform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fdmgroup.tradingplatform.actions.LoginAction;
import com.fdmgroup.tradingplatform.dao.AccountDAO;
import com.fdmgroup.tradingplatform.pojo.Account;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomeHome(Model model) {
		Account account = new Account();
		model.addAttribute(account);
		return "tradingplatformhome";
	}
	
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String Login(Account account) {
		System.out.println(account.getUsername());
		AccountDAO accountDAO = new AccountDAO();
		LoginAction loginAction = new LoginAction(accountDAO,account);
		if(loginAction.Login()){
		return "homepage";
		}
		else{
		return "errorpage";
		}
	}

}
