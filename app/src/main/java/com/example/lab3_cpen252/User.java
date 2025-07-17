package com.example.lab3_cpen252;

public class User {
    String username;
    String password;
    String email;


    void information(){
        System.out.println();
        System.out.println("User");
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("email: " + email);
    }
    void logout(){
        System.out.println("Log out");
    }
}
