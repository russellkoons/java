public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int original = number;
        while (number != 0) {
            reverse *= 10;
            int lastDigit = number % 10;
            reverse += lastDigit;
            number /= 10;
        }

        if (original == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
