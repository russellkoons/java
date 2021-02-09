package com.company;

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        return scanner.nextInt();
    }

    private static int[] readElements(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        System.out.println("Enter " + number + " numbers:" );

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
