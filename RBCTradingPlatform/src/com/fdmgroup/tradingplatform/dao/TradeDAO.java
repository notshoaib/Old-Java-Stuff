 //package com.fdmgroup.tradingplatform.dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Properties;
//
//import com.fdmgroup.jdbc.DBConnector;
//import com.fdmgroup.jdbc.SQLProperties;
//import com.fdmgroup.tradingplatform.pojo.Account;
//import com.fdmgroup.tradingplatform.pojo.Trade;
//
//public class TradeDAO implements ICrud<Trade, Boolean, String>{
//
//	private Connection connection;
//	private Properties properties;
//	private ResultSet rs;
//	
//	public TradeDAO(){
//		
//		try {
//			properties=SQLProperties.getProperties("H:/RBC workspace/RBC Trading Platform/dml.properties");
//			connection=DBConnector.getConnection();
//		} catch (ClassNotFoundException e) {
//			
//			e.printStackTrace();
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public Boolean create(Trade trade) {
//		
//		String query = properties.getProperty("CreateTrade");
//	    
//		try {
//			PreparedStatement statement = connection.prepareStatement(query);
//			statement.setString(1, );
//			statement.setString(2, );
//			statement.setInt(3, );
//			
//			
//			statement.execute();
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//			return false;
//		}
//		
//		return true;
//	}
//
//	@Override
//	public Trade read(Integer tradeId) {
//		String query = properties.getProperty("ReadTrade");
//		String password = null;
//		int shareholderId = 0;
//		try {
//			PreparedStatement statement = connection.prepareStatement(query);
//			statement.setString(1, username);
//			rs = statement.executeQuery();
//			while (rs.next()) {
//				username=rs.getString(1);
//				password = rs.getString(2);
//				shareholderId = rs.getInt(3);
//
//			}
//
//		} catch (SQLException e) {
//			System.out.println("problem");
//			e.printStackTrace();
//		}
//
//		return new Account(username, password, shareholderId);
//	}
//
//	@Override
//	public Boolean update(Trade tradeId) {
//		String query = properties.getProperty("UpdateAccount");
//	    
//		try {
//			PreparedStatement statement = connection.prepareStatement(query);
//			statement.setString(1, account.getUsername());
//			statement.setString(2, account.getPassword());
//			statement.setInt(3, account.getShareHolderId());
//			
//			
//			statement.execute();
//			
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//			return false;
//		}
//		
//		return true;
//	}
//
//	@Override
//	public Boolean delete(Integer tradeId) {
//		String query = properties.getProperty("DeleteAccount");
//	    
//		try {
//			PreparedStatement statement = connection.prepareStatement(query);	
//			statement.setString(1, username);
//			statement.execute();
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//			return false;
//		}
//		
//		return true;
//	}
//
//}
