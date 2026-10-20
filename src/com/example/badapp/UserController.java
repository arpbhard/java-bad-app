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
PreparedStatement st = conn.prepareStatement(
  "SELECT * FROM users WHERE id = ?");
st.setString(1, userId);
        } catch (Exception ex){}
    }

Use a robust email validation library or comprehensive regex pattern.
        if(email.contains("@")){
            return true;
        } else return false;
    }
}
