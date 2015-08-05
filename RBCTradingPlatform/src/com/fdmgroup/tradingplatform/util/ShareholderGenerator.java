package com.fdmgroup.tradingplatform.util;

import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.fdmgroup.jdbc.DBConnector;
import com.fdmgroup.jdbc.SQLProperties;

public class ShareholderGenerator {

	private static Connection connection;
	private static Properties properties;
	private static ResultSet rs;
	private static String path;
	
	class PropLoader {

		public URL getDBProperties() throws URISyntaxException {
			return getClass().getResource("/");

		}
	}
	


	static {
		
		try {
			path = new ShareholderGenerator().new PropLoader().getDBProperties().getPath().replace("%20", " ");
			properties = SQLProperties.getProperties(path + "dml.properties");
			connection = DBConnector.getConnection();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static synchronized int createShareholder() {
		PreparedStatement statement;
		int id=0;
		try {
			statement = connection.prepareStatement("ReadMaxID");
			ResultSet rs = statement.executeQuery();
			rs.next();
			id = rs.getInt(1);
			String query = properties.getProperty("CreateShareholder");

			statement = connection.prepareStatement(query);
			statement.setInt(1, id+1);
			statement.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return id;

	}

}
