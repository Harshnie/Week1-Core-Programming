import java.util.Scanner;

public class Salary{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter Salary: ");
		int Salary = scan.nextInt();
		System.out.println("Enter the bonus amount: ");
		int Bonus = scan.nextInt();
		int income = Salary + Bonus;
		System.out.println("The salary is INR " + Salary + " and bonus is INR " + Bonus + ". Hence Total Income is INR " + income);
		}
		}
	
