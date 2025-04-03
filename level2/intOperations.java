import java.util.Scanner;

public class intOperations{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = scan.nextInt();
		System.out.println("Enter second number: ");
		int b = scan.nextInt();
		System.out.println("Enter third number: ");
		int c = scan.nextInt();
		int result1 = a + b *c;
		int result2= a * b + c;
		int result3 = c + a / b;
		int result4 = a % b + c;
		System.out.println("The results of Int Operations are " + result1 + "," + result2 + ", " + result3 + " and " + result4);
		}
		}
