import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        double weight = scan.nextDouble();
		System.out.print("Enter your Height in cm: ");
        double height = scan.nextDouble();
		double heightinm = height / 100;
		double BMI = weight / (heightinm * heightinm);
		if( BMI <= 18.4 ){
		System.out.println(" Your BMI is " + BMI + " You are underweight");
		}
		else if( BMI >= 18.5 && BMI <= 24.9 ){
		System.out.println(" Your BMI is " + BMI + " You are Normal");
		}
	    else if( BMI >= 25.0 && BMI <= 39.9 ){
		System.out.println(" Your BMI is " + BMI + " You are overweight");
		}
		else{
		System.out.println(" Your BMI is " + BMI + " You are obese");
		}

        scan.close();
    }
}
