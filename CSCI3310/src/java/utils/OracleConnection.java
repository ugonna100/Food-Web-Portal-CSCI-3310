package utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.*;
/**
 *
 * @author Bakuano
 */
public class OracleConnection {
    private static Connection connection = null;
    
    public static Connection getConnection() {
        /*
        step 1: load jdbc driver class
        step 2: create connection object
        step 3: handle exceptions
        */
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "pokemon12");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    public static void closeConnection() {
        try {
            connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        try {
            //get connection
            Connection con = OracleConnection.getConnection();
            String sql = "select sysdate as current_day from dual";
            //create prepared statement object to execute query
            PreparedStatement stmt = con.prepareStatement(sql);
            //Execute sql
            ResultSet rs = stmt.executeQuery();
            //prepare result set
            while (rs.next()) {
                System.out.println("Current DB Server Date: " + rs.getString("current_day"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            OracleConnection.closeConnection();
        }
        
    }
}
