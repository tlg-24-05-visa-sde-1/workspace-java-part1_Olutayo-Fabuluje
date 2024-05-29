/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

/**
 * The Employee class is fairly simple, serving as a superclass to illustrate inheritance.
 *
 * Properties:
 *   String name
 *   LocalDate hireDate
 *
 * Methods (excluding get/set methods):
 *   void work()        simulates work by printing a message to show it was called.
 *   String toString()  self-explanatory.
 */
public abstract class Employee implements TaxPayer {
    // fields
    private String name;
    private LocalDate hireDate;

    // constructors
    public Employee() {
    }

    public Employee(String name) {
        super();
    }

    public Employee(String name, LocalDate hireDate) {
        super();
        setHireDate(hireDate);
        setName(name);
    }



    // business methods

    // "all employees get paid" -> they all have this behavior in common so pay() goes here
    // the problem is we can't really implement here, to come up with a $$$ figure
    // all we have is name and hireDate


    // We need a way to say "all employees get paid, i.e. we NEED a pay() method here.
    // BUT we cant implement here, all we have is name and hireDate
    // SO we say "THAT " "all employees get paid", but we don't say "HOW"
    public abstract void pay();


    // "all employees work" -> they all have this behavior in common so work() goes here
    // AND they all do it the same way, they work "hard
    public void work() {
        System.out.println(getName() + " working hard since " + getHireDate());
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.getClass().getSimpleName() + ": name=" + getName() + ", hireDate=" + getHireDate();
    }
}