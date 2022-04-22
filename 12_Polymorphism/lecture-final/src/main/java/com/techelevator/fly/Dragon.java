package com.techelevator.fly;

public class Dragon implements Flyable{

    private boolean isFireBreathing;


    public boolean isFireBreathing() {
        return isFireBreathing;
    }

    public void setFireBreathing(boolean fireBreathing) {
        isFireBreathing = fireBreathing;
    }


    @Override
    public String fly() {
       return "Flys and breathes fire on hobbits below";
    }
}
