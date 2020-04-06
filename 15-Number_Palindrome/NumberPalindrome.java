public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int numReverse = 0;
        int custom = number;

        while (custom != 0) {
            int numLastDigit = custom % 10;                 // get the ones digit
            numReverse = (numReverse * 10) + numLastDigit;  // add the digit on the one's place
            custom = custom / 10;                           // move to the tens digit and so on
            System.out.println("The number is : " + number + " " + numLastDigit + " " + numReverse);
        }

        if (numReverse == number) {
            return true;
        } else {
            return false;
        }
    }
}
