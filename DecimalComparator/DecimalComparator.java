public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        return ((int) (num1 * 1000d)) == ((int) (num2 * 1000d));
    }
}
