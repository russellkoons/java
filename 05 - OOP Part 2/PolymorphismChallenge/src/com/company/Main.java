package com.company;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(boolean engine, int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car -> start engine"
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
