package com.hr.personnel;

import gov.irs.TaxPayer;

import java.io.Serializable;
import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;



    // Constructor
    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super (name, hireDate);
    }


    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        setRate(rate);
        setHours(hours);
    }


    //Business Methods


    @Override
    public void payTaxes() {
        double taxes = getRate() * getHours() * HOURLY_TAX_RATE;
        System.out.printf("%s paid hourly tax %s", getName(), taxes);
    }

    @Override
    public void pay() {
        System.out.println(getName() + " is paid hourly " + getRate() * getHours());
    }



    // Accessor Methods

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


    public double getHours() {
        return hours;
    }


    public void setHours(double hours) {
        this.hours = hours;
    }


    @Override
    public String toString() {
        // delegate to superclass toString() (Employee) for classname, name, and hireDate info
        // and then add my bit: rate and hours
        return super.toString() + ", rate=" + getRate() + ", hours=" + getHours();
    }
}
