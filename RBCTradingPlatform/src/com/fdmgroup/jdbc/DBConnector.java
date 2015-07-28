package com.fdmgroup.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnector {

	private static Connection connection = null;

	public static Connection getConnection() throws ClassNotFoundException,
			SQLException {

		if (connection != null)
			return connection;
		else {
			try {
				Properties properties = new Properties();
				FileInputStream input = new FileInputStream(
						"H:/RBC workspace/RBCTradingPlatform/dbproperties");
				properties.load(input);
				
				String url = properties.getProperty("url");

				DriverManager.registerDriver(new net.sourceforge.jtds.jdbc.Driver());

				connection = DriverManager.getConnection(url);
				

				input.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}



			return connection;
		}

	}
}