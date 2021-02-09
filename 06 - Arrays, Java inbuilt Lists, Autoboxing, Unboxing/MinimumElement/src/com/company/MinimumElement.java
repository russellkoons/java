package com.company;

import java.util.Scanner;

public class MinimumElement {
    public int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        return scanner.nextInt();
    }

    public int[] readElements(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        System.out.println("Enter " + number + " numbers:" );

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }
}
