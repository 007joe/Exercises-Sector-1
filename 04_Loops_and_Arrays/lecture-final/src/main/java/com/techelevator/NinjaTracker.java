package com.techelevator;

public class NinjaTracker {

    public static void main(String[] args) {


        //declare an int array for scores
        int size = 10;

        int[] scores = new int[size];
        scores[0] = -1;
        scores[1] = -1;


        scores[0] = 90;


        //create an array to hold our ninja students
        String[] ninjaNames = new String[10];    // declared and created/initialized an array of size 10
                                                 // that contains Strings and is called ninjaNames

        String matt = "Matt";


        //populate our array
        ninjaNames[0] = "Lucas";   // --> Put Lucas in the first element
        ninjaNames[8] = "Naveenajancy";
        ninjaNames[2] = "Katherine";
        ninjaNames[3] = "Michael";
        ninjaNames[4] = matt;
        ninjaNames[9] = "Tasha";


        //static array initialization - use this if you know values in advance
        // double[] prices = new double[5]; --> creates an empty array of size 5

        //create an array and initialize the values - size is determined by the entry values
        //double[] prices = new double[] {1.00, 2.00, 3.45, 45.45, 110.00};

        // same as above but shorthand
        double[] prices = {1.00, 2.00, 3.45, 45.45, 110.00};

        double calc = prices[0] + prices[1];
        System.out.println(calc);

        //retrieve items out of our array

        String katherine = ninjaNames[2];
        System.out.println("Ninja: " + katherine);        //option 1
        System.out.println("Ninja: " + ninjaNames[2]);    // option 2


        //get the length array using the length
        int sizeOfPrices = prices.length;
        System.out.println(sizeOfPrices);

        int sizeOfNinjaClass = ninjaNames.length;
        System.out.println(sizeOfNinjaClass);


        //how could I get the ninja in the  last element of the ninjaNames array?
        String lastNinja = ninjaNames[ninjaNames.length - 1];
        System.out.println(lastNinja);
                              //    ninjaNames[9]


        // replace Matt who is at ninjaNames[4] with Sawyer
        ninjaNames[4] = "Sawyer";


        //increment operators

        int num1 = 7;
//        num1 = num1 + 1;

        System.out.println(++num1);
        System.out.println(num1);

        num1 *= 2;   // num1 = num1  * 2
        System.out.println(num1);


      //  int sum1 = sum1 + 2;
      //  sum1 += 2;



        //create a for loop that loops 10 times
           // initialization var ;  testing condition  ; increment/decrement
//        for(int i = 0; i < 10;  i++) {
//            System.out.println(i);
//        }

        // loop through and print out multiples of 5 up to 100
        for (int i = 0; i < 101; i+=5) {
 //           System.out.println(i);
        }

        //loop backwards from 20   (i is out counter, starts at 20 and each time through the loop we go down by 1)
        for (int i = 20; i>= 0; i--) {
            System.out.println(i);
        }

        //loop through our ninjaNames array and print out every value.
        for(int ctr=0; ctr < ninjaNames.length; ctr++ ) {
            System.out.println(ninjaNames[ctr]);
        }

//        for (int i = 0; i<1000000; i++) {
//            System.out.println(i);
//        }

        for (int i = 0; i <ninjaNames.length; i++ ) {

            System.out.println(ninjaNames[i]);

            if (ninjaNames[i] != null) {

                if(ninjaNames[i].equals("Michael")) {     // if I was testing numbers ==, strings use .equals()
                    System.out.println("We found Michael!");
                    break;
                }

            }


        }

        // length is 10?  What is the last index = 9
        //  if counter goes past the length of array  ie ninjaNames[10]

        for(int ctr=0; ctr < ninjaNames.length; ctr++ ) {
            System.out.println(ninjaNames[ctr]);
        }




    }

    public double calculateSum(double[] nums) {


        String statusMsg = "ABC";
        double sum = 0;

        //sum up some numbers here

        if (sum == 0) {
            statusMsg = "The sum is 0";
        }
        else {
            statusMsg = "We have a sum!";
        }

        System.out.println(statusMsg);
        return 0.0;

    }



}
