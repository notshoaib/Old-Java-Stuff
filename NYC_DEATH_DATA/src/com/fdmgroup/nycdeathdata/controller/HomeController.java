package com.fdmgroup.nycdeathdata.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.nycdeathdata.util.LeadingCause;
import com.fdmgroup.nycdeathdata.util.LeadingCauseDAO;
import com.fdmgroup.nycdeathdata.util.Year;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String rootPage(Model model) {
//		DOMXMLParser domxmlParser = new DOMXMLParser();
//		Collection<LeadingCause> leadingCauses = domxmlParser.buildDOMTree();
		LeadingCauseDAO leadingCauseDAO = new LeadingCauseDAO();
//		leadingCauseDAO.createAll(leadingCauses);
		model.addAttribute("dataset", leadingCauseDAO.readAll());
		

		return "index";
	}
	
	@RequestMapping("/linechart")
	public String lineChart(Model model) {
		
		LeadingCauseDAO leadingCauseDAO = new LeadingCauseDAO();
		List<LeadingCause> list =leadingCauseDAO.readAll();
		
		Map<Integer, ArrayList<LeadingCause>> map = new HashMap<Integer,ArrayList<LeadingCause>>();
		
		map.put(2007, new ArrayList<LeadingCause>());
		map.put(2008, new ArrayList<LeadingCause>());
		map.put(2009, new ArrayList<LeadingCause>());
		map.put(2010, new ArrayList<LeadingCause>());
		map.put(2011, new ArrayList<LeadingCause>());
		
		
		for(LeadingCause leadingCause: list){
		Year year = leadingCauseDAO.countAggregate(leadingCause.getCauseOfDeath()
				, leadingCause.getYear());
	//	map.put(year.)
		}
		

		return "linechart";
	}

}
