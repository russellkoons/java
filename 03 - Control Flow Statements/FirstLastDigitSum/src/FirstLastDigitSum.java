public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int original = number;
        int first = 0;
        int last = 0;

        while (number != 0) {
            if (original == number) {
                first = number % 10;
            }

            if (number / 10 == 0) {
                last = number;
            }

            number /= 10;
        }

        return first + last;
    }
}
