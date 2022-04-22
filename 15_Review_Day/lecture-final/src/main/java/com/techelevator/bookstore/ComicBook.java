package com.techelevator.bookstore;

public class ComicBook extends Book {

    private int rating;

    public ComicBook(String isbn, String title) {
        super(isbn, title);
    }


    public ComicBook(String isbn, String title, int rating) {
        super(isbn, title);
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
