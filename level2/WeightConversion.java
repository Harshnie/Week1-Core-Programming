import java.util.Scanner;

public class WeightConversion{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
		double weight = scan.nextDouble();
		double kg = weight * 2.2;
		System.out.println("The weight of the person in pound is " + weight + " and in kg is " +kg);
		}
		}
		