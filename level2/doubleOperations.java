import java.util.Scanner;

public class doubleOperations{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double a = scan.nextDouble();
		System.out.println("Enter second number: ");
		double b = scan.nextDouble();
		System.out.println("Enter third number: ");
		double c = scan.nextDouble();
		double result1 = a + b *c;
		double result2= a * b + c;
		double result3 = c + a / b;
		double result4 = a % b + c;
		System.out.println("The results of Double Operations are " + result1 + "," + result2 + ", " + result3 + " and " + result4);
		}
		}
