package com.company;

public class Book {
    String title;
    String author;
    double price;


    public Book(String title, Author author, double price) {
        this.setTitle(title);
        String name = author.toString();
        this.setAuthor(name);
        this.setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String name) {
        this.author = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return title + " " + author + " " + price;
    }
}
