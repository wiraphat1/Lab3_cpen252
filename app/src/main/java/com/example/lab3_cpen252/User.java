package com.example.lab3_cpen252;

public class User {
    private String username;
    private String password;
    private String email;

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void information() {
        System.out.println("\nUser");
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("email: " + email);
    }

    public void logout() {
        System.out.println("Log out");
    }
}

