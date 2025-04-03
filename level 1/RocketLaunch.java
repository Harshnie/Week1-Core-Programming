import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the starting counter value: ");
		int counter = scan.nextInt();
		
		while (counter > 0) {
		System.out.println(counter);
		counter--;
		}
		
		System.out.println("Launch!!!");
		}
		}
		