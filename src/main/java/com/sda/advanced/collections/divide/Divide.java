package com.sda.advanced.collections.divide;


public class Divide {
    public static void main(String[] args) throws CannotDivideBy0Exception {

        division(1, 0);

    }

    private static float division(int a, int b) throws CannotDivideBy0Exception {
        try {
            float div = a / b;
            return div;
        } catch (Exception e) {
            throw new CannotDivideBy0Exception("Cannot divide by zero.");
        }

    }

}