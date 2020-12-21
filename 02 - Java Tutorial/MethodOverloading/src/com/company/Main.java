package com.company;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Russell", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
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
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
    }
}
