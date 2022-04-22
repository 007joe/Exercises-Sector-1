package com.techelevator.fly;

import java.util.ArrayList;
import java.util.List;

public class Application {


    public static void main(String[] args) {

        Flyable bird = new Bird();
        Flyable bug = new Bug();
        Flyable dragon = new Dragon();
        Flyable time = new Time();
        Bird birdAsClass = new Bird();

        List<Flyable> thingsThatFly = new ArrayList<>();
        thingsThatFly.add(bird);
        thingsThatFly.add(bug);
        thingsThatFly.add(dragon);
        thingsThatFly.add(time);


        for (Flyable thing : thingsThatFly) {
            System.out.println(thing.fly());
        }







    }


}
