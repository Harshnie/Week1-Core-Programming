import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scan.nextInt();
        int count = 0;
        while (number != 0) {
            number = number / 10; // Remove the last digit
            count++; // Increase count by 1
        }
        if (count == 0) {
            count = 1;
        }
        System.out.println("The number of digits is: " + count);
        scan.close();
    }
}
