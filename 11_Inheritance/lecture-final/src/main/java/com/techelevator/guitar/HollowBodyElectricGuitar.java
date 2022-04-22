package com.techelevator.guitar;

public class HollowBodyElectricGuitar extends ElectricGuitar{

    //(int numberOfStrings, String brand, int numberOfPickups)
    public HollowBodyElectricGuitar(int numberOfStrings, String brand, int numberOfPickups) {
        super(numberOfStrings, brand, numberOfPickups);
    }

    public HollowBodyElectricGuitar(String brand) {
        super(6, brand, 4);
    }

}
