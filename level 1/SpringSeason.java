import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month : ");
        String month = scanner.next();
        System.out.print("Enter the day: ");
        int day = scanner.nextInt();
        month = month.toLowerCase();
        boolean isSpring = (month.equals("march") && day >= 20 && day <= 31) ||  
                           (month.equals("april") && day >= 1 && day <= 30) ||  
                           (month.equals("may") && day >= 1 && day <= 31) ||   
                           (month.equals("june") && day >= 1 && day <= 20);     
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
