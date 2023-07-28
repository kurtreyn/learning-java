package com.Udemy.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManager {
   private Connection conn;
   private Statement statement;
    public void getConnectionCreateTable() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:src/main/java/com/Udemy/databases/testjava.db");
            statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");
            System.out.println("Connection to database established.");


        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    public void insertIntoDb(String name, int phone, String email) {
        try {
            statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('" + name + "', " + phone + ", '" + email + "')");
        } catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    public void closeConnection() {
        try {
            if(statement != null) {
                statement.close();
            }

            if(conn != null) {
                conn.close();
            }
        } catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

}
