import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1));

            while (true) {
                System.out.print("Enter salary: ");
                salary[i] = scan.nextDouble();
                if (salary[i] <= 0) {
                    System.out.println("Invalid salary.Enter a positive value.");
                } else {
                    break;
                }
            }

            while (true) {
                System.out.print("Enter years of service: ");
                yearsOfService[i] = scan.nextDouble();
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service. Please enter a positive value.");
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);

        scan.close();
    }
}