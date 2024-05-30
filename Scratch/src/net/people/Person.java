package net.people;/*
 * Immutable class. More accurately, this is a class definition written
 * in such a way that instances of, once created, cannot have their properties changed.
 * There are simply no public methods available to do so.
 */

import java.time.LocalDate;
import java.time.Period;

class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /*
     * Returns the person's age in whole years
     * HINT: this is the period of time between birthDate and today's date, in whole years.
     * This is called a "derived property" i.e., its value can be "calculated" or derived
     * from the existing fields that we have.
     */

    public int getAge() {
        return Period.between(getBirthDate(), LocalDate.now()).getYears();
    }


    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Person: name=%s, birthDate=%s", getName(), getBirthDate());
    }

    public String toString(LocalDate birthDate) {
        return this.getName() + birthDate.toString();
    }



}