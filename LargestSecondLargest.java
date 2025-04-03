import java.util.Scanner;

public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;
        while (number != 0 && index < maxDigits) {
            digits[index] = number % 10;  
            number /= 10;  
            index++; 
        }
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; 
                largest = digits[i];  
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];  
            }
        }
        if (secondLargest == -1) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        }

        scan.close();
    }
}
