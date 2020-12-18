public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        one = one * Math.pow(10, 3);
        two = two * Math.pow(10, 3);
        if (one == two) {
            return true;
        } else {
            return false;
        }
    }
}
