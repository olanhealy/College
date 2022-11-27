
public class Exercise5_9 {
    public static void main(String[] args ) {
    System.out.println("Feet     Meters    |    Meters    Feet ");
    System.out.println("_________________________________________");
    System.out.println("1.0      " + footToMeter(1) + "     |    20.0      " + meterToFoot(20));
    System.out.println("2.0      " + footToMeter(2) + "      |    25.0      " + meterToFoot(25));
    System.out.println("...");
    System.out.println("9.0      " + footToMeter(9.0) + "     |    60.0      " + meterToFoot(60.));
    System.out.println("10.0     " + footToMeter(10.0) + "      |    65.0      " + meterToFoot(65));

    }
    public static double footToMeter(double foot) { //foot to meter conversion
    double meter = 0.305 * foot;
    return meter;
    }
    public static double meterToFoot(double meter) { //meter to foot conversion
    double foot = 3.279 * meter;
    return foot;
    }
}
