import java.util.Scanner;

public class ex5b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double KM_IN_NAUTICAL_MILES = 1.852;
        final double MILES_IN_NAUTICAL_MILES = 1.15077;
        double km;
        double miles;
        System.out.println("Enter the number of nautical miles: ");
        int nauticalMiles = sc.nextInt();
        km = nauticalMiles * KM_IN_NAUTICAL_MILES;
        miles = nauticalMiles * MILES_IN_NAUTICAL_MILES;
        System.out.println(nauticalMiles + " nautical miles equals " + km + "km or " + miles + " miles");
    }
}
