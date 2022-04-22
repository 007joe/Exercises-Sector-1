package com.techelevator;

public class Home {

    //define our member variables
    private String mlsId;
    private int numberOfBedrooms;
    private double numberOfBathrooms;
    private double listingPrice;
    private String description;
    private int squareFeet;
    private Address address;


    public Home(String mls, double numberOfBathrooms, int numberOfBedrooms, Address address) {
        this.mlsId = mls;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfBedrooms = numberOfBedrooms;
        this.address = address;
    }


    public String getMlsId() {
        return mlsId;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public double getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(double numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public double getListingPrice() {
        return listingPrice;
    }

    public void setListingPrice(double listingPrice) {
        this.listingPrice = listingPrice;
    }

    public Address getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }
}
