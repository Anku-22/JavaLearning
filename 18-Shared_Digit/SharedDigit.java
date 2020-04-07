public class SharedDigit {

    public static boolean hasSharedDigit(int numA, int numB) {
        if ((numA < 10) || (numA > 99) || (numB < 10) || (numB > 99)) {
            return false;
        } else {

            int numALast = (numA % 10);
            int numAFirst = (numA / 10);

            int numBLast = (numB % 10);
            int numBFirst = (numB / 10);

            return ((numALast == numBLast) || (numALast == numBFirst) ||
                    (numAFirst == numBLast) || (numAFirst == numBFirst));
        }
    }
}
