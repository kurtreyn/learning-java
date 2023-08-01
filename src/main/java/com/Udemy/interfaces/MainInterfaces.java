package com.Udemy.interfaces;


public class MainInterfaces {

    public static void main(String[] args){
        Bird bird = new Bird();
        Animals animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;
        Trackable truck = new Truck();

        animal.move();
//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();

        inFlight(flier);
        inFlight(new Jet());
        truck.track();

    }

    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }
}
