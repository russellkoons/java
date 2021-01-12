package com.company;

public class Car {
    private int doors; // state components
    private int wheels; // private keeps classes outside of the class from accessing the variables
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }
}
