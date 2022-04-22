package com.techelevator.guitar;

public class ElectricGuitar extends Guitar{

    private int numberOfPickups;
    private int volume;

    public ElectricGuitar(int numberOfStrings, String brand, int numberOfPickups) {
        super(numberOfStrings, brand);
        this.numberOfPickups = numberOfPickups;
    }

    @Override
    public void play() {                   //example of method overriding - overriding my parent
        System.out.println("Chop Suey");
        super.play();
        System.out.println("Freebird!");
    }

    public void play(String request) {     //example of method overloading
        System.out.println(request);
    }

    public void shred() {
        System.out.println("Play Eruption!");
    }

    public int getNumberOfPickups() {
        return numberOfPickups;
    }

    public void setNumberOfPickups(int numberOfPickups) {
        this.numberOfPickups = numberOfPickups;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
