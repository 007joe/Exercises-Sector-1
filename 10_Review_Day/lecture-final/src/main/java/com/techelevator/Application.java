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

        String choice = ui.printMenuOptions();

        System.out.println(choice);

        if (choice.equals("1")) {
            List<Home> homeList = homeInventory.retrieveHomes();
            ui.printHomes(homeList);
        }









    }


}
