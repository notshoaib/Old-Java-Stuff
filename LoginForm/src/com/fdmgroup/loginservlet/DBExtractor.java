package com.fdmgroup.loginservlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.xml.crypto.Data;

public class DBExtractor {
	String id;
	String firstname;
	String lastname;
	String ISBN;
	String bookname;
	
	Connection connection = null;
	Properties properties = null;
	Statement statement = null;
	PreparedStatement stmt = null;

	public List<DTO> getData() {
		String query;
		List<DTO> list=new ArrayList<DTO>();
		try {
			connection = DBConnector.getConnection();
			properties = SqlProperties
					.getProperties("H:/workspace/LoginForm/dml.properties");
			query=properties.getProperty("RetrieveUser");
			
			statement=connection.createStatement();
			
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				id = (rs.getString(1));
				firstname = rs.getString(2);
				lastname = (rs.getString(3));
				DTO dto=new DTO(id,firstname,lastname);
				list.add(dto);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				return list;

	}
	public List<DTO> getCatalog() {
		String query;
		List<DTO> list=new ArrayList<DTO>();
		try {
			connection = DBConnector.getConnection();
			properties = SqlProperties
					.getProperties("H:/workspace/LoginForm/dml.properties");
			query=properties.getProperty("RetrieveCatalog");
			
			statement=connection.createStatement();
			
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				ISBN = rs.getString(1);
				bookname = rs.getString(2);
				DTO dto=new DTO(ISBN, bookname);
				list.add(dto);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
				return list;

	}
	
	public boolean verify(String username, String password){
		String query;
		boolean empty=true;
		try {
			connection = DBConnector.getConnection();
		
		properties = SqlProperties
				.getProperties("H:/workspace/LoginForm/dml.properties");
		query=properties.getProperty("Login");
		
		stmt = connection.prepareStatement(query);
		
		stmt.setString(1, username);
	//	stmt.setString(2, password);
		ResultSet rs = stmt.executeQuery();
		

		
		while (rs.next()) {
			empty = false;

			id = (rs.getString(1));
			firstname = rs.getString(2);
			lastname = (rs.getString(3));
		}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(empty){
			return false;
		
		}
		else{
		return true;
		}
	}

}
