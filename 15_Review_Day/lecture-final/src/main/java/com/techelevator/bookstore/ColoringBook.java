package com.techelevator.bookstore;

public class ColoringBook extends Book {

    private String experienceLevel;


    public ColoringBook(String isbn, String title, String experienceLevel) {
        super(isbn, title);
        this.experienceLevel = experienceLevel;
    }


    public String getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }


    public String toString() {
        return this.getIsbn() + this.getTitle() + this.getPrice() + this.getExperienceLevel();
    }
}
