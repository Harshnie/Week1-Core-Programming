import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();

        LocalDate date = LocalDate.parse(inputDate);

        LocalDate newDate = date.plusDays(7)
                               .plusMonths(1)
                               .plusYears(2)
                               .minusWeeks(3);

        System.out.println("Original Date: " + date);
        System.out.println("New Date after adding 7 days, 1 month, and 2 years, then subtracting 3 weeks: " + newDate);

        scanner.close();
    }
}
