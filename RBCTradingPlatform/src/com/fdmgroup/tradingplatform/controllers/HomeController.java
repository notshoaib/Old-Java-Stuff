package com.fdmgroup.tradingplatform.controllers;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.fdmgroup.tradingplatform.actions.LoginAction;
import com.fdmgroup.tradingplatform.actions.ViewRequests;
import com.fdmgroup.tradingplatform.dao.AccountDAO;
import com.fdmgroup.tradingplatform.dao.RequestDAO;
import com.fdmgroup.tradingplatform.enums.RequestBuySellType;
import com.fdmgroup.tradingplatform.enums.TimeInForce;
import com.fdmgroup.tradingplatform.pojo.Account;
import com.fdmgroup.tradingplatform.pojo.Company;
import com.fdmgroup.tradingplatform.pojo.Request;
import com.fdmgroup.tradingplatform.pojo.Trade;
import com.fdmgroup.tradingplatform.util.CompanyReader;
import com.fdmgroup.tradingplatform.util.ShareholderGenerator;
import com.fdmgroup.tradingplatform.util.StockExReader;
import com.fdmgroup.tradingplatform.util.TradeReader;

@Controller
@SessionAttributes("userAccount")
public class HomeController {
	
	private AccountDAO accountDAO;

	@RequestMapping(value = {"", "/"},method = RequestMethod.GET)
	public String welcomeHome(Model model) {
		model.addAttribute(new Account());
		return "tradingplatformhome";
	}

	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String Login(Account account, Model model) {

		accountDAO = new AccountDAO();
		account=accountDAO.read(account.getUsername());
		
		LoginAction loginAction = new LoginAction(accountDAO, account);
		if (loginAction.login()) {
			model.addAttribute("userAccount", account);
			model.addAttribute("userLogged", "true");

			return "tradingplatformhome";
		} else {
			return "errorpage";
		}
	}

	@RequestMapping(value = "/createRequest", method = RequestMethod.GET)
	public String CreateRequest(Model model) {
		CompanyReader compReader = new CompanyReader();
		List<Company> companyList = compReader.readAllCompanies();
		model.addAttribute("compList", companyList);
		model.addAttribute("timeInForce", Arrays.asList(TimeInForce.values()));
		model.addAttribute("buySell",Arrays.asList(RequestBuySellType.values()));
		model.addAttribute(new Request());
		return "traderequest";
	}

	@RequestMapping(value = "/completeRequest", method = RequestMethod.POST)
	public String CompleteRequest(@ModelAttribute("newRequest")Request newRequest,
			@ModelAttribute("userAccount") Account account,
			HttpServletRequest request, Model model) {
		
		RequestDAO requestDao = new RequestDAO();
		StockExReader stexreader = new StockExReader();
		Long date = (Long)request.getAttribute("dateLong");
		
		newRequest.setRequestDate(new java.sql.Timestamp(date));
		newRequest.setShareholder_id(account.getShareHolderId());
		newRequest.setStockExId(stexreader.getStockExId(newRequest.getStock_id()));
		requestDao.create(newRequest);
		model.addAttribute(new Request());
		model.addAttribute("success","success");
		return "traderequest";
	}

//	@RequestMapping(value = "/register", method = RequestMethod.GET)
//	public String register(Model model) {
//		model.addAttribute("account", new Account());
//		model.addAttribute("register", "true");
//		return "tradingplatformhome";
//	}
	
	@RequestMapping(value = "/completeRegistration", method = RequestMethod.POST)
	public String completeRegistration(@ModelAttribute("newUser")Account newUser, Model model){
		accountDAO = new AccountDAO();
		int id = ShareholderGenerator.createShareholder();
		if(newUser.getUsername()
				.equals((accountDAO
						.read(newUser
								.getUsername()).getUsername()))){
			model.addAttribute("account", new Account());
			model.addAttribute("register", "true");
			model.addAttribute("errorMessage","Username already used, please try again");
			return "tradingplatformhome";
		}
		newUser.setShareHolderId(id);
		accountDAO.create(newUser);
		model.addAttribute("first",newUser.getUsername());
		return "PostRegisterJSP";
	}

	@RequestMapping(value = "/viewtrades", method = RequestMethod.GET)
	public String viewTrades(@ModelAttribute("userAccount") Account account,
			Model model) {
		TradeReader tradeReader = new TradeReader();
		List<Trade> tradeList = tradeReader
				.readAllTrades(account.getUsername());
		model.addAttribute("tradelist", tradeList);

		return "viewtrades";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(HttpSession session, Model model) {
		session.invalidate();
		model.asMap().clear();
		Account account = new Account();
		model.addAttribute(account);
		return "tradingplatformhome";
	}

	@RequestMapping(value = "/outstandingRequest", method = RequestMethod.GET)
	public String viewOutstandingRequest(@ModelAttribute("userAccount") Account account, Model model) {
		ViewRequests viewRequests = new ViewRequests(new RequestDAO(),
				account.getShareHolderId());
		model.addAttribute("requestlist", viewRequests.viewRequest());
		return "outstandingrequestpage";
	}
}
