import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight in kg for person " + (i + 1) + ":");
            data[i][0] = sc.nextDouble();
            System.out.println("Enter height in cm for person " + (i + 1) + ":");
            data[i][1] = sc.nextDouble();
        }

        String[][] bmiData = computeBMIAndStatus(data);
        displayBMIData(bmiData);
    }

    public static String[][] computeBMIAndStatus(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;
            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);

            if (bmi <= 18.4) {
                result[i][3] = "Underweight";
            } else if (bmi <= 24.9) {
                result[i][3] = "Normal";
            } else if (bmi <= 39.9) {
                result[i][3] = "Overweight";
            } else {
                result[i][3] = "Obese";
            }
        }

        return result;
    }

    public static void displayBMIData(String[][] bmiData) {
        System.out.println("BMI Report:");
        System.out.println("-------------------------------------------------");
        System.out.println("Height(cm)  Weight(kg)   BMI       Status");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(bmiData[i][0] + "         " + bmiData[i][1] + "         " + bmiData[i][2] + "     " + bmiData[i][3]);
        }
    }
}
