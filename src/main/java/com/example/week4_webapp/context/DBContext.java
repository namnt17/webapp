package com.example.week4_webapp.context;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
    public Connection getConnection() throws Exception{
        String url = "jdbc:sqlserver://DESKTOP-8QEF7RH\\SQLEXPRESS:1433;databaseName=MobileSystem";
        String username = "root";
        String password = "prodota318";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url,username,password);
    }



}
