public class main {
    public static void main(String[] args) {

        boolean result = LeapYear.isLeapYear(-1600);
        System.out.println("The year -1600 is a Leap Year! - " + result);

        result = LeapYear.isLeapYear(1600);
        System.out.println("The year 1600 is a Leap Year! - " + result);

        result = LeapYear.isLeapYear(2017);
        System.out.println("The year 2017 is a Leap Year! - " + result);

        result = LeapYear.isLeapYear(2000);
        System.out.println("The year 2000 is a Leap Year! - " + result);
    }
}
