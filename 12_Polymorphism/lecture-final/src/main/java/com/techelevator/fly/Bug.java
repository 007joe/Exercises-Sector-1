package com.techelevator.fly;

public class Bug implements Flyable{

    private int numberOfWings;

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    @Override
    public String fly() {
        return "Buzzzzz";
    }
}
