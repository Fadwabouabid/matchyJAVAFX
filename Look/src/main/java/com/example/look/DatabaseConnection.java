package com.example.look;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection databaseLink;

    public Connection getConnection() {
        String databaseUser = "root";
        String databasePassword = "system";
        String url = "jdbc:mysql://localhost:3306/matchylook";

        try {
            // Attempt to dynamically load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // Handle the case where the driver class is not found
            System.err.println("MySQL JDBC driver not found!");
            e.printStackTrace();
            return null; // Return null to indicate failure
        }

        try {
            // Attempt to establish a connection to the database
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
        } catch (Exception e) {
            // Handle any other exceptions that may occur during connection establishment
            e.printStackTrace();
            return null; // Return null to indicate failure
        }

        return databaseLink; // Return the connection object if successful
    }
}


