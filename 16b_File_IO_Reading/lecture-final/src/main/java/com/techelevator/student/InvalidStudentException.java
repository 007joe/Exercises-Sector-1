package com.techelevator.student;

public class InvalidStudentException extends Exception {


    private String firstName;
    private int errorCode = 300;

    public InvalidStudentException (String firstName) {
        this.firstName = firstName;
    }

    public String getMessage() {
        return "Error Code: " + errorCode + "Details: " + firstName + " is not a valid student";
    }




}
