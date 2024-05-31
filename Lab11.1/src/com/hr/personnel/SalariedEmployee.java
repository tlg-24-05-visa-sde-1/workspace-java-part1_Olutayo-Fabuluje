package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    public static final double STANDARD_DEDUCTION = 10_000.0;
    private double salary;

    // Constructors

    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);          // delegate to superclass ctor, which handles name, hireDate
        setName(name);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);        //delegate to superclass ctor, which handles name, hireDate
        setSalary(salary);            // handle salary myself, by delegating to its setter
    }


    // business or action-oriented methods

    @Override    // interface TaxPayer
    public void payTaxes() {
        double taxes = getSalary() * SALARIED_TAX_RATE;
        System.out.printf("%s paid salary taxes of %s.%n", getName(), taxes);

    }

    @Override
    public double getStandardDeduction() {
        return STANDARD_DEDUCTION;
    }

        @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation");
    }



    //accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        // delegate to superclass toString() (Employee) for classname, name, and hireDate info
        // and then add my bit: rate and hours
        return super.toString() + ", salary=" + getSalary();
    }
}
