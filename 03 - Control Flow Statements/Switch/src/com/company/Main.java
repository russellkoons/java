package com.company;

public class Main {

    public static void main(String[] args) {
	    int value = 1;
	    if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

	    int switchValue = 1;

	    switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
        }

        // more code here
    }
}