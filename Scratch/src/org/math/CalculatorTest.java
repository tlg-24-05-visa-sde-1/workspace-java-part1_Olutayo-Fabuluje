package org.math;

class CalculatorTest {

    public static void main(String[] args) {
        boolean isCorrect = true;

        // call Calculator.randomInt(5, 20) 1 Million times
        // if it ever comes back < 5 or > 20 You know that its broken

        for(int i = 0; i< 100_000_000; i++) {
            int result = Calculator.randomInt(5, 20);
            if (result < 5 || result > 20) {   //HOUSTON WE HAVE A PROBLEM
                isCorrect = false;
                break;
            }
        }

        if (isCorrect) {
            System.out.println("IT WORKS !!!");
        }
        else {
            System.out.println("ITS BROKEN!!!");
        }
    }
}