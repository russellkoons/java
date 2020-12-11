package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score <= 5000) {
            System.out.println("Your score was 5000");
        } else if (score < 1000) {
            System.out.println("Score was less than 1000");
        } else {
            System.out.println("Got here");
        }
        System.out.println("This was executed");

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // int savedFinalScore = finalScore; Doesn't work because finalScore is in code block
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
