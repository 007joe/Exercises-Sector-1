package com.techelevator.fly;

public class Time implements Flyable{

    private int hoursSinceMattSlept;

    public int getHoursSinceMattSlept() {
        return hoursSinceMattSlept;
    }

    public void setHoursSinceMattSlept(int hoursSinceMattSlept) {
        this.hoursSinceMattSlept = hoursSinceMattSlept;
    }

    @Override
    public String fly() {
       return "Like sand through an hour glass";
    }
}
