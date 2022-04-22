package com.techelevator;

import java.util.*;

public class HomeInventory {



    private Map<String, Home> inventory;    // key, value   key is a String(mls),  value Home


    public HomeInventory() {

        //load my map with some sample Homes
        HomeFileLoader loader = new HomeFileLoader();
        inventory = loader.loadHomes();

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


    public void addHome(Home home) {
        inventory.put(home.getMlsId(), home);
    }

    public Home searchByMLSID(String mlsId) {
        return inventory.get(mlsId);
    }

    /**
     *  This method removes a home from inventory if the mlsId was found, else return false if not found
     * @param mlsId
     * @return true if deleted, false if not found
     */

    //Note: A somewhat better approach could be to have this method raise a custom exception (eg. HomeNotFoundException) and
    //use the throws in method signature to pass it up to the calling method.
    public boolean deleteHome(String mlsId)  {

        if (inventory.containsKey(mlsId)) {
            //we found the home, now delete it
            inventory.remove(mlsId);
            return true;
        }
        else {
            //was not found
           return false;
        }

    }

}
