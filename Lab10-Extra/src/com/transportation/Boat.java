package com.transportation;

public class Boat  extends Vehicle {

    public Boat(String vin) {
        super(vin);
    }

    @Override
    public void moveTo(String location) {
        System.out.println("Going to " + location + " by boat.");

    }
}
