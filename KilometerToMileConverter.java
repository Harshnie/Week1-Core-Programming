import java.util.Scanner;

public class KilometerToMileConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        double kilometers = scan.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
    }
}
