package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int year = scanner.nextInt();
            scanner.nextLine(); // handle next line character (must be used for entering numbers into scanners)

            if ((2020 - year) >= 0 && (2020 - year) <= 120) {
                System.out.println("Your name is " + name + " you are " + (2020 - year) + " years old");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Invalid year of birth");
        }

        scanner.close();
    }
}
