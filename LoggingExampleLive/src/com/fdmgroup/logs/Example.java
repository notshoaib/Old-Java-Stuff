package com.fdmgroup.logs;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class Example {

	static Logger log = Logger.getLogger(Example.class);

	static {
		//Basic Configuration
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.DEBUG); 
		
		//Properties File
		// PropertyConfigurator.configure("log4j.properties");
		//XML File
		//DOMConfigurator.configure("log4j.xml");

		

	}

	public static void main(String[] args) {

		log.trace("Entered Main Method");
		log.debug("DEBUG MESSAGE!");
		log.debug("Check if everything is okay");
		log.info("Continuing with main execution");
		log.warn("Warning! Something might be wrongs");
		log.error("Hello error");
		log.fatal("Everything died");

	}
}
