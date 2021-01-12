package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car(); // you have to include new or it will crash
        Car holden = new Car();
        // porsche = null; this forces a crash
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
