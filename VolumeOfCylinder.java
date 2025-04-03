import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scan.nextDouble();
		System.out.print("Enter the height of the cylinder: ");
		double height = scan.nextDouble();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("The volume of cylinder with radius of " + radius + " is " + volume);
    }
}
