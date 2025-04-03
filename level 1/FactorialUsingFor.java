import java.util.Scanner;

public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scan.nextInt();
        if (n < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            
            // Print the factorial
            System.out.println("Factorial of " + n + " is " + factorial);
        }
    }
}
