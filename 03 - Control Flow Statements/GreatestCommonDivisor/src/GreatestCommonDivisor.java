public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int x, int y) {
        if (x < 10 || y < 10) {
            return -1;
        }

        int divisor = 0;

        for (int i = 1; i < x; i++) {
            if (x % i == 0 && y % i == 0) {
                divisor = i;
            }
        }

        return divisor;
    }
}
