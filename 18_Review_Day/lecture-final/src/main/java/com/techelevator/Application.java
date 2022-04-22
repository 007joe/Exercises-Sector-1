package com.techelevator;

import java.util.List;

public class Application {

    private HomeInventory homeInventory = null;


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
        homeInventory = new HomeInventory();


        while (true) {

            String choice = ui.printMenuOptions();

            //TODO: Remove next line. Here to test looping only
            System.out.println("You picked " + choice);

            if (choice.equals("1")) {    // retrieve all homes
                List<Home> homeList = homeInventory.retrieveHomes();
                ui.printHomes(homeList);
            }
            else if (choice.equals("2")) {    //add a home

                //step 1 call user interface to get a home

                //now take a populated home object and sent to inventory

                //tell user home was added

            }
            else if (choice.equals("3")) {   //delete a home

                //call user interface to ask for an mls id to delete
                String mlsId = ui.askUserForMLSID();
                ui.printStatusMessage(deleteHomeFromInventory(mlsId));

            }
            else if (choice.equals("4")) {    //search for a home

                //ask user for a mls id
                String mlsId = ui.askUserForMLSID();

                //go find it in our inventory class
                Home home = homeInventory.searchByMLSID(mlsId);


                if (home != null) {
                    ui.printHome(home);
                }
                else {
                    ui.printStatusMessage("Home " + mlsId + " was not found!");
                }

            }
            else if (choice.equals("5")) {    // exit program
                break;
            }
            else {   // not a valid choice. let user know
                ui.printStatusMessage("Not a valid choice");
            }

        }

    }

    private String deleteHomeFromInventory(String mlsId) {

        // take that mlsId from user, and pass to the following
        if (homeInventory.deleteHome(mlsId)) {
            return "Home " + mlsId + "was successfully deleted";
        }
        else {
            return "Home: " + mlsId + " did not exist or is the wrong id";
        }

    }


}
