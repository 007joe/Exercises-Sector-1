package com.techelevator.store;

public class Shampoo implements Sellable {

    private int inventoryCount;

    @Override
    public double getPrice() {
        return 1.00;
    }

    @Override
    public int getInventoryCount() {
        return 0;
    }
}
