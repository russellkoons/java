package com.company;

public class Main {

    public static void main(String[] args) {
	    int count = 1;

	    while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

	    for (int i = 1; i < 6; i++) {
            System.out.println("Count value is " + i);
        }

        count = 1;
	    // while true causes an infinite loop, but we included a break
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        // do while will always execute at least one time
        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);

        int number = 0;
        int finishNumber = 20;
        count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                // continue skips to the next iteration
                continue;
            }

            count++;
            System.out.println("Even number " + number);

            if (count == 5) {
                // break ends the loop
                break;
            }
        }
    }

    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
}
