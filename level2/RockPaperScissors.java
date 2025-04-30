import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of games to play: ");
        int numGames = scanner.nextInt();
        
        String[][] results = playGames(numGames);
        displayResults(results, numGames);
    }

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0: Rock, 1: Paper, 2: Scissors
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            case 2: return "Scissors";
            default: return "Invalid";
        }
    }

    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }
        if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
            (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] playGames(int numGames) {
        Scanner scanner = new Scanner(System.in);
        int userWins = 0;
        int computerWins = 0;
        int draws = 0;

        String[][] gameResults = new String[numGames][3];
        
        for (int i = 0; i < numGames; i++) {
            System.out.println("\nGame " + (i + 1) + ":");
            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
            String userChoice = scanner.nextLine().trim();

            while (!(userChoice.equalsIgnoreCase("Rock") || 
                     userChoice.equalsIgnoreCase("Paper") || 
                     userChoice.equalsIgnoreCase("Scissors"))) {
                System.out.print("Invalid choice, please enter Rock, Paper, or Scissors: ");
                userChoice = scanner.nextLine().trim();
            }
            
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            gameResults[i][0] = "Game " + (i + 1);
            gameResults[i][1] = winner;
            gameResults[i][2] = "User: " + userChoice + ", Computer: " + computerChoice;

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }
        }

        String[][] results = new String[2][4];
        results[0][0] = "User Wins";
        results[0][1] = Integer.toString(userWins);
        results[0][2] = "Computer Wins";
        results[0][3] = Integer.toString(computerWins);

        double userWinPercentage = ((double) userWins / numGames) * 100;
        double computerWinPercentage = ((double) computerWins / numGames) * 100;

        results[1][0] = "User Win Percentage";
        results[1][1] = String.format("%.2f", userWinPercentage) + "%";
        results[1][2] = "Computer Win Percentage";
        results[1][3] = String.format("%.2f", computerWinPercentage) + "%";

        return results;
    }

    public static void displayResults(String[][] results, int numGames) {
        System.out.println("\nGame Results:");
        System.out.println("Game   | Winner   | Choices");
        System.out.println("-------------------------------");
        
        for (int i = 0; i < numGames; i++) {
            System.out.println(results[i][0] + " | " + results[i][1] + " | " + results[i][2]);
        }

        System.out.println("\nSummary:");
        System.out.println(results[0][0] + ": " + results[0][1] + " | " + results[0][2] + ": " + results[0][3]);
        System.out.println(results[1][0] + ": " + results[1][1] + " | " + results[1][2] + ": " + results[1][3]);
    }
}
