import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scan.nextDouble();
        double yardsPerFoot = 1.0 / 3.0; 
        double milesPerFoot = 1.0 / (1760 * 3); 
        double distanceInYards = distanceInFeet * yardsPerFoot;
        double distanceInMiles = distanceInFeet * milesPerFoot;
        System.out.println("The distance is " + distanceInYards + " yards and " + distanceInMiles + " miles for the given " + distanceInFeet + " feet.");

    }
}
