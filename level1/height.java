import java.util.Scanner;
public class height {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		double heightininches = height/2.54;
		double heightinfeet = heightininches/12;
		System.out.println("Your Height in cm is " +height + " while in feet is " +heightinfeet+ " and inches is " +heightininches);
		}
		}
		