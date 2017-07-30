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
public class Student implements Serializable {
    private String email;
    private String fname;
    private String lname;
    private String password;
    private String phone;
    private Connection connection = null;
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        connection = OracleConnection.getConnection();
        try {
            Statement stmt = connection.createStatement();
            String sql = "select * from student";
            ResultSet rs = stmt.executeQuery(sql);
            //parse data
            while (rs.next()) {
                Student stu = new Student();
                stu.setEmail(rs.getString("EMAIL"));
                stu.setFname(rs.getString(2));
                stu.setLname(rs.getString("lname"));
                stu.setPhone(rs.getString("phone"));
                students.add(stu);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            OracleConnection.closeConnection();
        }
        return students;
    }
    
    public boolean ValidateStudent (String email, String pwd) {
        connection = OracleConnection.getConnection();
        Student student = new Student();
        boolean validated = false;
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * from student where email = ? and password = ?");
            ps.setString(1, email);
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
        Student stu = new Student();
        List<Student> students = stu.getStudents();
        for (Student student : students) {
            //System.out.println("Validated: " + student.ValidateStudent(student.email, student.password));
            System.out.println("Student: " + student.email + " " + student.fname);
        }
    }
}
