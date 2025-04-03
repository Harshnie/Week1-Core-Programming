import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the employee's salary: ");
        double salary = scan.nextDouble();       
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scan.nextInt();
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The employee's bonus is: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }
    }
}
