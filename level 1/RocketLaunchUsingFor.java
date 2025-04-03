import java.util.Scanner;

public class RocketLaunchUsingFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the starting counter value: ");
		int counter = scan.nextInt();
		
	  for (int i = counter; i > 0; i--)
	  {
            System.out.println(i);
        }
		System.out.println("Launch!!!");
		}
		}
		