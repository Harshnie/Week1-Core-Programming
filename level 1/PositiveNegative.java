import java.util.Scanner;

public class PositiveNegative{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
		if (number > 0) {
		System.out.println("The number is positive");
		}
		else if (number < 0)  {
		System.out.println("The number negative");
		}
		else  {
		System.out.println("The number is zero ");
		}
	}
}	
	
