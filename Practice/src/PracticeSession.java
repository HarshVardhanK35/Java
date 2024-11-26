public class PracticeSession {
    public static void main (String[] args) {
        double firstValue = 20.00;
        double secondValue = 80.00;

        double step3 = (firstValue + secondValue) * 100.00;
        System.out.println(step3);

        double step4 = step3 % 40.00;
        System.out.println(step4);

        boolean step5 = (step4 == 0) ? true : false;
        System.out.println(step5);

        if(!step5) {
            System.out.println("Got some remainder!");
        }
    }
}
