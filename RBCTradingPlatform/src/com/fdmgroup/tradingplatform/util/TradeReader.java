package com.fdmgroup.tradingplatform.util;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.fdmgroup.jdbc.DBConnector;
import com.fdmgroup.jdbc.SQLProperties;
import com.fdmgroup.tradingplatform.pojo.Trade;

public class TradeReader {

	private Connection connection;
	private Properties properties;
	private ResultSet rs;
	private String path = getClass().getClassLoader().getResource("/").getPath().replace("%20", " ");
	
	public TradeReader(){
		
		try {
			properties=SQLProperties.getProperties(path+"properties/dml.properties");
			connection=DBConnector.getConnection();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public List<Trade> readAllTrades(String username){
		
		int shareholderId=getShareholderId(username);
		List<Trade> tradeList= new ArrayList<Trade>();
		String query = properties.getProperty("ReadTrades");
		
		
		
		try {
			PreparedStatement preparedStatment = connection.prepareStatement(query);
			preparedStatment.setInt(1, shareholderId);
			preparedStatment.setInt(2, shareholderId);
			rs=preparedStatment.executeQuery();
			
			while(rs.next()){
				Trade trade = new Trade();
				trade.setStockId (rs.getInt(1));
				trade.setStockExId(rs.getInt(2));
				trade.setTransactionTime(rs.getTimestamp(3));
				trade.setShares(rs.getInt(4));
				trade.setSharePrice(rs.getDouble(5));
				trade.setPriceTotal(rs.getDouble(6));
				trade.setBuyerId(rs.getInt(7));
				trade.setSellerId(rs.getInt(8));
				
				tradeList.add(trade);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}		
		
		
		return tradeList;
		
	}
	
	private Integer getShareholderId(String username){
	
	    
		try {
			PreparedStatement statement = connection.prepareStatement("Select shareholder_id from RequestPlatform..accounts where username=?");	
			statement.setString(1, username);
			ResultSet rs=statement.executeQuery();
			rs.next();
			return rs.getInt(1);
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		return null;
		
		
	}
}
