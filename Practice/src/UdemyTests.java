public class UdemyTests {

    public static void main(String[] args) {
//        positiveNegativeZero(1);
//        speedConversion(1);
//        printMegaBytesAndKiloBytes(2500);
        shouldWakeUp(true, 24);
    }

    // test - 1
    public static void positiveNegativeZero (int number) {

        // System.out.println((number > 0) ? "positive" : (number < 0) ? "negative" : "zero");

        if (number > 0){
            System.out.println("positive");
        }
        else if (number < 0) {
            System.out.println("negative");
        }
        else {
            System.out.println("zero");
        }
    }

    // test-2
    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1 ;
        }
        return (Math.round(kilometersPerHour / 1.609));
    }

    public static void speedConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }

        int megabytes = kiloBytes / 1024;
        int remainingKilobytes = kiloBytes % 1024;
        System.out.println(megabytes + " " +remainingKilobytes);
    }

    public static boolean shouldWakeUp (boolean isBarking, int hoursOfDay) {
        boolean bool = true;
        if (isBarking == true) {
            if (hoursOfDay < 0 || hoursOfDay > 23){
                return bool;
            }
        }
        return bool;
    }
}