import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        if (number < 0) {
            number = -number;
        }

       
        int[] frequency = new int[10];

        int temp = number;
        while (temp > 0) {
            int digit = temp % 10; 
            frequency[digit]++;    
            temp /= 10;            
        }
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        scan.close();
    }
}
