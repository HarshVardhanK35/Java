public class MethodOverloading {

    public static void main(String[] args) {
        // System.out.println( "5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        // System.out.println( "68in = " + convertToCentimeters(68) + "cm");

        getDurationString(0);
        getDurationString(0, 59);
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


    public static boolean getDurationString (int sec) {
        // "XXh YYm ZZs"
        boolean state = false;
        if (sec >= 0) {
            state = true;
            return state;
        }
        return state;
    }
    public static boolean getDurationString (int min, int sec) {

        boolean state = false;

        if (min >= 0 && (sec >= 0 || sec <= 59)) {
            state = true;
            return state;
        }
        return state;
    }
}

