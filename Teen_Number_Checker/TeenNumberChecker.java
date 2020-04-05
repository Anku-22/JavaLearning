public class TeenNumberChecker {

    public static boolean hasTeen(int num1, int num2, int num3){
        /*
        return (((num1 >= 13) && (num1 <= 19)) ||
                ((num2 >= 13) && (num2 <= 19)) ||
                ((num3 >= 13) && (num3 <= 19)));
         */
        return (isTeen(num1) || isTeen(num2) || isTeen(num3));
    }

    public static boolean isTeen(int numPass) {
        return ((numPass >= 13) && (numPass <= 19));
    }

}
