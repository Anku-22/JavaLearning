
public class MegabyteConverter {

    public static void printMegaBytesAndKiloBytes(int kiloByte) {
        if (kiloByte < 0) {                             // check parameter kiloBytes is less than 0
            System.out.println("Invalid Value");
        } else {
            int megaByte = (kiloByte / 1024);           // represents the calculated megabytes
            int remKiloByte = (kiloByte % 1024);        // represents the calculated remaining kilobytes

            System.out.println(kiloByte + " KB = " + megaByte + " MB and " + remKiloByte + " KB");
        }
    }
}
