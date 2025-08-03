package com.example.lab3_cpen252;

public class AdminUser extends User {
    private String role = "Admin";

    public void deleteUser() {
        System.out.println("Deleting user...");
    }

    public void information() {
        super.information();
        System.out.println("role: " + role);
    }
}
