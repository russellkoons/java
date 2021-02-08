package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] myInts = getIntegers(5);
	    int[] sorted = sortIntegers(myInts);
	    printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " numbers:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sorted = new int[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//            sorted[i] = array[i];
//        }

        int[] sorted = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sorted.length - 1; i++) {
                if (sorted[i] < sorted[i + 1]) {
                    temp = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sorted;
    }
}
