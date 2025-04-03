import java.util.Scanner;

public class TemperatureConversionFtoC{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature in farenheit: ");
		double farenheit = scan.nextDouble();
		double celsius =  (farenheit - 32) * 5/9 ;
		System.out.println("The " + farenheit + " farenheit is " + celsius + " celsius ");
		}
		}
		
