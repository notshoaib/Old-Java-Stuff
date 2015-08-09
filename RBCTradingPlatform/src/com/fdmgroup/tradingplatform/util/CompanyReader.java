package com.fdmgroup.tradingplatform.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.fdmgroup.jdbc.DBConnector;
import com.fdmgroup.jdbc.SQLProperties;
import com.fdmgroup.tradingplatform.pojo.Company;

public class CompanyReader {

       private Connection connection;
       private Properties properties;
       private ResultSet rs;
       private String path =getClass().getClassLoader().getResource("/").getPath().replace("%20", " ");
       
       public CompanyReader(){
              
              try {
                     properties=SQLProperties.getProperties(path+"dml.properties");
                     connection=DBConnector.getConnection();
              } catch (ClassNotFoundException e) {
                     
                     e.printStackTrace();
              } catch (SQLException e) {
                     
                     e.printStackTrace();
              }
       }
       
       public List<Company> readAllCompanies(){
              List<Company> compList= new ArrayList<Company>();
              String query = properties.getProperty("ReadComp");
              
              try {
                     PreparedStatement preparedStatment = connection.prepareStatement(query);
                     rs=preparedStatment.executeQuery();
                     
                     while(rs.next()){
                           Company comp = new Company();
                           comp.setCompId(rs.getInt(1));
                           comp.setCompName(rs.getString(2));
                           comp.setPlaceId(rs.getInt(3));
                           comp.setStockId(rs.getInt(4));
                           comp.setStartingPrice(rs.getDouble(5));
                           comp.setCurrencyId(rs.getInt(6));
                           
                           compList.add(comp);
                           
                     }
              } catch (SQLException e) {
                     
                     e.printStackTrace();
              }             
              
              
              return compList;
              
       }
}

