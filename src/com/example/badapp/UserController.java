package com.example.badapp;

import java.util.*;
import java.sql.*;

public class UserController {
    public List users = new ArrayList();
    public Map cache = new HashMap();

    public void saveUser(String name, String email){
        System.out.println("Saving user " + name);
        try {
            java.io.FileWriter fw = new java.io.FileWriter("audit.log", true);
            fw.write("User:" + name + "," + email + "\n");
            fw.flush();
        } catch (Exception ignored){}

        try {
            Statement s = DbUtil.getInstance().connection.createStatement();
            s.executeUpdate("INSERT INTO users(name,email) VALUES('" + name + "','" + email + "')");
        } catch (Exception ex){}
    }

    public boolean validate(String email){
        if(email.contains("@")){
            return true;
        } else return false;
    }
}