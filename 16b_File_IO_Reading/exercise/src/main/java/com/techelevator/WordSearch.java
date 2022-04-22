package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner newScan = new Scanner(System.in)) {
			System.out.println("What is the fully qualified name of the file that should be searched");
			String fileName = newScan.nextLine();
			File pathFile = new File(fileName);

			System.out.println("What is the search word you are looking for?");
			String searchWord = newScan.nextLine();
			System.out.println("Should the search be case sensitive? (Y/N)");
			String yesNo = newScan.nextLine();

			boolean caseSensitive = false;
			if (yesNo.equalsIgnoreCase("y")) {
				caseSensitive = true;
			}

			try (Scanner newScan2 = new Scanner(pathFile)) {
				int countLine = 1;
				while (newScan2.hasNextLine()) {
					String fileLine = newScan2.nextLine();
					if (caseSensitive) {
						if (fileLine.contains(searchWord)) {
							System.out.println(countLine + ") " + fileLine);
						}
					} else {
						if (fileLine.toUpperCase().contains(searchWord.toUpperCase())) {
							System.out.println(countLine + ") " + fileLine);
						}
					}
					countLine++;
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}
}

		/*
		}
		try (Scanner newScan2 = new Scanner(pathFile)) {
			int countLine = 0;
			while (newScan2.hasNextLine()) {
				String fileLine = newScan2.nextLine();
				if (fileLine.contains(searchWord) && caseInsensitive) {
					System.out.println(countLine + ") " + fileLine);


				} else if(caseInsensitive) {
					System.out.println(countLine + ") "+ fileLine);
				}
				countLine++;
			}
		} catch (IOException e) {
			System.out.println("Sorry, there's an ERROR");
		}
	} */
