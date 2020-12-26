package com.company;

public class Main {

    public static void main(String[] args) {
	    int count = 1;

	    while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

//	    for (int i = 1; i < 6; i++) {
//            System.out.println("Count value is " + i);
//      }

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

        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(7));
        System.out.println(isEvenNumber(28));
    }

    public static boolean isEvenNumber(int n) {
        while (n % 2 == 0) {
            return true;
        }

        return false;
    }
}
