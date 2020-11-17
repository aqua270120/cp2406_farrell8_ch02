import java.util.*;
public class ex4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int QUARTS_IN_GALLON = 4;
        int gallonsNeeded;
        int extraQuartsNeeded;
        System.out.println("Enter quarts needed");
        int quartsNeeded = sc.nextInt();
        gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
        System.out.println("A job that needs " + quartsNeeded +
                " quarts requires " + gallonsNeeded + " gallons plus " +
                extraQuartsNeeded + " quarts.");
    }
}
