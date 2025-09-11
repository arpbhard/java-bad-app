package com.example.badapp;

public class Utils {
    public static int COUNTER = 0;

    public static String md5(String input){
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
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