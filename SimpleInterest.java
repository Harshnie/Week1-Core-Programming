import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        double principal = scan.nextDouble();    
        System.out.print("Enter the Rate of Interest: ");
        double rate = scan.nextDouble();       
        System.out.print("Enter the Time (in years): ");
        double time = scan.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest for Principal " + principal + 
                           ", Rate of Interest " + rate + "% and Time " + time + 
                           " years is " + simpleInterest);
    }
}
