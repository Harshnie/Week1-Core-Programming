import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            int sum = n * (n + 1) / 2;
            int sumWhileLoop = 0;
            int i = 1;
            while (i <= n) {
                sumWhileLoop += i;
                i++;
            }
            if (sum == sumWhileLoop) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("The computations don't match.");
            }
        }
        
    }
}
