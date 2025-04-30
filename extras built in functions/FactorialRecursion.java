import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        int number = getInput();
        long result = calculateFactorial(number);
        displayResult(number, result);
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public static void displayResult(int num, long result) {
        System.out.println("The factorial of " + num + " is: " + result);
    }
}
