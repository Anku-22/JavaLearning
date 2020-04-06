public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum = 0;
            int lastDigit = (number % 10);
            int firstDigit = number;
            while (firstDigit > 9) {
                firstDigit = (firstDigit / 10);
            }
            sum = firstDigit + lastDigit;
            return sum;
        }
    }
}
