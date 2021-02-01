package com.company;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "Mean shark";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Alien invation";
    }
}

class MazeRunner extends Movie {
    public MazeRunner(String name) {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Runnin' mazes";
    }
}

public class Main {

    public static void main(String[] args) {

    }
}
