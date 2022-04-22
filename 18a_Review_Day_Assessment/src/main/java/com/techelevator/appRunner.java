package com.techelevator;

public class appRunner extends MovieRental{

    public appRunner(String title, String format, boolean isPremiumMovie) {
        super(title, format, isPremiumMovie);

           MovieRental rentMovie = new MovieRental();
           this.title = title;
           this.format = format;
           this.isPremiumMovie = isPremiumMovie;


        }
    }

