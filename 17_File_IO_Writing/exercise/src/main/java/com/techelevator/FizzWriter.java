package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is the destination file?");
        String fizzFile = userInput.nextLine();
        File buzzFile = new File(fizzFile);

        try (PrintWriter fizzBuzzWrite = new PrintWriter(buzzFile)) {
            for (int i = 1  ; i <= 300; i++) {
                if (i % 5 == 0 && i % 3 == 0) {
                    fizzBuzzWrite.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    fizzBuzzWrite.println("Fizz");
                } else if (i % 5 == 0) {
                    fizzBuzzWrite.println("Buzz");
                } else {
                    fizzBuzzWrite.println(i);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find file");
        }
    }
}
