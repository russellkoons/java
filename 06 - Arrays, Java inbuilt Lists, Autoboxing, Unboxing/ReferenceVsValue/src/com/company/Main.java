package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int myInt = 10;
	    int anotherInt = myInt;

        System.out.println("myInt = " + myInt);
        System.out.println("anotherInt = " + anotherInt);

        anotherInt++;

        System.out.println("myInt = " + myInt);
        System.out.println("anotherInt = " + anotherInt);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1; // This changes both arrays. Reference types point to the same address in memory

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));
    }
}
