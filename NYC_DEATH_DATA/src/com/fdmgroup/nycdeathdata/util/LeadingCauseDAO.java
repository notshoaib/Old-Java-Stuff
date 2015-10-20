package com.fdmgroup.nycdeathdata.util;

import java.util.HashSet;

public class LeadingCauseDAO {

	
	private static HashSet<LeadingCause> leadingCauseSet = new HashSet<LeadingCause>();
	
	
	
	public static void create(LeadingCause leadingCause){
		leadingCauseSet.add(leadingCause);
	}
}
