/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);   // toString() automatically called

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 2500.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 75.0, 40.0));

        dept.addEmployee(new SalariedEmployee("AC", LocalDate.of(1990, 7, 17), + 1500.0));
        dept.addEmployee(new HourlyEmployee("Melle", LocalDate.of(1990, 8, 24), + 30.0, + 40.00));

        dept.addEmployee(new Executive("Jay", LocalDate.of(1997, 7, 10), + 1_000_000.0));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        System.out.println("\nPay all employees");
        dept.payEmployees();

        System.out.println("\nHoliday break ");
        dept.holidayBreak();

    }
}