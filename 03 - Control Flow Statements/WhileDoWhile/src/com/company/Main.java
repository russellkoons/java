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
        System.out.println(sumDigits(123));
    }

    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            // extract least significant digit
            sum += number % 10;

            // drop the least significant number
            number /= 10;
        }

        return sum;
    }
}
