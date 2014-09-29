import static org.junit.Assert.*;

import org.junit.Test;


public class RoutePlannerTest {

	@Test
	public void testRoute() {
		RoutePlanner routePlanner=new RoutePlanner();
		assertTrue(routePlanner.getClass().equals("Take the E train"));
		
	}

}
