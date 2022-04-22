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

        Home home1 = new Home();
        home1.setListingPrice(100000.01);
        home1.setMlsId("MLS123");
        home1.setNumberOfBathrooms(4);
        home1.setNumberOfBedrooms(4);

        Address addressForH1 = new Address();
        addressForH1.setAddressLine1("123 Oak Street");
        addressForH1.setCity("Columbus");
        addressForH1.setState("Oh");
        addressForH1.setZip("43333");

        home1.setAddress(addressForH1);



        //add HOme 1 to the inventory map
        inventory.put("MLS123", home1);


        // Create a 2nd home
        Home home2 = new Home();
        home2.setListingPrice(5000.01);
        home2.setMlsId("MLS456");
        home2.setNumberOfBathrooms(2);
        home2.setNumberOfBedrooms(4);

        Address addressForH2 = new Address();
        addressForH2.setAddressLine1("125 Oak Street");
        addressForH2.setCity("Columbus");
        addressForH2.setState("Oh");
        addressForH2.setZip("43322");

        home2.setAddress(addressForH2);

        //add HOme 2 to the inventory map
        inventory.put("MLS456", home2);


    }





}
