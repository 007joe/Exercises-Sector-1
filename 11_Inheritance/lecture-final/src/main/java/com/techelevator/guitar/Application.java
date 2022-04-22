package com.techelevator.guitar;

import java.util.ArrayList;
import java.util.List;

public class Application {


    public static void main(String[] args) {


        Guitar guitar = new Guitar(6, "Fender");   // create an instance of guitar
        guitar.play();

        ElectricGuitar eg = new ElectricGuitar(6, "Gibson", 2);   // --> IS-A Guitar
        eg.play();


        AcousticGuitar ag = new AcousticGuitar(12, "Fender");   // --> IS-A Guitar
        ag.play();

        HollowBodyElectricGuitar hb = new HollowBodyElectricGuitar("Fender");
        HollowBodyElectricGuitar hb2 = new HollowBodyElectricGuitar(4, "Fender", 2);



        List<AcousticGuitar> acousticList = new ArrayList<>();


        List<ElectricGuitar> electricList = new ArrayList<>();



        //refer to them generically as Guitar (Polymorphism)
        List<Guitar> listOfGuitars = new ArrayList<>();
        listOfGuitars.add(eg);   // underlying object IS a ElectricGuitar  --> refer generically as guitar
        listOfGuitars.add(ag);   // underlying object IS a AcousticGuitar  --> refer generically as guitar

        for (Guitar g : listOfGuitars) {
            g.play();
        }

        for (Guitar g : listOfGuitars) {

            if (g instanceof ElectricGuitar) {
                ElectricGuitar e = (ElectricGuitar) g;
                e.shred();
            }
            else {
                g.play();
            }
        }


    }
}
