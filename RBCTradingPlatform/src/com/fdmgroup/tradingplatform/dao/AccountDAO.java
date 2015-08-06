package com.fdmgroup.tradingplatform.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import com.fdmgroup.jdbc.DBConnector;
import com.fdmgroup.jdbc.SQLProperties;
import com.fdmgroup.tradingplatform.pojo.Account;

public class AccountDAO implements ICrud<Account, Boolean, String> {
	
	private Connection connection;
	private Properties properties;
	private ResultSet rs;
	private String path = getClass().getClassLoader().getResource("").getPath().replace("%20", " ");
	
	public AccountDAO(){
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
	public Boolean create(Account account) {
		
		String query = properties.getProperty("CreateAccount");
	    
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, account.getUsername());
			statement.setString(2, account.getPassword());
			statement.setInt(3, account.getShareHolderId());
			
			
			statement.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public Account read(String username) {
		String query = properties.getProperty("ReadAccount");
		String password = null;
		Integer shareholderId = 0;
		String readUsername=null;
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, username);
			rs = statement.executeQuery();
			while (rs.next()) {
				readUsername=rs.getString(1);
				password = rs.getString(2);
				shareholderId = rs.getInt(3);

			}

		} catch (SQLException e) {
			System.out.println("problem");
			e.printStackTrace();
		}
		shareholderId=getShareholderId(username);
		return new Account(readUsername, password, shareholderId);
	}

	@Override
	public Boolean update(Account account) {
		String query = properties.getProperty("UpdateAccount");
	    
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, account.getUsername());
			statement.setString(2, account.getPassword());
			statement.setInt(3, account.getShareHolderId());
			
			
			statement.execute();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public Boolean delete(String username) {
		String query = properties.getProperty("DeleteAccount");
	    
		try {
			PreparedStatement statement = connection.prepareStatement(query);	
			statement.setString(1, username);
			statement.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public List<Account> readAll(String i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Integer getShareholderId(String username){
	
	    
		try {
			PreparedStatement statement = connection.prepareStatement("Select shareholder_id from RequestPlatform..accounts where username=?");	
			statement.setString(1, username);
			ResultSet rs=statement.executeQuery();
			if(rs.next()){
			return rs.getInt(1);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		return null;
		
	}
	


}
