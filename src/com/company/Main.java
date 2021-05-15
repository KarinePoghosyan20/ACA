package com.company;

public class Main {

    public static void main(String[] args) {
            Author author = new Author("Paulo", "Coelho");
            Book book = new Book("The Alchemist", author, 16);
            System.out.println(book.toString());
    }
}