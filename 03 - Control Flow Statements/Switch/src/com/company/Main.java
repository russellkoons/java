package com.company;

import java.util.Locale;

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

	    int switchValue = 3;

	    switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                // break cuts the code and moves to end of the block
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            // Can do multiple cases at once
            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            // This is basically else
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char switchChar = 'E';

	    switch (switchChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(switchChar + " was found");
                break;

            default:
                System.out.println("A, B, C, D, or E were not found");
                break;
        }

        String month = "JANUARY";

	    // toUpperCase also works
	    switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
                break;
        }
    }
}
