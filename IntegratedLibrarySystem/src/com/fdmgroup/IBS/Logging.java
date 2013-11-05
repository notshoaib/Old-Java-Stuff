package com.fdmgroup.IBS;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logging {
	
	public static Logger log = Logger.getLogger("Example");

	static {
		PropertyConfigurator.configure("log4j.properties");
	}
	
}
