package com.fdmgroup.nycdeathdata.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.nycdeathdata.entities.YearSummaryC;

public class YearSummaryReader {

	
	private Connection connection;
	
	
	public ArrayList<YearSummaryC> readAllYearSummary(int year) throws SQLException{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		connection=DriverManager.getConnection("jdbc:oracle:thin:@oracle.fdmgroup.com:1521:xe","mohamadsalimi","NewSql101");
		PreparedStatement statement = connection.prepareStatement("Select * from YearSummary where year = ?");
		statement.setInt(1, year);
		ArrayList<YearSummaryC> list = new ArrayList<YearSummaryC>();
		ResultSet rs = statement.executeQuery();
		
		while(rs.next()){
			int yearOf=rs.getInt(2);
			String causeOfDeath=rs.getString(1);
			int count=rs.getInt(3);
			YearSummaryC yearSummary = new YearSummaryC(yearOf, causeOfDeath, count);
			list.add(yearSummary);
		}
		connection.close();
		return list;
		
		
	}
}
