import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = scan.nextDouble();
        System.out.print("Enter the height of the triangle : ");
        double height = scan.nextDouble();
        double areaInCm2 = 0.5 * base * height;
        double areaInInches2 = areaInCm2 / (2.54*2.54);
        System.out.println("The area of the triangle is " + areaInCm2 + " square centimeters (cm²) and " + areaInInches2 + " square inches (in²).");
    }
}
