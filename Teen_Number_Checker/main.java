public class main{
    public static void main(String[] args) {

        boolean result = TeenNumberChecker.hasTeen(9, 99, 19);
        System.out.println("Any number between 13 and 19? - " + result);

        result = TeenNumberChecker.hasTeen(23, 15, 42);
        System.out.println("Any number between 13 and 19? - " + result);

        result = TeenNumberChecker.hasTeen(22, 23, 34);
        System.out.println("Any number between 13 and 19? - " + result);

        result = TeenNumberChecker.isTeen(9);
        System.out.println("Any number between 13 and 19? - " + result);

        result = TeenNumberChecker.isTeen(13);
        System.out.println("Any number between 13 and 19? - " + result);

    }
}
