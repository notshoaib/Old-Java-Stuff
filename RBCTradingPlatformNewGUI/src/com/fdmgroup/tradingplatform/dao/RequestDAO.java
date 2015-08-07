package com.fdmgroup.tradingplatform.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.fdmgroup.jdbc.DBConnector;
import com.fdmgroup.jdbc.SQLProperties;
import com.fdmgroup.tradingplatform.enums.RequestBuySellType;
import com.fdmgroup.tradingplatform.enums.RequestStatus;
import com.fdmgroup.tradingplatform.enums.TimeInForce;
import com.fdmgroup.tradingplatform.pojo.Request;

public class RequestDAO implements ICrud<Request, Boolean, Integer>{ 

	private Connection connection;
	private Properties properties;
	private ResultSet rs;
	private String path = getClass().getClassLoader().getResource("/").getPath().replace("%20", " ");
	
	public RequestDAO(){
		
		try {
			properties=SQLProperties.getProperties(path + "dml.properties");
			connection=DBConnector.getConnection();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public Boolean create(Request request) {
		
		String query = properties.getProperty("CreateRequest");
	    
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, request.getShareholder_id());
			statement.setTimestamp(2, request.getRequestDate());;
			statement.setString(3, request.getRequestType().getStringValue());
			statement.setInt(4,request.getStockExId());
			statement.setInt(5,request.getStock_id());
			statement.setInt(6, request.getShares());
			statement.setInt(7, request.getMinimum_shares());
			statement.setString(8, request.getTimeInForce().getStringValue());
			
			if(request.getLimit_price()!=null){
				statement.setDouble(9, request.getLimit_price());
			}else{
				statement.setNull(9, java.sql.Types.DOUBLE);
			}
			
			if(request.getStop_price()!=null){
				statement.setDouble(10,request.getStop_price());
			}else{
				statement.setNull(10, java.sql.Types.DOUBLE);
			}
			
			statement.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public Request read(Integer requestId) {
		String query = properties.getProperty("ReadRequest");
		Integer shareholderId=null;
		java.util.Date requestDate=null;
		RequestBuySellType requestType=null;
		RequestStatus requestStatus=null;
		Integer stockExId=null;
		Integer stockId=null;
		Integer shares=null;
		Integer minimumShares=null;
		TimeInForce timeInForce=null;
		Double limitPrice=null;
		Double stopPrice=null;
		
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, requestId);
			rs = statement.executeQuery();
			while (rs.next()) {
				shareholderId=rs.getInt(1);
				requestDate= rs.getTime(2);
				requestType=RequestBuySellType.valueOf((rs.getString(3)));
				requestStatus=RequestStatus.valueOf(rs.getString(4));
				stockExId=rs.getInt(5);
				stockId=rs.getInt(6);
				shares=rs.getInt(7);
				minimumShares=rs.getInt(8);
				timeInForce=TimeInForce.getTimeInForce(rs.getString(9));
				limitPrice=rs.getDouble(10);
				stopPrice=rs.getDouble(11);

			}

		} catch (SQLException e) {
			System.out.println("problem");
			e.printStackTrace();
		}

		return new Request(requestId, shareholderId, new java.sql.Timestamp(requestDate.getTime()), requestType, requestStatus
				,stockExId, stockId,shares,minimumShares,timeInForce,limitPrice,stopPrice);
	}

	@Override
	public Boolean update(Request request) {
		String query = properties.getProperty("UpdateRequest");
	    
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setTimestamp(1, request.getRequestDate());
			statement.setString(2, request.getRequestType().getStringValue());
			statement.setInt(3,request.getStockExId());
			statement.setInt(4,request.getStock_id());
			statement.setInt(5, request.getShares());
			statement.setInt(6, request.getMinimum_shares());
			statement.setString(7, request.getTimeInForce().getStringValue());
			
			if(request.getLimit_price()!=null){
				statement.setDouble(8, request.getLimit_price());
			}else{
				statement.setNull(8, java.sql.Types.DOUBLE);
			}
			
			if(request.getStop_price()!=null){
				statement.setDouble(9,request.getStop_price());
			}else{
				statement.setNull(9, java.sql.Types.DOUBLE);
			}					
			statement.setInt(10,request.getRequest_id());
			
			statement.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public Boolean delete(Integer requestId) {
		String query = properties.getProperty("DeleteRequest");
	    
		try {
			PreparedStatement statement = connection.prepareStatement(query);	
			statement.setInt(1, requestId);
			statement.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public List<Request> readAll(Integer shareholderId) {
			List<Request> allRequests = new ArrayList<Request>();
			String query = properties.getProperty("ReadOutstandingRequest");
			Integer requestId=null;
			java.util.Date requestDate=null;
			RequestBuySellType requestType=null;
			RequestStatus requestStatus=null;
			Integer stockExId=null;
			Integer stockId=null;
			Integer shares=null;
			Integer minimumShares=null;
			TimeInForce timeInForce=null;
			Double limitPrice=null;
			Double stopPrice=null;
			
			try {
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setInt(1, shareholderId);
				rs = statement.executeQuery();
				while (rs.next()) {
					requestId=rs.getInt(1);
					requestDate= rs.getTime(2);
					requestType=RequestBuySellType.valueOf((rs.getString(3)));
					requestStatus=RequestStatus.valueOf(rs.getString(4));
					stockExId=rs.getInt(5);
					stockId=rs.getInt(6);
					shares=rs.getInt(7);
					minimumShares=rs.getInt(8);
					timeInForce=TimeInForce.getTimeInForce(rs.getString(9));
					limitPrice=rs.getDouble(10);
					stopPrice=rs.getDouble(11);
					allRequests.add( new Request(requestId, shareholderId, new java.sql.Timestamp(requestDate.getTime()), requestType, requestStatus
							,stockExId, stockId,shares,minimumShares,timeInForce,limitPrice,stopPrice));

				}

			} catch (SQLException e) {
				System.out.println("problem");
				e.printStackTrace();
			}

			return allRequests;
			
		}
	}

