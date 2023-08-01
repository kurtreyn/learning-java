package com.Udemy.databases;

import java.sql.*;

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

    public void updateDbEntry(String name, int phone, String email) {
        try {
            statement.execute("UPDATE contacts SET phone = " + phone + ", email = '" + email + "' WHERE name = '" + name + "'");
        } catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    public void deleteDbEntry(String name) {
        try {
            statement.execute("DELETE FROM contacts WHERE name = '" + name + "'");
        } catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    public void queryDb() {
        try {
            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while(results.next()) {
                System.out.println(results.getString("name") + " " + results.getInt("phone") + " " + results.getString("email"));
            }
            results.close();
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
