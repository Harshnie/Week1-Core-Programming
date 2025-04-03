import java.util.Scanner;
public class collegeFee {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int fee = scan.nextInt();
        int discountPercent = scan.nextInt();
        int discount = fee * discountPercent / 100; 
        int discountAmount = fee - discount; 
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + discountAmount);
    }
}
