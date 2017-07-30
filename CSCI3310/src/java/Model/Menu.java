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
public class Menu {
    private String restName;
    private double price;
    private String foodName;
    private String type;
    private Connection connection = null;

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public List<Menu> getMenu(String restName) {
        List<Menu> menuList = new ArrayList<Menu>();
        connection = OracleConnection.getConnection();
        try {
            String sql = "SELECT * from Main_Dish where restname = ";
            Statement ps = connection.createStatement();
            sql+= "'" + restName.toLowerCase() + "'";
            //ps.setString(1, "'" + keyword + "'");
            System.out.println("Fuggen gay: " + sql);
            ResultSet rs = ps.executeQuery(sql);
            //parse data
            while (rs.next()) {
                Menu menu = new Menu();
                menu.setRestName(rs.getString("restname"));
                menu.setPrice(rs.getDouble("price"));
                menu.setFoodName(rs.getString("name"));
                menu.setType(rs.getString("type"));
                
                menuList.add(menu);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            OracleConnection.closeConnection();
        }
        return menuList;
    }
    
}
