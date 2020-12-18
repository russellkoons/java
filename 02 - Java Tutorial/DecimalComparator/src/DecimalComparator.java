public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        int first = (int)(one * 1000);
        int second = (int)(two * 1000);
        if (first == second) {
            return true;
        } else {
            return false;
        }
    }
}
