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

/**
 *
 * @author Bakuano
 */
public class Customer implements Serializable {
    private String username;
    private String email;
    private String address;
    private String fname;
    private String lname;
    private String password;
    private String phone;
    private Connection connection = null;

    public Customer() {
        username = "";
        email = "";
        address = "";
        fname = "";
        lname = "";
        password = "";
        phone = "";
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void updateCustomer() {
        connection = OracleConnection.getConnection();
        try {
            AccountReader reader = new AccountReader();
            String sql = "UPDATE customer SET password = ?, address = ?, email = ?, fname = ?, lname = ?, phonenum = ? where username = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            
            pstmt.setString(1, getPassword());
            pstmt.setString(2, getAddress());
            pstmt.setString(3, getEmail());
            pstmt.setString(4, getFname());
            pstmt.setString(5, getLname());
            pstmt.setString(6, getPhone());
            pstmt.setString(7, getUsername());
            
            System.out.println("YEAHHHHHHHHHHHHHHHHHHHHHHHHHHH YOU UPDATED: ");
            pstmt.executeQuery();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            OracleConnection.closeConnection();
        }
    }
    
    public List<Customer> getCustomers(String username) {
        List<Customer> customers = new ArrayList<Customer>();
        connection = OracleConnection.getConnection();
        try {
            Statement stmt = connection.createStatement();
            String sql = "select * from customer where username = ";
            sql+= "'" + username + "'";
            ResultSet rs = stmt.executeQuery(sql);
            //parse data
            while (rs.next()) {
                Customer cust = new Customer();
                cust.setUsername(rs.getString("username"));
                cust.setPassword(rs.getString("password"));
                cust.setEmail(rs.getString("EMAIL"));
                cust.setAddress(rs.getString("address"));
                cust.setFname(rs.getString(5));
                cust.setLname(rs.getString("lname"));
                cust.setPhone(rs.getString("phonenum"));
                customers.add(cust);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            OracleConnection.closeConnection();
        }
        return customers;
    }
    
    public void setCustomer() {
        connection = OracleConnection.getConnection();
        try {
            String sql2 = "INSERT INTO Customer VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql2);
            
            pstmt.setString(1, getUsername());
            pstmt.setString(2, getPassword());
            pstmt.setString(3, getAddress());
            pstmt.setString(4, getEmail());
            pstmt.setString(5, getFname());
            pstmt.setString(6, getLname());
            pstmt.setString(7, getPhone());
            /*
            Statement stmt = connection.createStatement();
            String sql = "INSERT INTO Customer (username, password, address, email, fname, lname, phonenum) VALUES (";
            sql += "'" + getUsername() + "', ";
            sql += "'" + getPassword() + "', ";
            sql += "'" + getAddress() + "', ";
            sql += "'" + getEmail() + "', ";
            sql += "'" + getFname() + "', ";
            sql += "'" + getLname() + "', ";
            sql += "'" + getPhone() + "')";
            */
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
    
    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<Customer>();
        connection = OracleConnection.getConnection();
        try {
            Statement stmt = connection.createStatement();
            String sql = "select * from customer";
            ResultSet rs = stmt.executeQuery(sql);
            //parse data
            while (rs.next()) {
                Customer cust = new Customer();
                cust.setUsername(rs.getString("username"));
                cust.setPassword(rs.getString("password"));
                cust.setEmail(rs.getString("EMAIL"));
                cust.setAddress(rs.getString("address"));
                cust.setFname(rs.getString(5));
                cust.setLname(rs.getString("lname"));
                cust.setPhone(rs.getString("phonenum"));
                customers.add(cust);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            OracleConnection.closeConnection();
        }
        return customers;
    }
    
    public boolean ValidateCustomer (String username, String pwd) {
        connection = OracleConnection.getConnection();
        Customer customer = new Customer();
        boolean validated = false;
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * from customer where username = ? and password = ?");
            ps.setString(1, username);
            ps.setString(2, pwd);
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
        Customer cust = new Customer();
        List<Customer> customers = cust.getCustomers();
        for (Customer customer : customers) {
            //System.out.println("Validated: " + student.ValidateStudent(student.email, student.password));
            System.out.println("Customer: " + customer.email + " " + customer.fname);
        }
    }
}
