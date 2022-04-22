package com.techelevator;

import java.util.Scanner;

public class SimpsonsVacation {


    public static void main(String[] args) {

        //create and initialize a scanner to read from the console (keyboard)
        Scanner myScanner = new Scanner(System.in);


        while (true) {

            System.out.println("Are we there yet? Enter (Y)es or (N)o");
            String answer = myScanner.nextLine();  // reads in Yes\n  and removes the \n => Yes

            System.out.println("You answered with: " + answer);

            if (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y")) {
                System.out.println("Cowabunga! ");
                break;
            } else {
                System.out.println("Eat my shorts!");
            }

        }

        System.out.println("Exiting program");

    }



}
