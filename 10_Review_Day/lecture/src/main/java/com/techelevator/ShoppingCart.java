package com.techelevator;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {
    //instantiate a cart to put items when selected by product code
    private TreeMap<String, MenuItem> cart = new TreeMap<>();
    //give access to cateringInventory methods
    CateringInventory cateringInventory = new CateringInventory();

    //takes input from scanner.nextLine() > productCode parameter and uses it to grab items and set quantity to 1
    public TreeMap<String, MenuItem> addItem(String productCode) {
        cart.put(productCode.toUpperCase(), cateringInventory.getInventory().get(productCode.toUpperCase()));
        //product quantity is 25 by default in the constructor for each item, so we set product to 1 the first time it's selected
        if (cart.get(productCode.toUpperCase()).getQuantity() == 25) {
            cart.get(productCode.toUpperCase()).setQuantity(1);
            return cart;
            //if product quantity is already 1, increment it by 1 (unless 25)
        } else if (cart.get(productCode.toUpperCase()).getQuantity() == 1
                || cart.get(productCode.toUpperCase()).getQuantity() < 25) {
            cart.get(productCode.toUpperCase()).setQuantity(cart.get(productCode.toUpperCase()).getQuantity() + 1);
            return cart;
        }
        return cart;
    }

    //get the quantity of each item in the map and multiply it by its price to calculate total
    public double calculateTotal(TreeMap<String, MenuItem> cart) {
        //cart total is set to 0
        double total = 0;
        //give access to every item that has been added to the cart via the additem() method
        for (Map.Entry<String, MenuItem> item : cart.entrySet()) {
            //multiply the price of the item * how many of those items are in the cart and set the total
            total += item.getValue().getQuantity() * item.getValue().getProductPrice();
        }
        return total;
    }

    public TreeMap<String, MenuItem> getCart() {
        return cart;
    }
}

    }
}
