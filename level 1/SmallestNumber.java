import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scan.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scan.nextInt();
        boolean isSmallest = (number1 < number2 && number1 < number3);
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
