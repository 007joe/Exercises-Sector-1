package com.techelevator.fly;

public class Bird implements Flyable{

    private int numberOfLegs;

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String fly() {

        return "Flaps Wings";

    }


    public void annoyMeWhenITryToSleepIn() {


    }
}
