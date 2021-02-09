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

        anotherArray = new int[] {4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("after modifyArray myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modifyArray anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5}; // this dereferences the reference and doesn't work
    }
}
