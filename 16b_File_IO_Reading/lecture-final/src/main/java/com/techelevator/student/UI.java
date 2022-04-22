package com.techelevator.student;

import java.util.List;
import java.util.Scanner;

public class UI {

    Scanner scanner = new Scanner(System.in);  //keyboard scanner


    public String getFileNameFromUser() {

        System.out.println("Please enter the name of your student file: ");
        String fileName = scanner.nextLine();
        return fileName;


    }


    public void printStudents(List<Student> studentList) {

        for (Student s : studentList) {
            System.out.println(s.toString());
        }

    }

    public void printMessage(String errorMsg) {
        System.out.println(errorMsg);
    }





}
