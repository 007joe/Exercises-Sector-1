package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the length: ");

		double measure = userInput.nextDouble();
		userInput.nextLine();
		System.out.print("Is the measurement in (m)eters or (f)eet? ");
		String measureType = userInput.nextLine();
		System.out.println(measureType + measure + " is " + linConvert(measure, measureType) + (measureType.toLowerCase().startsWith("m") ? "f" : "m"));
	}
	public static double linConvert(double measure, String measureType) {
		if(measureType.toLowerCase().startsWith("m")) {
			double resultsInFeet = measure * 3.2808399;
			return resultsInFeet;
		} else {
			double resultsInMeters = measure * 0.3048;
			return resultsInMeters;
		}
		}
}
