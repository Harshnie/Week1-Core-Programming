import java.util.Scanner;

public class SumUsingFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            int sum = n * (n + 1) / 2;
            int sumForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumForLoop += i;
            }
            if (sum == sumForLoop) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("The computations don't match.");
            }
        }
    }
}
