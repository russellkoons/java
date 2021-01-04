package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your year of birth:");
        int year = scanner.nextInt();
        scanner.nextLine(); // handle next line character (must be used for entering numbers into scanners)

        System.out.println("Your name is " + name + " you are " + (2020 - year) + " years old");

        scanner.close();
    }
}
