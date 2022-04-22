package com.techelevator.toystore;

import java.util.ArrayList;
import java.util.List;

public class Application {


    public static void main(String[] args) {


     //   Frisbee frisbee = new Frisbee();


        List<Toy> toyList = new ArrayList<>();

        Toy frisbee = new Frisbee();
        Toy nerf = new NerfFootball();

        toyList.add(frisbee);
        toyList.add(nerf);




    }
}
