package com.fdmgroup.nycdeathdata.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.nycdeathdata.entities.YearSummaryC;
import com.fdmgroup.nycdeathdata.util.LeadingCause;
import com.fdmgroup.nycdeathdata.util.LeadingCauseDAO;
import com.fdmgroup.nycdeathdata.util.Year;
import com.fdmgroup.nycdeathdata.util.YearSummaryReader;

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
	public String lineChart(Model model) throws SQLException {
		
		LeadingCauseDAO leadingCauseDAO = new LeadingCauseDAO();
//		List<LeadingCause> list =leadingCauseDAO.readAll();
		
		Map<Integer, List<YearSummaryC>> map = new HashMap<Integer,List<YearSummaryC>>();
		YearSummaryReader ysr = new YearSummaryReader();
		
		List<Integer> yearList = new ArrayList<Integer>();
		yearList.add(2007);
		yearList.add(2008);
		yearList.add(2009);
		yearList.add(2010);
		yearList.add(2011);
		
		
		for(int year: yearList){
			List<YearSummaryC> list =ysr.readAllYearSummary(year);
			Collections.sort(list);
			map.put(year,list);
		}
		
		
				
		
	
	
		model.addAttribute("map",map);
		model.addAttribute("years", yearList);
		

		return "linechart";
	}

}
