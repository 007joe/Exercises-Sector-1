package com.techelevator;

import java.util.Scanner;
public class TempConvert {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Please enter the temperature: ");

		int temp = myScanner.nextInt();
		myScanner.nextLine();
		System.out.print("Is the temperature in (C)elcius, or (F)arenheit? ");
		String fOrC = myScanner.nextLine();
		System.out.println(temp + fOrC + " is " + convertIt(temp, fOrC) + (fOrC.toUpperCase().startsWith("F") ? "C" : "F"));
	}
	public static int convertIt(int temp, String fOrC) {
		if (fOrC.toUpperCase().startsWith("F")){
			int resultTempCelcius = (int) ((temp - 32) / 1.8);
			return resultTempCelcius;
		} else{
			int resultTempFarenheit = (int) (temp * 1.8 + 32);
			return resultTempFarenheit;
		}
	}
		}
