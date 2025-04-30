import java.util.Scanner;

public class ArrayIndex{

    public static void generateException(String[] names) {
        System.out.println("Accessing name at index 10: " + names[10]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing name at index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("Enter 5 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = scan.next();
        }

        
        handleException(names);

        scan.close();
    }
}
