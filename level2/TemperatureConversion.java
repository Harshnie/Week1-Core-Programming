import java.util.Scanner;

public class TemperatureConversion{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature in Celsius: ");
		double celsius = scan.nextDouble();
		double FarenheitResult = (celsius * 9/5) + 32;
		System.out.println("The " + celsius + " celsius is " + FarenheitResult + " fahrenheit ");
		}
		}
		
