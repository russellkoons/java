package com.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(boolean engine, int cylinders) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = 4;
    }



    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
