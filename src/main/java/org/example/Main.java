package org.example;

import java.sql.*;
public class Main {
    private final String URL = "jdbc:postgresql://localhost:5432/it_academy";
    private final String USER = "postgres";
    private final String PASSWORD = "postgres";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
}