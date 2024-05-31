package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS



    /*
     * OPTION 4:
     */
    public void goToWork() throws WorkException {
        // TODO: create an instance of Car with all three properties: vin, make, model

        Car c = new Car("ABC123", "Audi", "S8");

        try {
            c.start();
            c.moveTo("Downtown Austin");
        }
        catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);   // e is the cause
        }
        finally {
            c.stop();
        }
    }





    /*
     * OPTION 3: try-catch, "react in some way," and then re-throw it back at the client
     */
/*       public void goToWork() throws DestinationUnreachableException {
        // TODO: create an instance of Car with all three properties: vin, make, model

        Car c = new Car("ABC123", "Audi", "S8");

        try {
            c.start();
            c.moveTo("Downtown Austin");
        }
        catch (DestinationUnreachableException e) {
            System.out.println("Emailing the mayor to complain");
            throw e;   // The reason string
        }
        finally {
            c.stop();
        }
    }*/


    /*
     * OPTION 2: "punt, " i.e. DON'T catch the exception at all, just ignore it
     */
/*    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("ABC123", "Audi", "S8");

        try {
            c.start();
            c.moveTo("Downtown Austin");
        }
        finally {
            c.stop();

        }
    }*/


    /*
     * OPTION 1: try-catch and "handle" it in some way, so the exception stops here.
     * NOTE
     */
   /* public void goToWork() {
        // TODO: create an instance of Car with all three properties: vin, make, model

        Car c = new Car("ABC123", "Audi", "S8");

        try {
            c.start();
            c.moveTo("Downtown Austin");
        }
        catch (DestinationUnreachableException e) {
            System.out.println(e.getMessage());   // The reason string
        }
        finally {
            c.stop();
        }
    }*/

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}