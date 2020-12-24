public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }

        if (number % 2 == 0) {
            return false;
        }

        return true;
    }
}
