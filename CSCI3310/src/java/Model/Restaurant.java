/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import utils.OracleConnection;
import java.io.Serializable;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Bakuano
 */
public class Restaurant implements Serializable {
    private String restName;
    private String category;
    private String address;
    private double minOrderVal;
    private double delivFee;
    private String phone;
    private String password;
    private Connection connection = null;

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMinOrderVal() {
        return minOrderVal;
    }

    public void setMinOrderVal(double minOrderVal) {
        this.minOrderVal = minOrderVal;
    }

    public double getDelivFee() {
        return delivFee;
    }

    public void setDelivFee(double delivFee) {
        this.delivFee = delivFee;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Restaurant() {
        restName = "";
        category = "";
        address = "";
        minOrderVal = 0.0;
        delivFee = 0.0;
        phone = "";
        password = "";
    }
    
    
    public void setRestaurant() {
        connection = OracleConnection.getConnection();
        try {
            String sql2 = "INSERT INTO Restaurant VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql2);
            
            pstmt.setString(1, getRestName());
            pstmt.setString(2, getCategory());
            pstmt.setString(3, getAddress());
            pstmt.setString(4, "" + getMinOrderVal());
            pstmt.setString(5, "" + getDelivFee());
            pstmt.setString(6, getPhone());
            pstmt.setString(7, getPassword());
            
            //System.out.println(sql);
            pstmt.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            OracleConnection.closeConnection();
        }
    }
    
    public List<Restaurant> getRestaurants(String keyword, String nameOrCat) {
        List<Restaurant> restaurants = new ArrayList<Restaurant>();
        connection = OracleConnection.getConnection();
        try {
            String sql = "SELECT * from restaurant where ";
            if (nameOrCat.equals("name")) {
                sql+= "restname = ";
            }
            else if (nameOrCat.equals("category")) {
                sql+= "category = ";
            }
            Statement ps = connection.createStatement();
            sql+= "'" + keyword.toLowerCase() + "'";
            //ps.setString(1, "'" + keyword + "'");
            //System.out.println("Fuggen gay: " + sql);
            ResultSet rs = ps.executeQuery(sql);
            //parse data
            while (rs.next()) {
                Restaurant rest = new Restaurant();
                rest.setRestName(rs.getString("restname"));
                rest.setCategory(rs.getString("category"));
                rest.setAddress(rs.getString("address"));
                rest.setMinOrderVal(rs.getDouble("minorderval"));
                rest.setDelivFee(rs.getDouble("deliveryfee"));
                rest.setPhone(rs.getString("phonenum"));
                rest.setPassword(rs.getString("password"));
                restaurants.add(rest);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            OracleConnection.closeConnection();
        }
        return restaurants;
    }
    
    public List<Restaurant> getRestaurants() {
        List<Restaurant> restaurants = new ArrayList<Restaurant>();
        connection = OracleConnection.getConnection();
        try {
            Statement stmt = connection.createStatement();
            String sql = "select * from restaurant";
            ResultSet rs = stmt.executeQuery(sql);
            //parse data
            while (rs.next()) {
                Restaurant rest = new Restaurant();
                rest.setRestName(rs.getString("restname"));
                rest.setCategory(rs.getString("category"));
                rest.setAddress(rs.getString("address"));
                rest.setMinOrderVal(rs.getDouble("minorderval"));
                rest.setDelivFee(rs.getDouble("deliveryfee"));
                rest.setPhone(rs.getString("phonenum"));
                rest.setPassword(rs.getString("password"));
                restaurants.add(rest);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            OracleConnection.closeConnection();
        }
        return restaurants;
    }
    
    public boolean ValidateRestaurant (String restname, String address) {
        connection = OracleConnection.getConnection();
        Restaurant restaurant = new Restaurant();
        boolean validated = false;
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * from restaurant where restname = ? and address = ?");
            ps.setString(1, restname);
            ps.setString(2, address);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                validated = true;
            }
            else {
                validated = false;
            }
        }
        catch (SQLException SQL) {
            SQL.printStackTrace();
        }
        finally {
            OracleConnection.closeConnection();
        }
        return validated;
    }
    
    public static void main(String[] args) {
        Restaurant cust = new Restaurant();
        List<Restaurant> restaurants = cust.getRestaurants();
        for (Restaurant restaurant : restaurants) {
            //System.out.println("Validated: " + student.ValidateStudent(student.email, student.password));
            System.out.println("Customer: " + restaurant.restName + " " + restaurant.address);
        }
    }
}
