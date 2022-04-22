package com.techelevator;

import java.util.*;

public class HomeInventory {



    private Map<String, Home> inventory;    // key, value   key is a String(mls),  value Home


    public HomeInventory() {
        //create my inventory map
        inventory = new HashMap<>();

        //load my map with some sample Homes
        loadHomes();
    }


    public List<Home>  retrieveHomes() {

        List<Home> listOfHomes = new ArrayList<>();

        //go to the map, get all the items out and put into a list
        Set<String> keys  = inventory.keySet();

        for (String anyVarName :  keys ) {    // for each key in my set
            Home h = inventory.get(anyVarName);   // go get the home from map

            //add the home to the list
            listOfHomes.add(h);
        }


       return listOfHomes;

    }


    private void loadHomes() {

        //create a home object and add to the map   TODO: COme back later and get from database or file


        Address addressForH1 = new Address();
        addressForH1.setAddressLine1("123 Oak Street");
        addressForH1.setCity("Columbus");
        addressForH1.setState("Oh");
        addressForH1.setZip("43333");

        Home home1 = new Home("MLS123", 2, 2, addressForH1);
        home1.setListingPrice(100000.01);
        home1.setSquareFeet(2000);
        home1.setDescription("This house has noisy neighbors but a really cool TV room");

        //add HOme 1 to the inventory map
        inventory.put("MLS123", home1);


        Address addressForH2 = new Address();
        addressForH2.setAddressLine1("125 Oak Street");
        addressForH2.setCity("Columbus");
        addressForH2.setState("Oh");
        addressForH2.setZip("43322");

        // Create a 2nd home
        Home home2 = new Home("MLS456", 3,6, addressForH2);
        home2.setListingPrice(5000.01);
        home2.setSquareFeet(3000);
        home2.setDescription("This future money pit comes with termites and an old dilapidated barn");

        //add HOme 2 to the inventory map
        inventory.put("MLS456", home2);


    }





}
