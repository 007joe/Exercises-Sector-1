package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the search word?");
        String searchedWord = userInput.nextLine();

        System.out.println("What is the replacement word?");
        String replacedWord = userInput.nextLine();

        System.out.println("What is the source file?");
        String sourceFile = userInput.nextLine();
        File pathFile = new File(sourceFile);

        System.out.println("What is the destination file?");
        String destinationFile = userInput.nextLine();
        File pathWay = new File(destinationFile);

        try (Scanner fileScan = new Scanner(pathFile)) {
        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist");
        }

        try (Scanner fileScan = new Scanner(pathFile);
             PrintWriter newPrint = new PrintWriter(pathWay);) {
            while (fileScan.hasNextLine()) {

                String writeLine = fileScan.nextLine();
                newPrint.println(writeLine.replace(searchedWord, replacedWord));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File can not be written");
        }
    }
}







