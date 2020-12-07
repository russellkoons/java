package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);        
        
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        // If you don't include an f or (float) here you get an error
        float myFloatValue = 5f / 3f;
        // double is the standard floating point type
        double myDoubleValue = 5.00 / 3.00; // Can also add d instead of .00
        System.out.println("myIntValue = " + myIntValue); // returns 1
        System.out.println("myFloatValue = " + myFloatValue); // returns 1.6666666
        System.out.println("myDoubleValue = " + myDoubleValue); // returns 1.6666666666666667

        // float and double challenge
        double pounds = 200d;
        double kilos = pounds * 0.45359237d;
        System.out.println(kilos);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
