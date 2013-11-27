package com.fdmgroup.loginservlet;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SqlProperties {

                // Only allowing one properties file at any one time
                private static Properties properties = null;
                
                public static Properties getProperties(String filename){
                                
                                FileInputStream fileIS = null;
                                                
                                try {
                                                properties = new Properties();
                                                fileIS = new FileInputStream(filename);                
                                                properties.load(fileIS);
                                                fileIS.close();
                                }
                                catch(IOException ioe) {
                                                
                                }
                                
                                return properties;                           
                }
}



