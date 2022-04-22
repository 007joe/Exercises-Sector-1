package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {

        //lets create a map to store number of homes for sale by zip code
        Map<Integer, Integer> homesForSale = new HashMap<>();


        //lets create a map to store error codes(key) and descriptions (value)  Map<KEY, VALUE>
        //assumption that error codes are alphanumeric (123, 404, A123)
        Map<String, String> errorCodes = new HashMap<>();



        //be able to put things in the map
        errorCodes.put("404", "Not Found!");
        errorCodes.put("403", "Forbidden");
        errorCodes.put("418", "I'm a teapot!");
        errorCodes.put("403", "Seriously, you don't have access!");

        //be able to get things out of the map

        String error418Description = errorCodes.get("418");     // goes to the map, and looks up the value for key 418

        System.out.println(error418Description);

        errorCodes.put("418", error418Description + " and I am short and stout!");


        //what happens when we can't find something in the map?
        String errorCode500 = errorCodes.get("418");

        if (errorCode500 != null) {
           errorCode500 = errorCode500.toUpperCase();
        }
        else {
            errorCode500 = "Not found!";
        }

        System.out.println(errorCode500);


        if (errorCodes.containsKey("418")) {


        }



        //option 1 - iterating through a map using a Set

        //retrieving a set of keys from the map
        Set<String> keys = errorCodes.keySet();

        // looping through the entire set one key at a time
        for (String key : keys) {

            // going to the map using our current key, grabbing the value and printing it out.
            System.out.println(key + ": " + errorCodes.get(key));
        }

        System.out.println("***********");


        //option 2 using Map.Entry (gets the key and the value at the same time)

        // Map.Entry represents the key AND the value

        for (Map.Entry<String, String> errorEntry : errorCodes.entrySet()  ) {
            System.out.println(errorEntry.getKey() + " " + errorEntry.getValue());
        }













    }



}
