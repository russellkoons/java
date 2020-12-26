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

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);
    }
}
