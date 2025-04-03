import java.util.Scanner;

public class StoreValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numbers = new double[10]; 
        double total = 0.0;
        int index = 0; 
        while (true) {
            System.out.print("Enter a number : ");
            double input = scan.nextDouble();

            if (input <= 0) {
                break;
            }
            if (index < 10) {
                numbers[index] = input;
                index++; 
            } else {
                System.out.println("Array is full!!");
                break;
            }
        }
        System.out.println("The numbers you entered are:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " "); 
            total += numbers[i]; 
        }
        System.out.println("\nTotal sum: " + total);
        scan.close(); 
    }
}
