public class UdemyTests {

    public static void main(String[] args) {
        // positiveNegativeZero(1);
        // speedConversion(1);
        // printMegaBytesAndKiloBytes(2500);
        // shouldWakeUp(true, 22);
        isLeapYear(2016);
    }

    // test - 1
    public static void positiveNegativeZero(int number) {

        // System.out.println((number > 0) ? "positive" : (number < 0) ? "negative" : "zero");

        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    // test-2
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return (Math.round(kilometersPerHour / 1.609));
    }

    public static void speedConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    // test-3
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }

        int megabytes = kiloBytes / 1024;
        int remainingKilobytes = kiloBytes % 1024;
        System.out.println(megabytes + " " + remainingKilobytes);
    }

    // there is an error with following code while running on IntelliJ, but not on Udemy terminal
    // test-4
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean status = false;
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking && hourOfDay < 8 || hourOfDay > 22) {
            status = true;
            return status;
        }
        return status;
    }

    // test-5
    public static void isLeapYear(int year) {

        if (year <= 1 || year >= 9999) {
            System.out.println("Not in range");
        }
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("Leap");
            } else {
                if (year % 400 == 0) {
                    System.out.println("Leap");
                } else {
                    System.out.println("Not a leap");
                }
            }
        } else {
            System.out.println("Not a leap");
        }
    }

    // test-6
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        long conNum1 = (long) (num1 * 1000);
        long conNum2 = (long) (num2 * 1000);

        return (conNum1 == conNum2) ? true : false;
    }

    // test-7
    public static boolean hasEqualSum(int num1, int num2, int num3) {

        if ((num1 + num2) == num3) {
            return true;
        } else {
            return false;
        }
    }

    // test-8 -- my solution
    public static boolean teenOrNot(int age1, int age2, int age3) {
        if ((age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean wasTeen(int age) {
        if (age >= 13 && age <= 19) {
            return true;
        } else {
            return false;
        }
    }

    // test-8 --- Udemy solution

    public static boolean hasTeen(int a, int b, int c) {
        if (isTeen(a) || isTeen(b) || isTeen(c)) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isTeen(int number) {
        if (number > 12 && number < 20) {
            return true;
        }
        else {
            return false;
        }
    }
}