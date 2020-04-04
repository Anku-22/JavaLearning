public class main {

    public static void main(String[] args) {
        boolean same = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println("Are the three decimal digits same? - " + same);

        same = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println("Are the three decimal digits same? - " + same);

        same = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println("Are the three decimal digits same? - " + same);

        same = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println("Are the three decimal digits same? - " + same);
    }
}
