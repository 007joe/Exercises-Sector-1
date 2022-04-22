package com.techelevator;

// importing each individually
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class Lecture {

	public static void main(String[] args) {

		Lecture lecture = new Lecture();

		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		//be able to declare and create(instantiate) a list
		List<String> ninjas = new ArrayList<>();
		List<Integer> scores = new ArrayList<>();
		List<Double> prices = new ArrayList<>();

        scores.add(100);  // auto box (auto wrap)


		int ex = scores.get(0);     //(auto unbox)

        Integer ex1 = scores.get(0);





		//be able to add things from a list
		     //      lists are zero indexed - start from zero
		     //      lists are ordered (returned in the same order that were inserted)
		     //      lists can grow and shrink in size without the need to recreate the list
		     //      lists can contain duplicate values

		ninjas.add("Bob");
		ninjas.add("Sally");
		ninjas.add("Matt");
		ninjas.add("John");
		ninjas.add("Philmon");

		//be able to insert things in at a certain index
        ninjas.add(2, "Eric");

		//be able to determine list size
	     	//   - use size()

		int numberOfNinjas = ninjas.size();


		//be able to remove a specific item from a list
		String ninjaMatt = ninjas.get(3);


		//be able to loop through the list using a regular for loop
		//  this type of loop we could loop backwards or forwards
		//  manipulate the ixx
		for (int ixx = 0; ixx < ninjas.size(); ixx++) {
			System.out.println(ninjas.get(ixx));
		}

		//be able to loop through the list using a for-each (enhanced) for loop
		//   simpler, but looks at each item in the loop
		//   can't loop backwards
		//   best when you need to look at all items in the list
        for (String ninja : ninjas) {
			if (ninja.equals("Matt")) {
				//exit if current Ninja equals Matt
				break;
			}
			System.out.println(ninja);
		}


//		for (Integer score: scores ) {
//
//		}


		//be able to see if a list contains a specific value


		boolean doesListContainSally = ninjas.contains("Sally");

        if (ninjas.contains("Sally")) {
			System.out.println("This list contains Sally");
			//be able to figure out where specifically that found item is

			int index = ninjas.indexOf("Sally");

			ninjas.remove(index);
			System.out.println("Sally has been removed from the list");
		}

		System.out.println("*******************************************************************");


		//nice to know:  be able to reverse the list
		//Collections.reverse(nameOfList) modifies the original list, doesn't require assignment

		Collections.reverse(ninjas);

		for (String ninja : ninjas ){
			System.out.println(ninja);
		}


		//nice to know:  be able to sort a list in ascending order (you can also do customized sorts - beyond our scope at this point)
		//Collections.sort(nameOfList) modifies the original list, doesn't require assignment

		Collections.sort(ninjas);

		System.out.println("*******************************************************************");


		for (String ninja : ninjas ){
			System.out.println(ninja);
		}


		//nice to know:  be able to take a list and convert it into an array using a standard for loop, or for-each loop (long way)


		    //take our ninja list and move the values into an String array

		      // STEP 1 = create a String[] that is the same size as the ninja arraylist
		      String[] ninjaArray = new String[ninjas.size()];

		      // Loop through each item in the ninja array list, get the value and put the value in our array
		      for (int x = 0; x < ninjas.size(); x++) {
				  ninjaArray[x] = ninjas.get(x);
			  }

		System.out.println("");


		//nice to know:  be able to take a list and convert it into an array using the shortcut method ()

		String[] alternateNinjaArrayWay = ninjas.toArray(new String[0]);

		System.out.println("");





	}
}
