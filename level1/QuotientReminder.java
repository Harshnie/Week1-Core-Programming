import java.util.Scanner;

public class QuotientReminder{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scan.nextInt();
		int quotient = num1/num2;
		int reminder = num1%num2;
		System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + " of two number " + num1 + " and " + num2");
		}
		}
		
		