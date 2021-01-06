package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean invalid = false;

        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int n = scanner.nextInt();
                if (min == 0 && max == 0) {
                    min = n;
                    max = n;
                } else if (n < min) {
                    min = n;
                } else if (n > max) {
                    max = n;
                }
            } else {
                invalid = true;
            }

            if (invalid) {
                break;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        scanner.close();
    }
}
