package com.techelevator;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
/* //0 + 1 = 1
		//1 + 1 = 2
		//1 + 2 = 3
		//2 + 3 = 5
		//3 + 5 = 8
		... */

		int total = 0;
int firstNum = 0;
int secondNum = 1;
String fibSequence = "0, 1";
System.out.println("Please enter a whole number: ");
int bestNum = input.nextInt();
System.out.print(fibSequence);
while (total < bestNum) {
	total = firstNum + secondNum;
	if(total < bestNum) {
		System.out.println(", " + total);
		firstNum = secondNum;
		secondNum = total;
	}
}
	}
}
