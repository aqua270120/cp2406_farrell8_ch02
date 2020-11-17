import java.util.Scanner;

public class ex6b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int INCHES_IN_FOOT = 12;
        int feet;
        int inchesLeft;
        System.out.println("Enter inches");
        int inches = sc.nextInt();
        feet = inches / INCHES_IN_FOOT;
        inchesLeft = inches % INCHES_IN_FOOT;
        System.out.println(inches + " inches is " +
                feet + " feet and " + inchesLeft + " inches");
    }
}
