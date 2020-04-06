public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        return (number % 2 != 0);
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((start > end) || (start <= 0) || (end <= 0)) {
            return -1;
        }
        for (int num = start; num <= end; num++) {
            if (SumOddRange.isOdd(num) == true) {
                sum += num;
            }
        }
        return sum;
    }
}
