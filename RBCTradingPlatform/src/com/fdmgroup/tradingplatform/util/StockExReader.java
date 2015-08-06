package com.fdmgroup.tradingplatform.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.fdmgroup.jdbc.DBConnector;
import com.fdmgroup.jdbc.SQLProperties;

public class StockExReader {
	private Connection connection;
	private Properties properties;
	private ResultSet rs;
	private String path = getClass().getClassLoader().getResource("/")
			.getPath().replace("%20", " ");

	public StockExReader() {

		try {
			properties = SQLProperties.getProperties(path + "dml.properties");
			connection = DBConnector.getConnection();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public Integer getStockExId(Integer companyId){
		
	try{
		PreparedStatement statement = connection.prepareStatement("SELECT stock_ex_id from RequestPlatform..stock_listing WHERE stock_id=?");	
		statement.setInt(1, companyId);
		ResultSet rs=statement.executeQuery();
		rs.next();
		return rs.getInt(1);
	} catch (SQLException e) {
		
		e.printStackTrace();
		
	}
	return null;
	}
	
	
}
