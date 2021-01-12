package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car(); // you have to include new or it will crash
        Car holden = new Car();
        // porsche = null; this forces a crash
        porsche.setModel("Carrera");
        System.out.println(porsche.getModel());
    }
}
