public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        if (number == 0) {
            System.out.println("Zero");
        }

        int digits = getDigitCount(number);
        int reversed = reverse(number);
        int reversedDigits = getDigitCount(reversed);
        int difference = digits - reversedDigits;

        while (reversed != 0) {
            int mod = reversed % 10;
            if (mod == 0) {
                System.out.println("Zero");
            } else if (mod == 1) {
                System.out.println("One");
            } else if (mod == 2) {
                System.out.println("Two");
            } else if (mod == 3) {
                System.out.println("Three");
            } else if (mod == 4) {
                System.out.println("Four");
            } else if (mod == 5) {
                System.out.println("Five");
            } else if (mod == 6) {
                System.out.println("Six");
            } else if (mod == 7) {
                System.out.println("Seven");
            } else if (mod == 8) {
                System.out.println("Eight");
            } else if (mod == 9) {
                System.out.println("Nine");
            }
            reversed /= 10;
        }

        if (difference > 0) {
            for (int i = 0; i < difference; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int original = number;

        if (number < 0) {
            number *= -1;
        }

        int reversed = 0;
        while (number != 0) {
            reversed *= 10;
            reversed += (number % 10);
            number /= 10;
        }

        if (original < 0) {
            reversed *= -1;
        }

        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }

        return count;
    }
}
