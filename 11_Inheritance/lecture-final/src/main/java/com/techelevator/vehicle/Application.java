package com.techelevator.vehicle;

public class Application {

    public static void main(String[] args) {

        Car car = new Car();
        Truck truck = new Truck();
        MiniVan miniVan = new MiniVan();

        Car car2 = new Car();
        Truck truck2 = new Truck();


       if (car.isStarted()) {
           car.shutOff();
       }
       else {
           car.start();
       }



    }

    public void run() {

    }


}
