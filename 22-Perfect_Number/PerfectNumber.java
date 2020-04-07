public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;

        for (int num = 1; num < number; num++) {
            if (number % num == 0) {
                sum += num;
            }
        }
        return (sum == number);
    }
}
