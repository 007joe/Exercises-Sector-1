package com.techelevator.student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTracker {

    public static void main(String[] args) {

        StudentTracker tracker = new StudentTracker();
        UI ui = new UI();

        String fileName = ui.getFileNameFromUser();

        try {
            List<Student> myList = tracker.readStudentsFromFile(fileName);
            ui.printStudents(myList);

        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();

            //loop around and ask
        }
        catch (InvalidStudentException ex) {
            ex.printStackTrace();
            ui.printMessage(ex.getMessage());
        }


    }


    private List<Student> readStudentsFromFile(String fileName) throws FileNotFoundException, InvalidStudentException {

        List<Student> studentList = new ArrayList<>();


        File file = new File(fileName);  //create an object reference of the file



            Scanner fileScanner = new Scanner(file);   // file scanner - read from the students.txt above

            while (fileScanner.hasNextLine()) {
                String record = fileScanner.nextLine();

                String[] fields = record.split(",");

                int age = Integer.parseInt(fields[2]);
                if (age > 17) {
                    //throw our exception
                    throw new InvalidStudentException(fields[0]);
                }

                Student student = new Student(fields[0], fields[1], age);
                studentList.add(student);

            }


        return studentList;

    }


}


