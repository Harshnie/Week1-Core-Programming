import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scan.nextInt();

        // Check if the year is valid for the Gregorian calendar
        if (year >= 1582) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } 
		else {
            System.out.println(year + " is not a leap year.");
        }

        scan.close(); // Close the scanner object
    }
}