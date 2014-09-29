package com.fdmgroup.routeplanner;
import static org.junit.Assert.*;

import org.junit.Test;

import com.fdmgroup.routeplanner.RoutePlanner;


public class RoutePlannerTest {

	@Test
	public void testRoute() {
		RoutePlanner routePlanner=new RoutePlanner();
		assertTrue(routePlanner.getClass().equals("Take the E train"));
		
	}

}
