package com.techelevator.store;

public class Conditioner implements Sellable {
    @Override
    public double getPrice() {
        return 5.20;
    }

    @Override
    public int getInventoryCount() {
        return 0;
    }
}
