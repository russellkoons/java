package com.company;

public class Main {

    public static void main(String[] args) {
        int                      myVariable
                =
                50
                ;
        if (myVariable == 50) {
            System.out.println("Printed");
        }

        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more"); // Statements can be multi-line
        // You can also add multiple statements on one line, but it is bad practice
        int anotherVariable = 5; myVariable--; System.out.println("This is another one");

        // indenting is important, but I knew this already
    }
}
