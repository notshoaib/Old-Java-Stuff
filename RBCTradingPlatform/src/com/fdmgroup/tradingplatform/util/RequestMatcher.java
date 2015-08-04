package com.fdmgroup.tradingplatform.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.fdmgroup.jdbc.DBConnector;
import com.fdmgroup.jdbc.SQLProperties;

public class RequestMatcher {
	
	private CallableStatement cs;
	private Properties properties;
	private Connection connection;
	private String path = getClass().getClassLoader().getResource("/").getPath().replace("%20", " ");
	
	public RequestMatcher() {
		try {
			properties = SQLProperties
					.getProperties(path+"properties/dml.properties");
			connection = DBConnector.getConnection();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public void matchTrades(){
		try {
			cs=connection.prepareCall("{call RequestPlatform..ProcessRequests()}");
			cs.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	
				
		
		
		
	}

}
