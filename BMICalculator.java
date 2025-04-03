import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = scan.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height of person " + (i + 1) + ": ");
            height[i] = scan.nextDouble();

            System.out.println("Enter weight of person " + (i + 1) + ": ");
            weight[i] = scan.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 35.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\nPerson Details:");
        System.out.println("Height  Weight BMI  Status");
        for (int i = 0; i < n; i++) {
            System.out.println(height[i] + "  " + weight[i] + "  " + bmi[i] + "  " + status[i]);
        }

        scan.close();
    }
}
