package com.company;

import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));

        int[] reversed = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int hold = array[i];
            reversed[array.length - 1 - i] = hold;
        }

        System.out.println("Reversed array = " + Arrays.toString(reversed));
    }
}
