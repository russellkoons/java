package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 7, 11, 9, 15};

        System.out.println(Arrays.toString(array));
        reverse2(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverse2(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
