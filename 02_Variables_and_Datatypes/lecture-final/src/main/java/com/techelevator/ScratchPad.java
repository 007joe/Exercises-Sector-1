package com.techelevator;

public class ScratchPad {

    public static void main(String[] args) {


        //declare a variable and assigning at the same
        int mattsAge = 14;
        mattsAge = mattsAge + 17;

        boolean isAdult = true;    //use camel case naming when using multiple word



        float balance;



        System.out.println("Hello Matt! " + "age is: " + mattsAge);

        balance = (float )100.0;     // decimal 'literal' numbers  --> convert this to double
        balance = 100.0F;            // same as above BUT in shorthand notation


        int numberOfStars = 132;
        long numberOfStarsInUniverse = 12000;
          //12132                 //132       +        //12000
        numberOfStars = numberOfStars + (int) numberOfStarsInUniverse;    //required to cast because the right side is a long
        System.out.println("The number of Stars = "  + numberOfStars);

        System.out.println("Matt" + " " + "Eland");    // String literals

        String firstName = "Matt";
        String lastName = "Eland";

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        System.out.println(firstName);



        int numberOfCookies = 10;
        long numberOfCookiesInStore = 100000;

        numberOfCookiesInStore = numberOfCookies;


        double salary = 12.10;

//        String stateName = "Ohio";
//        String STATENAME = "New York";


    }





}
