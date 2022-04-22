package com.techelevator;

import com.sun.source.tree.Tree;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class CateringInventory {

    //instantiate class accessible inventory map
    private TreeMap<String, MenuItem> inventory;
    private ArrayList<String> productCodes;

    public CateringInventory() {
        //instantiate fileReader
        FileReader fileReader = new FileReader();

       //assign the map returned from fileReader to the inventory nap

       inventory = fileReader.getMenuItems();

    }

    //list of product codes
    public ArrayList<String> getProductCodes() {
        productCodes = new ArrayList<>();
        for (Map.Entry<String, MenuItem> code : inventory.entrySet()) {
            productCodes.add(code.getKey());
        }
        return productCodes;
    }

    //when customr adds an item to cart
    //decrement quantity available (starting at 25)
    public void decrementInventory(TreeMap<String, MenuItem> inventoryMap, String productCode) {
        if (inventoryMap.get(productCode.toUpperCase()).getQuantity() > 0 ) {
            inventoryMap.get(productCode.toUpperCase()).setQuantity(inventoryMap.get(productCode.toUpperCase()).getQuantity() - 1);
        }
    }

    //public accessor for inventory TreeMap
    public TreeMap<String, MenuItem> getInventory(){
        return inventory; }
    }
}
