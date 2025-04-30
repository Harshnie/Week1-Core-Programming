import java.util.Scanner;

public class StudentVoting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] ages = getAges(scanner);
        String[][] votingStatus = checkVotingEligibility(ages);
        displayVotingStatus(votingStatus);
    }

    public static int[] getAges(Scanner scanner) {
        int[] ages = new int[10];
        System.out.println("Enter the ages of 10 students:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Cannot Vote (Invalid Age)";
            } else if (ages[i] >= 18) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Can Vote";
            } else {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Cannot Vote";
            }
        }
        
        return result;
    }

    public static void displayVotingStatus(String[][] votingStatus) {
        System.out.println("\nStudent Voting Eligibility:");
        System.out.printf("%-10s%-20s\n", "Age", "Voting Status");
        
        for (String[] status : votingStatus) {
            System.out.printf("%-10s%-20s\n", status[0], status[1]);
        }
    }
}
