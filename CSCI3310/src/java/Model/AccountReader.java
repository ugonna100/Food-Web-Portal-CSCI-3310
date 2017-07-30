/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Bakuano
 */
public class AccountReader {
    private Scanner reader;
    private File file;
    private PrintWriter writer;
    
    public String getUsername() {
        String account = "";
        try {
            file = new File("account.txt");
            reader = new Scanner(file);
            account = reader.nextLine();
            reader.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return account;
    }
    
    public String getAddress() {
        String address = "";
        try {
            file = new File("account.txt");
            reader = new Scanner(file);
            reader.nextLine();
            address = reader.nextLine();
            reader.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return address;
    }
    
    public void setAccount(String username) {
        try {
            File outputFile = new File("C:\\Users\\Bakuano\\Documents\\NetBeansProjects\\CSCI3310\\account.txt");
            FileWriter out = new FileWriter(outputFile);
            out.write(username);
            out.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
