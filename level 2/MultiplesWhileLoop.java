import java.util.Scanner;

public class MultiplesWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = scan.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            int counter = 99; 
            while (counter > 0) {
                if (counter % number == 0) { 
                    System.out.print(counter + " ");
                }
                counter--; 
            }
        }
    }
}
