package com.company;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Russell", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(7, 5);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeters(100);
    }

    public static int calculateScore(String name, int score) {
        System.out.println("Player " + name + " scored " + score + " points");
        return score * 1000;
    }

    // you can create another method with the same name if you change the number of parameters, it's based on parameters and data types
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name or score");
        return 0;
    }

    // You cannot do this
//    public static void calculateScore() {
//        System.out.println("No player name or score");
//    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = ((feet * 12) + inches) * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
