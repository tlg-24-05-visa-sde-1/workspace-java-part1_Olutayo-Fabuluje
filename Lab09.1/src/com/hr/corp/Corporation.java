/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.corp;

import gov.irs.TaxPayer;

/**
 * Corporate entity - also pays taxes.
 */
public class Corporation implements TaxPayer {
    public static final double STANDARD_DEDUCTION = 1_000_000.0;

    private String name;



    public Corporation(String name) {
        setName(name);
    }

    public double getTax() {
        return STANDARD_DEDUCTION;
    }

    // I am OPTING to do
    @Override  // interface TaxPayer
    public void payTaxes() {
        System.out.println(getName() + " paid no taxes - we lobbied hard and it worked");
    }

    // I am OPTING to do this behavior differently
    @Override  // interface TaxPayer
    public void fileReturn() {
        System.out.println("Return not filed - we sent our lawyers instead");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}