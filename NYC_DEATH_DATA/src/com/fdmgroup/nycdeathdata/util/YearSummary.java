package com.fdmgroup.nycdeathdata.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class YearSummary {

	private Map<Integer, List<LeadingCause>> yearSummary;
	



	public void addCause(int year, List<LeadingCause> leadingCauseList) {
		yearSummary.put(year, leadingCauseList);
	}

}
