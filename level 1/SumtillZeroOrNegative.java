import java.util.Scanner;

public class SumtillZeroOrNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number : ");
            double number = scan.nextDouble();
            if (number <= 0) {
                break; 
            }
            total += number;
        }
        System.out.println("Total sum: " + total);
    }
}
