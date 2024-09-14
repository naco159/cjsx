package com.wxy;

public class User {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password";

    public static boolean validate(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}