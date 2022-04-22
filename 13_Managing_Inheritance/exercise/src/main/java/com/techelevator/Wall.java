package com.techelevator;

public abstract class Wall {
    private String name;
    private String color;

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

    public Wall(String name, String color) {
        this.color = color;
        this.name = name;
    }

    public abstract int getArea();
}
