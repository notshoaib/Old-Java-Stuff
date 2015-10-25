package com.beardeddev.nycdeathdata.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.beardeddev.pojo.YearSummary;

public class YearSummaryReader {

	
	private Connection connection;
	
	
	public List<YearSummary> readAllYearSummary(int year) throws SQLException{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		connection=DriverManager.getConnection("jdbc:oracle:thin:@oracle.fdmgroup.com:1521:xe","mohamadsalimi","NewSql101");
		PreparedStatement statement = connection.prepareStatement("Select * from YearSummary where year = ?");
		statement.setInt(1, year);
		List<YearSummary> list = new ArrayList<YearSummary>();
		ResultSet rs = statement.executeQuery();
		
		while(rs.next()){
			int yearOf=rs.getInt(2);
			String causeOfDeath=rs.getString(1);
			int count=rs.getInt(3);
			YearSummary yearSummary = new YearSummary(yearOf, causeOfDeath, count);
			list.add(yearSummary);
		}
		connection.close();
		return list;
		
		
	}
}
