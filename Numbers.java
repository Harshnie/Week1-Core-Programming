import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
            if (numbers[i] < 0) {
                System.out.println("Negative number.");
            } else if (numbers[i] > 0) {
                System.out.println("The number is positive.");
                if (numbers[i] % 2 == 0) {
                    System.out.println("The number is even.");
                } else {
                    System.out.println("The number is odd.");
                }
            } else {
                System.out.println("The number is zero.");
            }
        }
        System.out.println("\nComparison of first and last elements:");
        if (numbers[0] > numbers[4]) {
            System.out.println("First number is greater than the last number.");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("First number is less than the last number.");
        } else {
            System.out.println("First number is equal to the last number.");
        }

        scan.close();
    }
}
