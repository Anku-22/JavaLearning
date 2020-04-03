public class main {
    public static void main(String[] args) {
        boolean output = BarkingDog.shouldWakeUp(true,1);
        System.out.println("Returned : " + output);
        output = BarkingDog.shouldWakeUp(false,2);
        System.out.println("Returned : " + output);
        output = BarkingDog.shouldWakeUp(true,8);
        System.out.println("Returned : " + output);
        output = BarkingDog.shouldWakeUp(true,-1);
        System.out.println("Returned : " + output);
    }
}
