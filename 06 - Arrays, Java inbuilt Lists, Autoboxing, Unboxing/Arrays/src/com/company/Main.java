package com.company;

public class Main {

    public static void main(String[] args) {
	    // int[] myArray = new int[10]; // int[] says it's an array, int[10] says it has 10 slots
        // myArray[5] = 50; // This adds 50 to the 6th position (start at 0)
        // int[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // This initializes the array with all the elements in it
        int[] myArray = new int[10]; // How to initialize with a for loop

        for (int i = 0; i < 10; i++) {
            myArray[i] = i * 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(myArray[i]);
        }

        double[] doubleArray = new double[10];

        System.out.println(myArray[5]);
    }
}
