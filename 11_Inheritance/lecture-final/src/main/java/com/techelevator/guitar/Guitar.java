package com.techelevator.guitar;

public class Guitar {

     private String brand;
     private int numberOfStrings;


     //custom construction
     public Guitar(int numberOfStrings, String brand) {
         this.brand = brand;
         this.numberOfStrings = numberOfStrings;
     }





     //method
    public void play() {
        System.out.println("play Stairway to Heaven");
    }



    public String getBrand() {
        return brand;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }


}
