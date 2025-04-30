import java.util.Random;

public class StudentGrade {

    public static void main(String[] args) {
        int numStudents = 5;

        int[][] scores = generateRandomScores(numStudents);
        double[][] totalsAveragesPercentages = calculateTotalAveragePercentage(scores);
        String[][] grades = calculateGrades(totalsAveragesPercentages);

        displayScorecard(scores, totalsAveragesPercentages, grades);
    }

    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(50) + 50;
            scores[i][1] = random.nextInt(50) + 50;
            scores[i][2] = random.nextInt(50) + 50;
        }

        return scores;
    }

    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        int numStudents = scores.length;
        double[][] totalsAveragesPercentages = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;

            totalsAveragesPercentages[i][0] = Math.round(total * 100.0) / 100.0;
            totalsAveragesPercentages[i][1] = Math.round(average * 100.0) / 100.0;
            totalsAveragesPercentages[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return totalsAveragesPercentages;
    }

    public static String[][] calculateGrades(double[][] totalsAveragesPercentages) {
        int numStudents = totalsAveragesPercentages.length;
        String[][] grades = new String[numStudents][1];

        for (int i = 0; i < numStudents; i++) {
            double percentage = totalsAveragesPercentages[i][2];

            if (percentage <= 39) {
                grades[i][0] = "R - Remedial";
            } else if (percentage >= 40 && percentage <= 49) {
                grades[i][0] = "E - Level 1: Too Below Agency Normalized Standards";
            } else if (percentage >= 50 && percentage <= 59) {
                grades[i][0] = "D - Level 1: Well Below Agency Normalized Standards";
            } else if (percentage >= 60 && percentage <= 69) {
                grades[i][0] = "C - Level 2: Below but Approaching Agency Normalized Standards";
            } else if (percentage >= 70 && percentage <= 79) {
                grades[i][0] = "B - Level 3: At Agency Normalized Standards";
            } else if (percentage >= 80) {
                grades[i][0] = "A - Level 4: Above Agency Normalized Standards";
            }
        }

        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] totalsAveragesPercentages, String[][] grades) {
        System.out.println("Scorecard of Students:");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Student | Physics | Chemistry | Maths | Total | Average | Percentage | Grade");
        System.out.println("-------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%7d | %7d | %9d | %5d | %5.2f | %7.2f | %10.2f | %s\n", 
                              (i + 1), 
                              scores[i][0], scores[i][1], scores[i][2], 
                              totalsAveragesPercentages[i][0], 
                              totalsAveragesPercentages[i][1], 
                              totalsAveragesPercentages[i][2], 
                              grades[i][0]);
        }
    }
}
