import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int amarAge = scan.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        int amarHeight = scan.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = scan.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int akbarHeight = scan.nextInt();      
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scan.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int anthonyHeight = scan.nextInt();
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("The youngest friend is Amar");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("The youngest friend is Akbar");
        } else {
            System.out.println("The youngest friend is Anthony");
        }
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("The tallest friend is Amar");
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("The tallest friend is Akbar");
        } else {
            System.out.println("The tallest friend is Anthony");
        }


    }
}
