package com.techelevator.vehicle;

public class Vehicle {

    //INSTANCE / MEMBER VARS
    private String color;
    private int numberOfTires;
    private boolean isStarted;


   // METHODS
    public boolean start(){
        return this.isStarted = true;
    }

    public boolean shutOff() {
        return  this.isStarted = false;
    }


    //GETTERS AND SETTERS
    public boolean isStarted() {
        return isStarted;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }




}
