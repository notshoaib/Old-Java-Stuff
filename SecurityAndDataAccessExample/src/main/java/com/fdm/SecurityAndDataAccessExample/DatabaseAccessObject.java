package com.fdm.SecurityAndDataAccessExample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DatabaseAccessObject {

	public String getUserAddress(String username){
		String address = null;
		String query = "SELECT address FROM example_users WHERE user_name LIKE ?";
		/*
		 * This next section deals with getting the Data Source from the context.
		 */
		InitialContext context;
		DataSource dataSource = null;
		try {
			context = new InitialContext();
			//This is a bit of JNDI - we don't need to know how this works, just that it does.
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/connection");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		Connection connection = null;
		ResultSet resultSet = null;
		try {
			connection = dataSource.getConnection();
			PreparedStatement prepStmt = connection.prepareStatement(query);
			prepStmt.setString(1, username);
			resultSet = prepStmt.executeQuery();
			resultSet.next();
			address= resultSet.getString("address");
			System.out.println("Address is: " + address);
		} catch (SQLException e) {
			//Log error
			e.printStackTrace();
		} finally{
			try {
				connection.close();
			} catch (SQLException e) {
				//Log error
				e.printStackTrace();
			}
		}
		return address;
	}

}
