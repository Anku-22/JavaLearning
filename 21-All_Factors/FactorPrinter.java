public class FactorPrinter {

    public static final String ERROR_MSG = "Invalid Value";

    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println(FactorPrinter.ERROR_MSG);
        } else {
            String result = "";

            for (int num = 1; num <= number; num++) {
                if (number % num == 0) {
                    result = (result + Integer.toString(num) + " ");
                }
            }
            System.out.println(result);
        }
    }
}
