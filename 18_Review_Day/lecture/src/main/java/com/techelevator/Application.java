package com.techelevator;

import java.util.List;

public class Application {


    /**
     * The main entry point in the application
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {

        // create an instance of the UserInterface and home inventory
        UserInterface ui = new UserInterface();
        HomeInventory homeInventory = new HomeInventory();

        while (true) {

            String choice = ui.printMenuOptions();

            //TODO: Remove next line. Here to test looping only
            System.out.println("You picked " + choice);

            if (choice.equals("1")) {    // retrieve all homes
                List<Home> homeList = homeInventory.retrieveHomes();
                ui.printHomes(homeList);
            }
            else if (choice.equals("2")) {    //add a home

            }
            else if (choice.equals("3")) {   //delete a home

            }
            else if (choice.equals("4")) {    //search for a home

            }
            else if (choice.equals("5")) {    // exit program
               break;
            }
            else {   // not a valid choice. let user know
                ui.printStatusMessage("Not a valid choice");
            }

        }

    }


}
