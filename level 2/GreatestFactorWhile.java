import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scan.nextInt();
        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
        } else {
            int greatestFactor = 1; 
            int counter = number - 1; 
            while (counter >= 1) {
                if (number % counter == 0) { 
                    greatestFactor = counter; 
                    break; 
                }
                counter--; 
            }
            System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        }
    }
}
