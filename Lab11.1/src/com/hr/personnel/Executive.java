package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {
    public static final double STANDARD_DEDUCTION = 100_000.0;

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " enjoying a nice round of golf");
    }


    @Override   // interface TaxPayer
    public void fileReturn() {
        System.out.println("Return filed electronically");

    }

    @Override
    public double getStandardDeduction() {
        return 100_000.0;
    }
}
