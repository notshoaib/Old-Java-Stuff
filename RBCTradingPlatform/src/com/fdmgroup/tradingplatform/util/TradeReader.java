package com.fdmgroup.tradingplatform.util;

import java.sql.Connection;
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
	
	public TradeReader(){
		
		try {
			properties=SQLProperties.getProperties("H:/RBC workspace/RBCTradingPlatform/dml.properties");
			connection=DBConnector.getConnection();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public List<Trade> readAllTrades(Integer shareholderId){
		List<Trade> tradeList= new ArrayList<Trade>();
		String query = properties.getProperty("ReadTrades");
		
		try {
			PreparedStatement preparedStatment = connection.prepareStatement(query);
			ResultSet rs=preparedStatment.executeQuery();
			
			while(rs.next()){
				Trade trade = new Trade();
				trade.setStock_ex_id(rs.getInt(1));
				trade.setStock_id(rs.getInt(2));
				trade.setTransactionTime(rs.getDate(3));
				trade.setShares(rs.getInt(4));
				trade.setShare_price(rs.getDouble(5));
				trade.setPrice_total(rs.getDouble(6));
				trade.setBuyer_id(rs.getInt(7));
				trade.setSeller_id(rs.getInt(8));
				
				tradeList.add(trade);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}		
		
		
		return tradeList;
		
	}
}