public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }

        int HCF = first;
        if (first > second) {
            HCF = second;
        }

        for (int num = HCF; num != 0; num--) {
            if ((first % num == 0) && (second % num == 0)) {
                HCF = num;
                break;
            }
        }
        return HCF;
    }
}
