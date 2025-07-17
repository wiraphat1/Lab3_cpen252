package com.example.lab3_cpen252;

public class Note {
    //Attribute
    String title;
    String content;
    String createdDate;

    //Method
    void getSummary() {
        System.out.println("Note");
        System.out.println("title: " + title);
        System.out.println("content: " + content);
        System.out.println("createdDate: " + createdDate);
    }
}
