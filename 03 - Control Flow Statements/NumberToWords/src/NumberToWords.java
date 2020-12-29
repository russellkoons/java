public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reversed = reverse(number);
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
    }

    public static int reverse(int number) {

    }

    public static int getDigitCount(int number) {

    }
}
