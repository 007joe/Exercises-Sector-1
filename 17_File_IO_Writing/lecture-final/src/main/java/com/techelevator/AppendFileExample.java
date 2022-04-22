package com.techelevator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.io.*;

public class AppendFileExample {


    public static void main(String[] args) {

        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\temp\\demo2\\example.txt", true)))) {

            out.println("This is a line ");
            out.flush();

        }
        catch (Exception e) {
            e.printStackTrace();
        }




    }

}
