import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scan.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = scan.nextDouble();
        System.out.print("Enter the time ");
        double time = scan.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is " + simpleInterest + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + 
                           " and Time " + time);
    }
}
