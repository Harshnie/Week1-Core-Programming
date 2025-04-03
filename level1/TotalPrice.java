import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the unit price of the item : ");
        double unitPrice = scan.nextDouble();
        System.out.print("Enter the quantity : ");
        int quantity = scan.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}
