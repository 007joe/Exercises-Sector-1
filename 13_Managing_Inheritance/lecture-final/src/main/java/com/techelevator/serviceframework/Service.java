package com.techelevator.serviceframework;

public abstract class Service {

    public boolean isAuthenticated (String userid) {

        return true;

    }

    public void logDetails(String details) {

        //write to a log file

    }


    public abstract String execute(String request);   //delegated and forced execution to the subclass



}
