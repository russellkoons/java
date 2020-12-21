package com.company;

public class Main {

    public static void main(String[] args) {
	    calculateScore("Russell", 500);
    }

    public static int calculateScore(String name, int score) {
        System.out.println("Player " + name + " scored " + score + " points");
        return score * 1000;
    }
}
