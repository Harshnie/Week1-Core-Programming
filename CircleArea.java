import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scan.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle with radius " + radius + " is " + area);
    }
}
