public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sumEven = 0;
            while (number > 0) {
                int lastDigit = (number % 10);
                if (lastDigit % 2 == 0) {
                    sumEven += lastDigit;
                }
                number = number / 10;
            }
            return sumEven;
        }
    }
}
