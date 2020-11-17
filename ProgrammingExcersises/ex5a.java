public class ex5a {
    public static void main(String[] args) {
        final double KM_IN_NAUTICAL_MILES = 1.852;
        final double MILES_IN_NAUTICAL_MILES = 1.150779;
        int nauticalMiles = 200;
        double km;
        double miles;
        km = nauticalMiles * KM_IN_NAUTICAL_MILES;
        miles = nauticalMiles * MILES_IN_NAUTICAL_MILES;
        System.out.println(nauticalMiles + " nautical miles equals " + km + "km or " + miles + " miles");
    }
}
