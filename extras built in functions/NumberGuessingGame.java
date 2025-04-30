import java.util.*;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lower = 1;
        int upper = 100;
        boolean correct = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("The computer will try to guess it.");
        System.out.println("Respond with: high / low / correct");

        while (!correct && lower <= upper) {
            int guess = generateGuess(lower, upper);
            System.out.println("Computer guesses: " + guess);
            String feedback = getUserFeedback(scanner);

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Hooray! The computer guessed your number: " + guess);
                correct = true;
            } else if (feedback.equalsIgnoreCase("low")) {
                lower = guess + 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                upper = guess - 1;
            } else {
                System.out.println("Invalid input. Please respond with: high / low / correct");
            }
        }

        if (!correct) {
            System.out.println("There seems to be a contradiction in your responses.");
        }

        scanner.close();
    }

    public static int generateGuess(int lower, int upper) {
        Random rand = new Random();
        return rand.nextInt(upper - lower + 1) + lower;
    }

    public static String getUserFeedback(Scanner scanner) {
        System.out.print("Your feedback (high/low/correct): ");
        return scanner.nextLine().trim();
    }
}
