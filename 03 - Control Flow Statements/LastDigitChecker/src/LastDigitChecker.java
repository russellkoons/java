public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (x < 10 || x > 1000 || y < 10 || y > 1000 || z < 10 || z > 1000) {
            return false;
        }

        if (x % 10 == y % 10 || x % 10 == z % 10 || y % 10 == z % 10) {
            return true;
        }

        return false;
    }
}
