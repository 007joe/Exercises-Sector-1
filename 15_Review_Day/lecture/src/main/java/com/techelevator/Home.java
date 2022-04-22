package com.techelevator;

public class Home {

    //define our member variables
    private String mlsId;
    private int numberOfBedrooms;
    private double numberOfBathrooms;
    private double listingPrice;
    private Address address;


    public Home(String mls, double numberOfBathrooms, int numberOfBedrooms) {
        this.mlsId = mls;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public Home() {

    }





    public String getMlsId() {
        return mlsId;
    }

    public void setMlsId(String mlsId) {
        this.mlsId = mlsId;
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

    public void setAddress(Address address) {
        this.address = address;
    }
}
