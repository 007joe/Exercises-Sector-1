package com.techelevator;

import java.sql.SQLOutput;

public class SquareWall extends RectangleWall {


    public SquareWall(String name, String color, int sideLength) {
        super(name, color, sideLength, sideLength);
        sideLength = getLength();
    }
    @Override
    public String toString() {
        return getName() + " (" + getLength() + "x" + getLength()+ ") " + "square";
    }
    public int getArea() {
        return getLength() * getHeight();
    }
}
