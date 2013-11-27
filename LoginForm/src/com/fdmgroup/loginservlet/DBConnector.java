package com.fdmgroup.loginservlet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnector {
	
	private static Connection connection = null;
	
	  public static Connection getConnection() throws ClassNotFoundException, SQLException
	   {
	   
	       if ( connection != null)
	          return connection;
	       else
	       {
	          try
	          {
	              Properties p = new Properties();
	              FileInputStream input = new FileInputStream("H:/workspace/LoginForm/dbproperties");
	              p.load(input);
	              String driver = p.getProperty("driver");
	              String url = p.getProperty("url");
	              String user = p.getProperty("user");
	              String password = p.getProperty("password");
	                           
	              
	              
	              DriverManager.registerDriver(
	            		  (oracle.jdbc.driver.OracleDriver)Class.forName(driver).newInstance());
	              
	              connection = DriverManager.getConnection(url, user, password);
	              
	              input.close(); 
	              
	          }
	          catch (FileNotFoundException e)
	          {
	              e.printStackTrace();
	          }
	          catch (IOException e)
	          {
	              e.printStackTrace();
	          }
	          
	          catch (InstantiationException e) {
	              // TODO Auto-generated catch block
	              e.printStackTrace();
	          } catch (IllegalAccessException e) {
	              // TODO Auto-generated catch block
	              e.printStackTrace();
	          }
	          
	          return connection;
	       }
	       
	       
	       
	   }
}
