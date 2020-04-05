public class main {
    public static void main(String[] arg) {

        boolean result = EqualSumChecker.hasEqualSum(1, 1, 1);
        System.out.println("The sum of first and second number is equal to third number ? - " + result);

        result = EqualSumChecker.hasEqualSum(1, 1, 2);
        System.out.println("The sum of first and second number is equal to third number ? - " + result);

        result = EqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println("The sum of first and second number is equal to third number ? - " + result);

    }
}
