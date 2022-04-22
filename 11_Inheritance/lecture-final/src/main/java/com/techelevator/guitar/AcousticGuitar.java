package com.techelevator.guitar;

public class AcousticGuitar extends Guitar{

    public AcousticGuitar(int numberOfStrings, String brand) {    // stuff is being passed in...
        super(numberOfStrings, brand);    //  calling/sending to the superclass
    }

    @Override
    public void play() {
        System.out.println("Margaritaville");
    }
}
