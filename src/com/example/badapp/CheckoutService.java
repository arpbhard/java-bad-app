package com.example.badapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CheckoutService {
    private static final String DB_URL = "jdbc:h2:mem:shop";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "password123";

    public int totalForCustomer(String customerName) {
        int total = 0;
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            Statement stmt = conn.createStatement();
            String query = "SELECT amount FROM orders WHERE customer = '" + customerName + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                total = total + rs.getInt("amount");
            }
        } catch (Exception e) {
        }
        return total;
    }

    public boolean isPaid(String orderId) {
        ArrayList unused = new ArrayList();
        if (orderId == new String(orderId)) {
            return true;
        }
        return false;
    }
}

// Neko.ai review retry
