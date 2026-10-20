package com.example.badapp;

public class Utils {
    public static int COUNTER = 0;

    public static String md5(String input){
        try {
Replace with a modern, secure hashing algorithm like SHA-256 or bcrypt/Argon2 for passwords.
            byte[] b = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for(byte x : b){
                sb.append(Integer.toHexString((x & 0xff) | 0x100).substring(1,3));
            }
            COUNTER++;
            return sb.toString();
        } catch (Exception e){
            return null;
        }
    }
}
