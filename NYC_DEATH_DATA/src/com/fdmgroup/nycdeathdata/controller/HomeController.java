package com.fdmgroup.nycdeathdata.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		
		Map<Integer, ArrayList<Year>> map = new HashMap<Integer,ArrayList<Year>>();
		
		map.put(2007, new ArrayList<Year>());
		map.put(2008, new ArrayList<Year>());
		map.put(2009, new ArrayList<Year>());
		map.put(2010, new ArrayList<Year>());
		map.put(2011, new ArrayList<Year>());
		
		
		List<Integer> yearList = new ArrayList<Integer>();
		yearList.add(2007);
		yearList.add(2008);
		yearList.add(2009);
		yearList.add(2010);
		yearList.add(2011);
		
		Set<String> leadingCauseSet = new HashSet<String>();
		int counter=0;
		for(LeadingCause leadingCause: list){
			leadingCauseSet.add(leadingCause.getCauseOfDeath());
		}
		
		
		for(String leadingCause: leadingCauseSet){
			for(Integer theyear:yearList){
				Year year = leadingCauseDAO.countAggregate(leadingCause
				, theyear);
				map.get(theyear).add(year);
		counter=counter++;
		System.out.println(counter);
		}
		}
		
//		for(LeadingCause leadingCause: list){
//		Year year = leadingCauseDAO.countAggregate(leadingCause.getCauseOfDeath()
//				, leadingCause.getYear());
//		map.get(leadingCause.getYear()).add(year);
//		counter=counter++;
//		System.out.println(counter);
//		}
		
	
		model.addAttribute("map",map);
		model.addAttribute("years", yearList);
		

		return "linechart";
	}

}
