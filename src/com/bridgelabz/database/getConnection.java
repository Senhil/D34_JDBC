package com.bridgelabz.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class getConnection {
    public Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver is loaded");

        final String url = "jdbc:mysql://localhost:3307/payroll_service";
        final String userName = "root";
        final String password = "root";

        Connection connection = DriverManager.getConnection(url, userName, password);
        return connection;
    }
}
