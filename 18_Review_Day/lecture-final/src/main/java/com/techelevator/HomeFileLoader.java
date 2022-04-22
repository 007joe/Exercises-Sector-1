package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * This class will load the homes from a file and return a populated map
 */
public class HomeFileLoader {


    public Map<String, Home> loadHomes(){

        Map<String, Home> homeMap = new HashMap<>();

        // read from file
        File inventoryFile = new File("homes.csv");
        Scanner fileScanner = null;

        try {
            fileScanner = new Scanner(inventoryFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //loop through and print out the file records...

        while(fileScanner.hasNextLine()) {

            //parse the record into its individual fields using the split method
            String record = fileScanner.nextLine();
            String[] fields = record.split(",");

            //create home objects
            //MLS456,3,2,1500,240000.50,124 Elm Street,Columbus,Ohio,43223,Formerly owned by the legendary Mr. Krueger... This home is sure to be your next dream nightmare.

            Address address = new Address();
            address.setAddressLine1(fields[5]);
            address.setCity(fields[6]);
            address.setState(fields[7]);
            address.setZip(fields[8]);

            //(String mls, double numberOfBathrooms, int numberOfBedrooms, Address address)
            Home home = new Home(fields[0], Double.parseDouble(fields[2]), Integer.parseInt(fields[1]), address);
            home.setSquareFeet(Integer.parseInt(fields[3]));
            home.setListingPrice(Double.parseDouble(fields[4]));
            home.setDescription(fields[9]);


            //put in a map
            homeMap.put(fields[0], home);


        }


        //return the map
        return homeMap;

    }



}
