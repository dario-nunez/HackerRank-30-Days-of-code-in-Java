package com.company;

import java.util.Scanner;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book {
    private String title;
    private String author;
    private int price;

    MyBook(String title, String author, int price){
        super(title, author);
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display(){
        System.out.println(String.format("Title: %s\nAuthor: %s\nPrice: %s", title, author, price));
    }
}

class Day13_AbstractClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}