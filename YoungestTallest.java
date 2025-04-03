import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = scan.nextInt();
            System.out.print("Enter height of " + friends[i] + " (in cm): ");
            heights[i] = scan.nextDouble();
        }
        int minAge = ages[0];
        String youngest = friends[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = friends[i];
            }
        }
        double maxHeight = heights[0];
        String tallest = friends[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = friends[i];
            }
        }
        System.out.println("\nYoungest friend: " + youngest + " (Age: " + minAge + ")");
        System.out.println("Tallest friend: " + tallest + " (Height: " + maxHeight + " cm)");
    }
}
