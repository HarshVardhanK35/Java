public class MethodOverloading {

    public static void main(String[] args) {
        // System.out.println( "5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        // System.out.println( "68in = " + convertToCentimeters(68) + "cm");

        // getDurationString(-3945);                                    // test-1
        // getDurationString(-65, 45);                                  // test-2
        // getDurationString(65, 145);                     // test-3
        getDurationString(4045);                                    // test-1

        // System.out.println(area(5.0));
        // System.out.println(area(-1));
        // System.out.println(area(5.0, 4.0));
        // System.out.println(area(-1.0, 4.0));
    }

    // challenge-1
    public static double convertToCentimeters (int heightInches) {
        return heightInches * 2.54;
    }
    public static double convertToCentimeters (int heightFeet, int heightInches) {

        // return convertToCentimeters((heightFeet * 12) + heightInches);
        int totalInches = (heightFeet * 12) + heightInches;
        return convertToCentimeters(totalInches);
    }

    // challenge-2
    public static void getDurationString (int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid input: " + (seconds) + " \nSeconds must be greater than zero");
        }
        else {
            getDurationString(seconds / 60, seconds % 60);
        }
    }
    public static void getDurationString (int minutes, int seconds) {

        if ((minutes < 0)) {
            System.out.println("Invalid input: " + (minutes) + " \nMinutes must be greater than zero");
        }
        else if ((seconds < 0 || seconds > 59) ) {
            System.out.println("Invalid input: " + (seconds) + " \nSeconds must be between 0 and 59");
        }
        else {
            int hours = minutes / 60;
            int remainMinutes = minutes % 60;

            System.out.println(hours + "h " + remainMinutes + "m " + seconds + "s");
        }
    }

    // Udemy-Tests
    // ---------------------------------------------------------------------------------------------------------
    // test-1 areas of circle and rectangle
    public static double area (double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return (Math.PI * (radius * radius));
    }
    public static double area (double x, double y) {
        if (x < 0 || y < 0){
            return -1.0;
        }
        return (x * y);
    }

    // test-2
    // Minutes To Years and Days Calculator
    
}

