package com.fdmgroup.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnector {

	private static Connection connection = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		class PropLoader {

			public URL getDBProperties() throws URISyntaxException {
				return getClass().getResource("/");

			}
		}

		if (connection != null)
			return connection;
		else {
			try {
				Properties properties = new Properties();
				File file = new File(new PropLoader().getDBProperties().getPath().replace("%20", " ")+"dbproperties");
				FileInputStream input = new FileInputStream(file);
				properties.load(input);

				String url = properties.getProperty("url");

				DriverManager.registerDriver(new net.sourceforge.jtds.jdbc.Driver());

				connection = DriverManager.getConnection(url);

				input.close();

			}
				catch (URISyntaxException e) {
				e.printStackTrace();
			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			return connection;
		}

	}

}