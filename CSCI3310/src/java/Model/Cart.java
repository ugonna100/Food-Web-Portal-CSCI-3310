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
public class Cart {
    private String userName;
    private String restName;
    private String dishName;
    private String deliveryTime;
    private String deliveryAddress;
    private String deliveryDate;
    private String payment;
    private int quantity;
    private double price;
    private String dishStatus;
    private Connection connection = null;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getPayment() {
        return payment;
    }
    
    public void setPayment(String payment) {
        this.payment = payment;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDishStatus() {
        return dishStatus;
    }

    public void setDishStatus(String dishStatus) {
        this.dishStatus = dishStatus;
    }
   
    public void deleteCart() {
        connection = OracleConnection.getConnection();
        try {
            String sql = "DELETE from cart";
            Statement ps = connection.createStatement();
            //ps.setString(1, "'" + keyword + "'");
            System.out.println("Fuggen gay: " + sql);
            ResultSet rs = ps.executeQuery(sql);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            OracleConnection.closeConnection();
        }
    }
    
    public void deleteItem(String dishName) {
        connection = OracleConnection.getConnection();
        try {
            String sql = "DELETE from cart where dishname = ";
            sql+= "'" + dishName + "'";
            Statement ps = connection.createStatement();
            //ps.setString(1, "'" + keyword + "'");
            System.out.println("Fuggen gay: " + sql);
            ResultSet rs = ps.executeQuery(sql);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            OracleConnection.closeConnection();
        }
    }
    
    public void updateItem(String dishName, int quantity) {
        connection = OracleConnection.getConnection();
        try {
            AccountReader reader = new AccountReader();
            String sql = "UPDATE cart SET quantity = ";
            sql+= "'" + quantity++ + "'";
            sql+= " WHERE dishname = ";
            sql+= "'" + dishName + "'";
            Statement ps = connection.createStatement();
            //ps.setString(1, "'" + keyword + "'");
            System.out.println("Fuggen gay: " + sql);
            ResultSet rs = ps.executeQuery(sql);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            OracleConnection.closeConnection();
        }
    }
    
    public void setCart() {
        connection = OracleConnection.getConnection();
        try {
            String sql2 = "INSERT INTO Cart VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql2);
            
            pstmt.setString(1, getUserName().toLowerCase());
            pstmt.setString(2, getDishName());
            pstmt.setString(3, getDeliveryTime());
            pstmt.setString(4, getDeliveryAddress());
            pstmt.setString(5, getDeliveryDate());
            pstmt.setString(6, getPayment());
            pstmt.setString(7, "" + getQuantity());
            pstmt.setString(8, "" + getPrice());
            pstmt.setString(9, getDishStatus());
            pstmt.setString(10, getRestName());
            
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
    
    public List<Cart> getCart() {
        List<Cart> cartList = new ArrayList<Cart>();
        connection = OracleConnection.getConnection();
        try {
            AccountReader reader = new AccountReader();
            String sql = "SELECT * from cart where username = ";
            sql+= "'" + reader.getUsername() + "'";
            Statement ps = connection.createStatement();
            //ps.setString(1, "'" + keyword + "'");
            System.out.println("Fuggen gay: " + sql);
            ResultSet rs = ps.executeQuery(sql);
            //parse data
            while (rs.next()) {
                Cart cart = new Cart();
                cart.setUserName(rs.getString("username"));
                cart.setRestName(rs.getString("restname"));
                cart.setDishName(rs.getString("dishname"));
                cart.setDeliveryTime(rs.getString("deliverytime"));
                cart.setDeliveryAddress(rs.getString("deliveryaddress"));
                cart.setDeliveryDate(rs.getString("deliverydate"));
                cart.setPayment(rs.getString("paymentoption"));
                cart.setQuantity(rs.getInt("quantity"));
                cart.setPrice(rs.getDouble("price"));
                cart.setDishStatus(rs.getString("dishstatus"));
                cartList.add(cart);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            OracleConnection.closeConnection();
        }
        return cartList;
    }
    
    public List<Cart> getCart(String restName, String foodName) {
        List<Cart> cartList = new ArrayList<Cart>();
        connection = OracleConnection.getConnection();
        try {
            String sql = "SELECT * from cart where restname = ";
            sql+= "'" + restName.toLowerCase() + "'";
            sql+= " and dishname = ";
            sql+= "'" + foodName.toLowerCase() + "'";
            Statement ps = connection.createStatement();
            //ps.setString(1, "'" + keyword + "'");
            System.out.println("Fuggen gay: " + sql);
            ResultSet rs = ps.executeQuery(sql);
            //parse data
            while (rs.next()) {
                Cart cart = new Cart();
                cart.setUserName(rs.getString("username"));
                cart.setRestName(rs.getString("restname"));
                cart.setDeliveryTime(rs.getString("deliverytime"));
                cart.setDeliveryAddress(rs.getString("deliveryaddress"));
                cart.setDeliveryDate(rs.getString("deliverydate"));
                cart.setPayment(rs.getString("paymentoption"));
                cart.setQuantity(rs.getInt("quantity"));
                cart.setPrice(rs.getDouble("price"));
                cart.setDishStatus(rs.getString("dishstatus"));
                cartList.add(cart);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            OracleConnection.closeConnection();
        }
        return cartList;
    }
    
    public boolean ValidateCart (String username, String dishName) {
        connection = OracleConnection.getConnection();
        Cart cart = new Cart();
        boolean validated = false;
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * from cart where username = ? and dishname = ?");
            ps.setString(1, username);
            ps.setString(2, dishName);
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
}
