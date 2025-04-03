import java.util.Scanner;

public class BMICalculatorTwoD{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = scan.nextInt();
        double[][] personData = new double[number][3]; // [height, weight, BMI]
        String[] weightStatus = new String[number];


        for (int i = 0; i < number; i++) {
            System.out.print("Enter height of person " + (i + 1) + ": ");
            personData[i][0] = scan.nextDouble();

            System.out.print("Enter weight of person " + (i + 1) + ": ");
            personData[i][1] = scan.nextDouble();

            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 35.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nPerson Details:");
        System.out.println("Height  Weight  BMI  Status");
        for (int i = 0; i < number; i++) {
            System.out.println(personData[i][0] + "  " + personData[i][1] + "  " + personData[i][2] + "  " + weightStatus[i]);
        }

        scan.close();
    }
}
