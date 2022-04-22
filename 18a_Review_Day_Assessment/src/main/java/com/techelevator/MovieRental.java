package com.techelevator;

public class MovieRental {
        protected String title;
       protected String format;
        boolean isPremiumMovie;
        private double rentalPrice;

        public MovieRental(String title, String format, boolean isPremiumMovie) {
        this.title = title;
        this.format = format;
        this.isPremiumMovie = isPremiumMovie;
        }

    public MovieRental() {
    }
}
