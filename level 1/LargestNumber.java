import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scan.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scan.nextInt();
        boolean num1largest = (number1 > number2 && number1 > number3);
		boolean num2largest = (number2 > number1 && number2 > number3);
		boolean num3largest = (number3 > number1 && number3 > number2);
		System.out.println("Is the first number the largest? " + num1largest);
        System.out.println("Is the second number the largest? " + num2largest);
        System.out.println("Is the third number the largest? " + num3largest);
        
    }
}
