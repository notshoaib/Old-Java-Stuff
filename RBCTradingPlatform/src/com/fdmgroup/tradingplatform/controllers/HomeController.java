package com.fdmgroup.tradingplatform.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.fdmgroup.tradingplatform.actions.LoginAction;
import com.fdmgroup.tradingplatform.dao.AccountDAO;
import com.fdmgroup.tradingplatform.pojo.Account;
import com.fdmgroup.tradingplatform.pojo.Company;
import com.fdmgroup.tradingplatform.pojo.Request;
import com.fdmgroup.tradingplatform.pojo.Trade;
import com.fdmgroup.tradingplatform.util.CompanyReader;
import com.fdmgroup.tradingplatform.util.TradeReader;

@Controller
@SessionAttributes("userAccount")
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomeHome(Model model) {
		Account account = new Account();
		model.addAttribute(account);
		return "tradingplatformhome";
	}
	
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String Login(Account account, Model model) {
		
		AccountDAO accountDAO = new AccountDAO();
		LoginAction loginAction = new LoginAction(accountDAO,account);
		if(loginAction.login()){
			model.addAttribute("userAccount", account);
		
		return "homepage";
		}
		else{
		return "errorpage";
		}
	}
	
	@RequestMapping(value = "/CreateRequest", method = RequestMethod.GET)
	public String CreateRequest(Model model) {
		Request request = new Request();
		CompanyReader compReader = new CompanyReader();
		List<Company> companyList = compReader.readAllCompanies();
		model.addAttribute("compList",companyList);
		model.addAttribute(request);
		return "traderequest";
		}
	
	@RequestMapping(value = "/CompleteRequest", method = RequestMethod.POST)
	public String CompleteRequest(Model model) {
		Request request = new Request();
		model.addAttribute(request);
		return "traderequest";
		}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		Account account = new Account();
		model.addAttribute(account);
		return "registerpage";
		}
	
	@RequestMapping(value = "/viewtrades", method = RequestMethod.GET)
	public String viewTrades(@ModelAttribute("userAccount") Account account,Model model) {
		TradeReader tradeReader = new TradeReader();
		List<Trade> tradeList=tradeReader.readAllTrades(account.getUsername());
		model.addAttribute("tradelist", tradeList);
		
		return "viewtrades";
		}


}
