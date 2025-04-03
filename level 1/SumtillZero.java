import java.util.Scanner;

public class SumtillZero{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0.0;
        double number;
        System.out.print("Enter a number: ");
        number = scan.nextDouble();
        while (number != 0) {
            total += number; 
            System.out.print("Enter a number : ");
            number = scanner.nextDouble(); 
        }
        System.out.println("Total sum: " + total);
    }
}
