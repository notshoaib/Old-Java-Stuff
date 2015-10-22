package com.fdmgroup.nycdeathdata.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestLeadingCauseDAO {
	
	
	
	
	@BeforeClass
	public static void setUp(){
		DOMXMLParser domxmlParser = new DOMXMLParser();
		Collection<LeadingCause> leadingCauses = domxmlParser.buildDOMTree();
		LeadingCauseDAO leadingCauseDAO = new LeadingCauseDAO();
		leadingCauseDAO.createAll(leadingCauses);
	}

	@Test
	public void testDAOCountMethod() {
		LeadingCauseDAO leadingCauseDAO = new LeadingCauseDAO();
		
		assertTrue(leadingCauseDAO.countAggregate("CHRONIC LIVER DISEASE AND CIRRHOSIS", 2007)
				.equals(new BigDecimal(40)));
	}

}
