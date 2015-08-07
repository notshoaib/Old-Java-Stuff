package com.fdmgroup.tradingplatform.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.fdmgroup.jdbc.DBConnector;
import com.fdmgroup.jdbc.SQLProperties;

public class PortfolioReader {

	private Connection connection;
	private Properties properties;
	private ResultSet rs;
	private String path = getClass().getClassLoader().getResource("/").getPath().replace("%20", " ");

	public PortfolioReader() {
		try {
			properties = SQLProperties
					.getProperties(path+"dml.properties");
			connection = DBConnector.getConnection();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	

}
