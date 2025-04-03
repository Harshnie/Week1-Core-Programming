import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base number : ");
        int number = scan.nextInt();
        
        System.out.print("Enter the exponent : ");
        int power = scan.nextInt();
        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers only.");
        } else {
            int result = 1; 
            for (int i = 1; i <= power; i++) {
                result *= number; 
            }
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
    }
}
