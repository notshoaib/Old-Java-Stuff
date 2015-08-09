package com.fdmgroup.tradingplatform.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fdmgroup.jdbc.DBConnector;

public class StockExReader {
	private Connection connection;
	private ResultSet rs;

	public StockExReader() {

		try {
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
		rs=statement.executeQuery();
		rs.next();
		return rs.getInt(1);
	} catch (SQLException e) {
		
		e.printStackTrace();
		
	}
	return null;
	}
	
	
}
