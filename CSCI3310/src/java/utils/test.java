/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import Model.AccountReader;
import java.io.File;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Bakuano
 */
public class test {
    public static void main(String[] args) {
        /*
        Date today = new Date();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        System.out.println(dateFormat.format(today));
        */
        AccountReader writer = new AccountReader();
        writer.setAccount("gaylord");
        /*
        try {
            File file = new File("account.txt");
            Scanner reader = new Scanner(file);
            System.out.println(reader.nextLine());
            reader.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
*/
    }
}
