package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int n = scanner.nextInt();
                counter++;
                sum += n;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // Handle end of line (enter key)
        }

        System.out.println("Your sum is " + sum);
        scanner.close();
    }
}
