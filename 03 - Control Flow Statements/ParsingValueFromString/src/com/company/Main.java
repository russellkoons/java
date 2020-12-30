package com.company;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        // First concatenates since it is a string, second adds it since it is an int
        numberAsString += 1;
        number += 1;

        System.out.println(numberAsString + " " + number);
    }
}
