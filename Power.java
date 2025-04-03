import java.util.Scanner;

public class Power{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = scan.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scan.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("The result is " + result);
    }
}
