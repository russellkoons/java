package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int n = scanner.nextInt();
                
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // Handle end of line (enter key)
            counter++;
        }

        scanner.close();
    }
}
