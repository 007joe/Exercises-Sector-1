package com.techelevator.bookstore;

public class Book {

    private String isbn;
    private String title;
    private double price;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }


    public String getTitle() {
        return title;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return getIsbn() + ": " + getTitle() + "- $" + this.price;
    }

}
