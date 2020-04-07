public class LastDigitChecker {
    public static boolean hasSameLastDigit(int numA, int numB, int numC) {

        if ((!isValid(numA)) || (!isValid(numB)) || (!isValid(numC))) {
            return false;
        }

        int numALast = numA % 10;
        int numBLast = numB % 10;
        int numCLast = numC % 10;

        if ((numALast == numBLast) || (numALast == numCLast) || (numBLast == numCLast)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int number) {
        return ((number >= 10) && (number <= 1000));
    }
}
