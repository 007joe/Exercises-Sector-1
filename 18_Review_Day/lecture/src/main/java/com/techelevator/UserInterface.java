package com.techelevator;

import java.util.List;
import java.util.Scanner;

/**
 * Create and display menus, get user input and print any output
 */
public class UserInterface {

    //declaring a scanner for user input later
    private Scanner scanner;


    public UserInterface() {
        //creating/instantiating the scanner
        scanner = new Scanner(System.in);
    }


   public String printMenuOptions() {

        System.out.println("*****************************************");
        System.out.println("******  Vinny's Real Estate Empire  *****");
        System.out.println("*****************************************\n");


        System.out.println("1. Retrieve all Homes");
        System.out.println("2. Add a Home");
        System.out.println("3. Delete a Home");
        System.out.println("4. Search for a Home (By MLS ID)");
        System.out.println("5. Exit \n");

        System.out.println("Please select a choice from the above menu");
        String choice = scanner.nextLine();
        return choice;

    }

    public void printHomes(List<Home> homes) {

        for (Home home : homes) {
            printHome(home);
        }

    }


    /**
     * This method prints out a single home.  We 'could' have put this up in the for each loop above, but breaking
     * it out on it's own keeps the code above cleaner AND we can also reuse when printing out the home from menu option 2
     *
     * @param home
     */
    public void printHome(Home home) {


        System.out.println("\nMLS Number: " + home.getMlsId());

        if (home.getAddress() != null) {
            System.out.println("Street Address: "
                    + home.getAddress().getAddressLine1() + " "
                    + home.getAddress().getCity() + " "
                    + home.getAddress().getState() + " "
                    + home.getAddress().getZip() + "\n");
        }

        System.out.println(String.format("%-25s %s", "Bedrooms: ", home.getNumberOfBedrooms()));
        System.out.println(String.format("%-25s %s", "Bathrooms: ", home.getNumberOfBathrooms()));
        System.out.println(String.format("%-25s %s", "Square Feet: ", home.getSquareFeet()));
        System.out.println(String.format("%-25s $%s", "Price: ", String.format("%.2f", home.getListingPrice())));
        System.out.println("\nDescription: " + home.getDescription());

    }

    public void printStatusMessage(String message) {
        System.out.println(message);
    }



}
