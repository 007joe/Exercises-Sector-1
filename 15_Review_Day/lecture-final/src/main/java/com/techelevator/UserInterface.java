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
        System.out.println("4. Search for a Home (By MLS ID)\n");

        System.out.println("Please select a choice from the above menu");
        String choice = scanner.nextLine();
        return choice;

    }

    public void printHomes(List<Home> homeList) {

        for (Home home : homeList) {

            System.out.println("MLS: " + home.getMlsId() + " Price: " + home.getListingPrice() + " Address: " + home.getAddress().getAddressLine1());
        }

    }


}
