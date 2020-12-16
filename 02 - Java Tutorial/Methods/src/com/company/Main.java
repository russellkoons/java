package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        calculateScore(false, 10000, 8, 200);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Russell", position);
        position = calculateHighScorePosition(1000);
        displayHighScorePosition("John", position);
        position = calculateHighScorePosition(500);
        displayHighScorePosition("Steve", position);
        position = calculateHighScorePosition(100);
        displayHighScorePosition("Natalie", position);
    }

    public static int calculateHighScorePosition(int score) {
//        if (score > 1000) {
//            return 1;
//        } else if (score > 500) {
//            return 2;
//        } else if (score > 100) {
//            return 3;
//        } else {
//            return 4;
//        }

        int position = 4;
        if (score > 1000) {
            position = 1;
        } else if (score > 500) {
            position = 2;
        } else if (score > 100) {
            position = 3;
        }

        return position;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;
    }
}
