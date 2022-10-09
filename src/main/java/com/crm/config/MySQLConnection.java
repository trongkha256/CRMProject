package com.crm.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
    public static Connection getConnection(){
        Connection connection=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3307/crm_app",
                    "root",
                    "admin123");
        } catch (Exception e){
            System.out.printf("Error connect database "+e.getMessage());
        }
        return connection;
    }
}
