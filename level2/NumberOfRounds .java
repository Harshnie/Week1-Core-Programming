import java.util.Scanner;

public class NumberOfRounds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first side of the triangle : ");
        double side1 = scan.nextDouble();
        System.out.print("Enter the second side of the triangle : ");
        double side2 = scan.nextDouble();
        System.out.print("Enter the third side of the triangle : ");
        double side3 = scan.nextDouble();
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; 
        double rounds = totalDistance / perimeter;
        System.out.println("The total number of rounds the athlete will run to complete 5 km is: " + rounds);
    }
}

