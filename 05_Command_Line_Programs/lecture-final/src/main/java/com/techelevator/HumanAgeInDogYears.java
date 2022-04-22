package com.techelevator;

import java.util.Scanner;

public class HumanAgeInDogYears {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("OPTION 1: How old are you human?");
        String answer = scanner.nextLine();              //  20, we get "20"

        // int ==>  Integer
        int age = Integer.parseInt(answer);
        // long ==> Long
        long ageInLong = Long.parseLong(answer);
        // boolean ==> Boolean
        double ageInDouble = Double.parseDouble(answer);

        int ageInDogYears = age * 7;
        System.out.println("Your age in human years: " + age + ", your age in dog years: " + ageInDogYears);


        System.out.println("OPTION 2: How old are you human?");
        int ageAsInteger = scanner.nextInt();     // 3\n
        scanner.nextLine();                      // eat up that extra newline character that is left behind from above.

        System.out.println("OPTION 2: What is your favorite Meatloaf song?");
        String song = scanner.nextLine();

        System.out.println("My favorite song is: " + song);


        System.out.println("OPTION 3:  Enter human ages as a series of numbers separated by commas?");
        String values = scanner.nextLine();      // ex: 12,2,4,5   ==>   "12,3,4,5"
        System.out.println(values);

        String[] inputValues = values.split(",");

        for (int i = 0; i<inputValues.length; i++) {

            //convert the string value at element i to an int
            String tempVal = inputValues[i];
            int valueAsInt = Integer.parseInt(tempVal);

            // calculate dog years (* 7) and print
            System.out.println("Human age: " + tempVal + " dog age: " + (valueAsInt * 7) );




        }

        System.out.println("");




    }
}
