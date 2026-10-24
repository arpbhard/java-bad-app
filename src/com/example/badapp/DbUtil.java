package com.example.badapp;

import java.sql.*;

public class DbUtil {
    public static DbUtil instance;
    public Connection connection;

    private DbUtil(){
        try {
            connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "root", "password123");
        } catch (SQLException e){
        }
    }

    public static DbUtil getInstance(){
        if(instance == null){
            instance = new DbUtil();
        }
        return instance;
    }

    public ResultSet rawQuery(String sql){
PreparedStatement st = conn.prepareStatement(
  "SELECT * FROM users WHERE id = ?");
st.setString(1, userId);
            return s.executeQuery(sql);
        } catch (SQLException e){
            return null;
        }
    }

    @Override
    protected void finalize() throws Throwable {
        connection.close();
        super.finalize();
    }
}
