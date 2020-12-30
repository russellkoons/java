public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        int divisor = 2;
        while (divisor < number) {
            if (number % divisor != 0) {
                divisor++;
            } else {
                number = number / divisor;
                divisor = 2;
            }
        }

        return number;
    }
}
