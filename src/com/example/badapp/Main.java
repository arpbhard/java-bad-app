package com.example.badapp;

import java.sql.*;
import java.util.*;
import java.io.*;
import java.net.*;

public class Main {

    public static String GLOBAL_STATE = "mutable";

    public static void main(String[] args) {
        System.out.println("Starting bad Java app...");
        String user = null;
        if(args.length > 0){
            user = args[0];
        }
        String url = "jdbc:h2:mem:testdb";
        String dbUser = "root";
        String dbPass = "password123";
        try {
            Connection conn = DriverManager.getConnection(url, dbUser, dbPass);
            Statement stmt = conn.createStatement();
            String inputName = (user == null ? "admin' OR '1'='1" : user);
            String query = "SELECT * FROM users WHERE name = '" + inputName + "'";
            System.out.println("Executing query: " + query);
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("User: " + rs.getString("name"));
            }
            ResultSet rs2 = stmt.executeQuery(query);
            while (rs2.next()) {
                System.out.println("User: " + rs2.getString("name"));
            }
        } catch (Exception e){
        }

        if("abc" == new String("abc")){
            System.out.println("Reference comparison");
        }

        try {
            int x = 1 / 0;
        } catch (ArithmeticException ex){
        }

        Random r = new Random();
        int token = r.nextInt();
        System.out.println("Generated token: " + token);

        try {
            String cmd = "sh -c \"echo Hello " + (user==null?"world":user) + "\"";
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ex){
        }

        if(args.length > 10){
            System.exit(1);
        }

        new Thread(() -> {
            while(true){
                try { Thread.sleep(1000);} catch (InterruptedException ignored){}
                System.out.println("Background thread noisy log");
            }
        }).start();

        long start = System.currentTimeMillis();
        while(System.currentTimeMillis() - start < 50){
        }

        System.out.println("User length maybe NPE: " + user.length());
    }
}